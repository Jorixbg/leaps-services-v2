package com.leaps.services.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "events")
@Data
public class Event {

    @Id
    @Column(name = "event_id")
    private Long eventId;

    @Column
    private String address;

    @Column(name = "coord_lat")
    private String coordLat;

    @Column(name = "coord_lnt")
    private String coordLnt;

    @Column
    private String date;

    @Column(name = "date_created")
    private String dateCreated;

    @Column
    private String description;

    @Column(name = "event_image_url")
    private String eventImageUrl;

    @Column(name = "firebase_topic")
    private String firebaseTopic;

    @Column(name = "free_slots")
    private Integer freeSlots;

    @Column(name = "owner_id")
    private Long ownerId;

    @Column(name = "price_from")
    private Double priceFrom;

    @Column(name = "time_from")
    private String timeFrom;

    @Column(name = "time_to")
    private String timeTo;

    @Column
    private String title;

}