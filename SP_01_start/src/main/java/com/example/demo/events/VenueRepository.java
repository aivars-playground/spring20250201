package com.example.demo.events;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VenueRepository {

    private final List<Venue> venues = List.of(
            new Venue(1, "venue1", "address street"),
            new Venue(2, "venue2", "next doors")
    );

    public Optional<Venue> findById(int id) {
        return venues.stream()
                .filter(venue -> venue.id() == id)
                .findAny();
    }
}
