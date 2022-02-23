package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Event;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.sql.DataSource;

public class dao_googleCal {






    public static List<Event> getEvents() throws IOException {
        //Create Empty List Of Events
        List<Event> listOfEvents = new ArrayList<>();



        //POSTMAN LIST EVENTS COPY
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://www.googleapis.com/calendar/v3/users/me/calendarList")
                .method("GET", null)
                .addHeader("Authorization", "Bearer ya29.A0ARrdaM_cGkP4d6B2fQ80El6Y--XiG9cWKQps2rR1HwBTnEJUhKMN3Yw9Ix683rRRDGLCS0uO6FHcnHFsqOu-8T0AEsIfbXPj8TzNZlgyt8b3SOeV5ZZKtoabb8FimB0X-cixbyb-dRLwjrSbgCl2-LKjy6HR")
                .build();
        //I think this is a JSON object below??
        Response response = client.newCall(request).execute();

        Gson gson = new Gson();
//TODO:https://howtodoinjava.com/gson/gson-parse-json-array/
//
//        Type eventListType = new TypeToken<ArrayList<Event>>(){}.getType();

        List<Event> events = gson.fromJson(response.toString(), );

       //new Gson().fromJson(String.valueOf(response),Event.class);



        System.out.println(response.body().string());
//TODO: Convert JSON to List of Events (Define Event in Models Folder)



        return events;
    }


}
