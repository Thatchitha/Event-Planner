package com.example.Event_Planner.service;

import com.example.Event_Planner.dto.EventDto;

import java.util.List;

public interface EventService {
    public EventDto addEvent(EventDto eventDto);
    public EventDto searchEvent(String name);
    public EventDto updateEvent(EventDto eventDto);
    public List<EventDto> getAllEvents();
    public void deleteEvent(String name);
}
