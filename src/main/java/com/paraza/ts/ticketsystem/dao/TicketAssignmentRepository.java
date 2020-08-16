package com.paraza.ts.ticketsystem.dao;

import com.paraza.ts.ticketsystem.entity.TicketAssignment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketAssignmentRepository extends CrudRepository<TicketAssignment, Integer> {
}
