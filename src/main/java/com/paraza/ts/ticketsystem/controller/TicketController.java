package com.paraza.ts.ticketsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/ticket-system")
public class TicketController {

    @GetMapping("/tickets")
    @ResponseStatus(value = HttpStatus.OK)
    public String getAllTickets() {
        return "all tickets";
    }
}
