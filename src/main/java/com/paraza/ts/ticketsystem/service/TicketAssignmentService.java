package com.paraza.ts.ticketsystem.service;

import com.paraza.ts.ticketsystem.dao.TicketAssignmentRepository;
import com.paraza.ts.ticketsystem.entity.TicketAssignment;
import org.springframework.stereotype.Service;

@Service
public class TicketAssignmentService {

    private TicketAssignmentRepository ticketAssignmentRepository;

    public TicketAssignmentService(TicketAssignmentRepository ticketAssignmentRepository) {
        this.ticketAssignmentRepository = ticketAssignmentRepository;
    }

    public TicketAssignment createAssignment(TicketAssignment ticketAssignment) {
        return ticketAssignmentRepository.save(ticketAssignment);
    }
}
