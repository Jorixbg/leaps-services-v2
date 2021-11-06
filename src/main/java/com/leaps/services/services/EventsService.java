package com.leaps.services.services;

import com.leaps.services.entities.Event;
import com.leaps.services.repositories.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventsService {

    @Autowired
    EventsRepository eventsRepository;

    public List<Event> fetchAllEvents() {
        List<Event> resultList = new ArrayList<>();
        Iterable<Event> result = eventsRepository.findAll();
        result.forEach(resultList::add);
        return resultList;
    }

    public List<Event> fetchEventsByOwnerId(Long ownerId) {
        return eventsRepository.findByOwnerId(ownerId);
    }

    private ZonedDateTime parseDate(String millis) {
        return Instant.ofEpochMilli(Long.valueOf(millis))
                .atZone( ZoneId.of("UTC"));
    }
}
