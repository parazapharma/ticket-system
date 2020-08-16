package com.paraza.ts.ticketsystem.dao;

import com.paraza.ts.ticketsystem.entity.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
