package dao;
////TODO:https://howtodoinjava.com/gson/gson-parse-json-array/
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Event;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

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
                .url("https://www.googleapis.com/calendar/v3/calendars/devinmbutts@gmail.com/events")
                .method("GET", null)
                .addHeader("Authorization", "Bearer ya29.A0ARrdaM8YENnx2VdrBoMa1VI6hgYwzwtXbl7DP6rFU6mCxkrGyJ_VUMHdJ88C-jcwoKR86mU8_QQixfkPSmoJRL521J8cdHgtSNIR7Ye6ypZcFmzSRhuF70Cy8cblOo2xUmXhnNbr8riWFsZLRwuhtkwkDfNO")
                .build();
        Response response = client.newCall(request).execute();
        //I think this is a JSON object below??

        System.out.println(response);


        Gson gson = new Gson();
        if(response.isSuccessful()) {
            ResponseBody responseBody = client.newCall(request).execute().body();
            Event entity = gson.fromJson(responseBody.string(), Event.class);
            System.out.println(entity.getSummary());
        }
        //TODO: https://stackoverflow.com/questions/23070298/get-nested-json-object-with-gson-using-retrofit
        //TODO: Convert JSON to List of Events (Define Event in Models Folder)

        return null;
    }


}
