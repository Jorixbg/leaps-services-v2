package com.leaps.services.repositories;

import com.leaps.services.entities.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventsRepository extends CrudRepository<Event, Long> {
    List<Event> findByOwnerId(Long ownerId);
}
