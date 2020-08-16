package com.paraza.ts.ticketsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Integer userId;

    private String firstName;

    private String lastName;

    private String email;

    private UserType userType;

 }
