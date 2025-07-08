package com.example.Event_Planner.service.impl;

import com.example.Event_Planner.dto.EventDto;
import com.example.Event_Planner.model.Event;
import com.example.Event_Planner.repository.EventRepository;
import com.example.Event_Planner.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public EventDto addEvent(EventDto eventDto) {
        Event event = new Event();
        event.setEventName(eventDto.getEventName());
        event.setName(eventDto.getName());
        event.setDate(eventDto.getDate());
        event.setTime(eventDto.getTime());
        event.setLocation(eventDto.getLocation());
        event.setStatus(eventDto.getStatus());
        eventRepository.save(event);
        return eventDto;
    }

    @Override
    public EventDto searchEvent(String name) {
        Event event = eventRepository.findByName(name);
        EventDto eventDto = new EventDto();
        eventDto.setName(event.getName());
        eventDto.setEventName(event.getEventName());
        eventDto.setDate(event.getDate());
        eventDto.setTime(event.getTime());
        eventDto.setLocation(event.getLocation());
        eventDto.setStatus(event.getStatus());
        return eventDto;
    }

    @Override
    public EventDto updateEvent(EventDto eventDto) {
        Event event = eventRepository.findByName(eventDto.getName());

        event.setStatus(eventDto.getStatus());
        event.setEventName(eventDto.getEventName());
        event.setDate(eventDto.getDate());
        event.setTime(eventDto.getTime());
        event.setLocation(eventDto.getLocation());

        Event updatedEvent = eventRepository.save(event);
        
        EventDto updatedEventDto = new EventDto();
        updatedEventDto.setName(updatedEvent.getName());
        updatedEventDto.setEventName(updatedEvent.getEventName());
        updatedEventDto.setDate(updatedEvent.getDate());
        updatedEventDto.setTime(updatedEvent.getTime());
        updatedEventDto.setLocation(updatedEvent.getLocation());
        updatedEventDto.setStatus(updatedEvent.getStatus());
        return updatedEventDto;
    }

    @Override
    public List<EventDto> getAllEvents() {
        List<Event> events = eventRepository.findAll();
        List<EventDto> eventDtos = new ArrayList<>();
        for (Event event : events) {
            EventDto eventDto = new EventDto();
            eventDto.setName(event.getName());
            eventDto.setEventName(event.getEventName());
            eventDto.setDate(event.getDate());
            eventDto.setTime(event.getTime());
            eventDto.setLocation(event.getLocation());
            eventDto.setStatus(event.getStatus());
            eventDtos.add(eventDto);
        }
        return eventDtos;
    }

    @Override
    public void deleteEvent(String name) {
        eventRepository.deleteByName(name);

    }
}
