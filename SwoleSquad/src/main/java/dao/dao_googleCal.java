package dao;

import models.Event;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
                .addHeader("Authorization", "Bearer ya29.A0ARrdaM8O0zqjHtI-GINLGkQit45vLhws7wc5tGCOK6_EveB1ikiYWY98WjagOgu1LVqFJy07iv3E3M4X8pbYfN1P3tsi2EfBV6wbxyEnkmFyW_hjx0QUDfb5iyxfVcJFJlPjbFSnnMJCp-u3ACMH1VygWVbk")
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response);

//TODO: Convert JSON to List of Events (Define Event in Models Folder)



        return null;
    }


}
