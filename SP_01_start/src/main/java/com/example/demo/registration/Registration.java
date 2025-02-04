package com.example.demo.registration;

public record Registration(
        Integer id,
        Integer productId,
        String ticketCode,
        String attendee
) {
}
