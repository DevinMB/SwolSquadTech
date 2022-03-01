package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Start {
    //Instance Variables
    private Date date;
    private Date dateTime;
//    private Date startDate;

    //Constructor

    //Default

    //Getters
    public Date getDate()  {
        Date dateHandled = null;
        if (isNull(dateTime) & isNull(date)) {
            try {
                dateHandled = new SimpleDateFormat("dd/MM/yyyy").parse("30/12/1999");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else if (isNull(dateTime) & nonNull(date)) {
            dateHandled = date;
        } else if (nonNull(dateTime) & isNull(date)) {
            dateHandled = dateTime;
        }


        return dateHandled;
    }



}
