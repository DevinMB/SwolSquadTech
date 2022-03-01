package dao;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Calendar;
import models.Event;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.*;


public class dao_googleCal {


    public  List<Event> getEvents() throws IOException {
        //Create Empty List Of Events
        List<Calendar> listOfCalendars = new ArrayList<>();

        //OKHTTP GET REQUEST
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://www.googleapis.com/calendar/v3/calendars/devinmbutts%40gmail.com/events?orderBy=startTime&singleEvents=true&maxResults=2500&timeMin=2020-01-01T10%3A00%3A00-07%3A00")
                .method("GET", null)
                .addHeader("Authorization", "Bearer ya29.A0ARrdaM_633ggtvmhXTZfbrLnhEr2RzL0o8rrCTFQ_g76cdgfupZ-HzQXnKPgxS6ASr16ZBzQGg6dAyVl6SVdV3UdTW9wdkGsaP5FvRQBQU9icrCRDhoWBrnbwE6Rx1RMp3Nt1TzFKSVxZEEfk14lYPQ8Z_ey")
                .build();
        //Response response = client.newCall(request).execute();
        ResponseBody responseBody = client.newCall(request).execute().body();

        //Map Object to Calendar Class
        ObjectMapper newObjectMapper = new ObjectMapper();
        newObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); //Will Ignore Undefined Objects

        Calendar newCalendar = newObjectMapper.readValue(responseBody.string(), Calendar.class);

        //Get Array Of Events
        Event[] events = newCalendar.getEvents();
        //convert to array list
        List<Event> eventList = Arrays.asList(events);



        return eventList;
    }


}
