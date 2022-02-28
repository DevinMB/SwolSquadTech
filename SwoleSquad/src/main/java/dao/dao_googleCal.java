package dao;
////TODO:https://howtodoinjava.com/gson/gson-parse-json-array/
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Calendar;
import models.Event;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class dao_googleCal {


    public static List<Calendar> getEvents() throws IOException {
        //Create Empty List Of Events
        List<Calendar> listOfCalendars = new ArrayList<>();



        //POSTMAN LIST EVENTS COPY
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://www.googleapis.com/calendar/v3/calendars/devinmbutts@gmail.com/events")
                .method("GET", null)
                .addHeader("Authorization", "Bearer ya29.A0ARrdaM_YUccf0ablMUH9eSujsrPwcs7oBdfG0eVfxdbommw9yUUUhEOnHGUn5xOSIH_UbYUsM4DpmrlqI9aTsOztcClPB0Vy2jvpo0SgFhP0Kg0wMWRh_eDqERBDIN45DD0efEXk1NOP2gj_i-aZEUw9jaDt")
                .build();
        ResponseBody responseBody = client.newCall(request).execute().body();
        ObjectMapper newObjectMapper = new ObjectMapper();
        newObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); //Will Ignore Undefined Objects
        assert responseBody != null;
        Calendar newCalendar = newObjectMapper.readValue(responseBody.string(), Calendar.class);
        Event[] events = newCalendar.getEvents();

//        import java.util.*;
//
//        public class SimpleTesting {
//            public static void main (String[] args) {
//                List<String> dateArray = new ArrayList<String>();
//                dateArray.add("2020-03-25");
//                dateArray.add("2019-01-27");
//                dateArray.add("2020-03-26");
//                dateArray.add("2020-02-26");
//                System.out.println("The Object before sorting is : "
//                        + dateArray);
//                Collections.sort(dateArray);
//                System.out.println("The Object after sorting is : "
//                        + dateArray);
//            }
//        }


        for (Event event : events){
            System.out.println(event.getEventName() + " " + event.getStart().getDate());

        }
        return null;
    }


}
