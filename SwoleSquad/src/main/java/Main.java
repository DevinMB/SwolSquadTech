//TODO: WOOOOOOO!!!!


import dao.dao_googleCal;
import models.Calendar;

import java.io.IOException;
import java.util.List;

public class Main {


    //TODO: NEED TO CALL DAO 'N STUFF

    //MAIN
    public static void main(String[] args) throws IOException {
        System.out.println("heyoooo");
        List<Calendar> listOfCalendars = dao_googleCal.getEvents();

        //run stuff
    }

}
