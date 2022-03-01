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
                .url("https://www.googleapis.com/calendar/v3/calendars/devinmbutts@gmail.com/events")
                .method("GET", null)
                .addHeader("Authorization", "Bearer ya29.A0ARrdaM_KvcxcVRC3KwZi0FNeyxi9R7ok9vTp6HBlWUwGB-ePqiIzYizMCVEqo0uyKctK2_lJB1jxQROJ_Dxd3reZ9pg8iylti7nLtUcbRu782bipdLjk3xrtD8LnZBSZ9F6Q90iYo8Bd4CNqyUgcybUdSbkw")
                .build();
        ResponseBody responseBody = client.newCall(request).execute().body();

        //Map Object to Calendar Class
        ObjectMapper newObjectMapper = new ObjectMapper();
        newObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); //Will Ignore Undefined Objects

        Calendar newCalendar = newObjectMapper.readValue(responseBody.string(), Calendar.class);

        //Get Array Of Events
        Event[] events = newCalendar.getEvents();
        //convert to array list
        List<Event> eventList = Arrays.asList(events);
        //Sort List Of Events
        eventList.sort(new Comparator<Event>() {
            public int compare(Event e1, Event e2) {
                // notice the cast to (Integer) to invoke compareTo
                return (e1.getStart().getDate()).compareTo(e2.getStart().getDate());
            }
        });


        return eventList;
    }


}
