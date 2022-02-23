package main.swole_squad.dao;
import java.net.URL;
import java.net.http.HttpResponse;

import main.swole_squad.models.Event;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;



public class googleCalDAO implements DAO {



    OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
    Request request = new Request.Builder()
            .url("https://www.googleapis.com/calendar/v3/calendars/devinmbutts@gmail.com/events")
            .method("GET", null)
            .addHeader("Authorization", "Bearer ya29.A0ARrdaM8O0zqjHtI-GINLGkQit45vLhws7wc5tGCOK6_EveB1ikiYWY98WjagOgu1LVqFJy07iv3E3M4X8pbYfN1P3tsi2EfBV6wbxyEnkmFyW_hjx0QUDfb5iyxfVcJFJlPjbFSnnMJCp-u3ACMH1VygWVbk")
            .build();
    Response response = client.newCall(request).execute();

}
