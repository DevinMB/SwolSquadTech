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


    public Date getDate() {
        return date;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public Date getDisplayDate(){
        Date displayDate = null;

        if(isNull(this.date)){
            displayDate = this.dateTime;
        } else {
            displayDate = this.date;
        }
        return displayDate;
    }
}
