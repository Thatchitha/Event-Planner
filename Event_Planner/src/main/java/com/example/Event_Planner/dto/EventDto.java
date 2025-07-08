package com.example.Event_Planner.dto;

public class EventDto {
    private String name;
    private String eventName;
    private String date;
    private String time;
    private String location;
    private Status status;

    public EventDto(String name, String eventName, String date, String time, String location, Status status) {
        this.name = name;
        this.eventName = eventName;
        this.date = date;
        this.time = time;
        this.location = location;
        this.status = status;
    }

    public EventDto() {
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
