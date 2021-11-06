package com.leaps.services.controllers;

import com.leaps.services.entities.Event;
import com.leaps.services.services.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("events")
public class EventsController {

    @Autowired
    EventsService eventsService;

    @GetMapping(produces = "application/json")
    public List<Event> fetchAllEvents() {
        return eventsService.fetchAllEvents();
    }

    @PostMapping(produces = "application/json")
    public Long createEvent(Event event) {
        return eventsService.createEvent(event);
    }

    @GetMapping(value = "/{ownerId}", produces = "application/json")
    public List<Event> fetchEventsByOwnerId(@PathVariable Long ownerId) {
        return eventsService.fetchEventsByOwnerId(ownerId);
    }

}
