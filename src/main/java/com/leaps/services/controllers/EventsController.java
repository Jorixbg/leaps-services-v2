package com.leaps.services.controllers;

import com.leaps.services.entities.Event;
import com.leaps.services.services.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
