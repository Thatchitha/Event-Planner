package com.example.Event_Planner.controller;

import com.example.Event_Planner.dto.EventDto;
import com.example.Event_Planner.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
@CrossOrigin("*")

public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/add")
    public EventDto addEvent(@RequestBody EventDto eventDto) {
        return eventService.addEvent(eventDto);
    }

    @GetMapping("/search")
    public EventDto searchEvent(@RequestParam("name") String name) {
        return eventService.searchEvent(name);
    }

    @PutMapping("/update")
    public EventDto updateEvent(@RequestBody EventDto eventDto) {
        return eventService.updateEvent(eventDto);
    }

    @DeleteMapping("/delete")
    public void deleteEvent(@RequestParam("name") String name) {
        eventService.deleteEvent(name);

    }

    @GetMapping("/get/all")
    public List<EventDto> getAllEvents() {
        return eventService.getAllEvents();
    }
}
