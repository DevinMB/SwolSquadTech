//TODO: WOOOOOOO!!!!


import dao.dao_googleCal;
import models.Calendar;
import models.Event;

import java.io.IOException;
import java.util.List;

public class Main {




    //MAIN
    public static void main(String[] args) throws IOException {
        System.out.println("Lets Gooooooooo");

        //Populate Events
        List<Event> eventList = new dao_googleCal().getEvents();

        //Print out list of events!!
        for (Event event : eventList){
            System.out.println(event.getEventName() + " " + event.getStart().getDisplayDate());

        }

    }

}
