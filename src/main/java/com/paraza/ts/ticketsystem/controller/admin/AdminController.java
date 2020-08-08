package com.paraza.ts.ticketsystem.controller.admin;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/admin")
public class AdminController {

    @GetMapping("/users")
    @ResponseStatus(value = HttpStatus.OK)
    public String getAllUsers() {
        return "all users";
    }
}
