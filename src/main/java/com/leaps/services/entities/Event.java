package com.leaps.services.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity(name = "events")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @Column(name = "event_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;

    @Column
    @NonNull
    private String address;

    @Column(name = "coord_lat")
    @NonNull
    private String coordLat;

    @Column(name = "coord_lnt")
    @NonNull
    private String coordLnt;

    @Column
    @NonNull
    private String date;

    @Column(name = "date_created")
    private String dateCreated;

    @Column
    @NonNull
    private String description;

    @Column(name = "event_image_url")
    private String eventImageUrl;

    @Column(name = "firebase_topic")
    private String firebaseTopic;

    @Column(name = "free_slots")
    private Integer freeSlots;

    @Column(name = "owner_id")
    @NonNull
//    @OneToOne(cascade = CascadeType.ALL) TODO add fk
//    @JoinColumn(name = "users", referencedColumnName = "user_id")
    private Long ownerId;

    @Column(name = "price_from")
    private Double priceFrom;

    @Column(name = "time_from")
    @NonNull
    private String timeFrom;

    @Column(name = "time_to")
    @NonNull
    private String timeTo;

    @Column
    private String title;

}