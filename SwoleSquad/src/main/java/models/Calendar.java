package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Calendar {
    //Instance Variables
    @JsonProperty("summary")
    private String calendarName;
    @JsonProperty("items")
    private Event[] events;

    //Constructors
    //Default

    //Getters & Setters

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }


    //Methods



}

