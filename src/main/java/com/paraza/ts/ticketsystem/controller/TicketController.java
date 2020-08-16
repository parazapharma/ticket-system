package com.paraza.ts.ticketsystem.controller;

import com.paraza.ts.ticketsystem.entity.Ticket;
import com.paraza.ts.ticketsystem.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/ticket-system")
public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/tickets")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @PostMapping("/create-ticket")
    @ResponseStatus(value = HttpStatus.OK)
    public Ticket createTicket(@RequestBody @Valid Ticket ticket) {
        return ticketService.createTicket(ticket);
    }
}
