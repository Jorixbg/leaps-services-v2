package com.leaps.services.repositories;

import com.leaps.services.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventsRepository extends CrudRepository<Event, Long> {
}
