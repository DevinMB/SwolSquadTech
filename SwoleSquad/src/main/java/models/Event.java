package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
    //Instance Variables
    @JsonProperty("summary")
    private String eventName;
    private Start start;

    //Constructors

    //Getters //Setters

    public String getEventName() {
        return eventName;
    }

    public Start getStart() {
        return start;
    }
}
