package com.example.demo.events;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    private final OrganizerRepository organizerRepository;

    public EventController(OrganizerRepository organizerRepository) {
        this.organizerRepository = organizerRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/organizers")
    public List<Organizer> getOrganizers() {
        return organizerRepository.findAll();
    }


}
