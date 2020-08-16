package com.paraza.ts.ticketsystem.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Ticket {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private UUID ticketid;

    //@Column(name = "created_date")
    private LocalDateTime datec;

    private Status status;

    private String issue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UUID getTicketid() {
        return ticketid;
    }

    public void setTicketid(UUID ticketid) {
        this.ticketid = ticketid;
    }

    public LocalDateTime getDatec() {
        return datec;
    }

    public void setDatec(LocalDateTime datec) {
        this.datec = datec;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
}
