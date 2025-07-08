package com.example.Event_Planner.model;

import com.example.Event_Planner.dto.Status;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "eventList")

public class Event {
    @Id
    private String id;
    private String name;
    private String eventName;
    private String date;
    private String time;
    private String location;
    private Status status;

    public Event(String id, String name, String eventName, String date, String time, String location, Status status) {
        this.id = id;
        this.name = name;
        this.eventName = eventName;
        this.date = date;
        this.time = time;
        this.location = location;
        this.status = status;
    }

    public Event() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
