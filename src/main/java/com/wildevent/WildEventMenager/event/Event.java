package com.wildevent.WildEventMenager.event;

import com.wildevent.WildEventMenager.location.model.Location;
import com.wildevent.WildEventMenager.user.WildUser;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;

    @Lob
    @Column(length = 1000)
    private String description;

    private LocalDateTime startsAt;
    private LocalDateTime endsAt;

    @ManyToOne
    private Location location;

    private boolean accepted;

    @ManyToOne
    private WildUser userProposing;

    @ManyToMany
    private List<WildUser> organizer;

}