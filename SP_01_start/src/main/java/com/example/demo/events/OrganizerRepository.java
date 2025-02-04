package com.example.demo.events;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrganizerRepository {
    private final List<Organizer> organizers = List.of(
            new Organizer(1, "org_1", "large company"),
            new Organizer(2, "org_2", "small company")
    );

    public List<Organizer> findAll() {
        return organizers;
    }
}
