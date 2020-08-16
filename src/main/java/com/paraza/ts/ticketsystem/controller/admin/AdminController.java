package com.paraza.ts.ticketsystem.controller.admin;

import com.paraza.ts.ticketsystem.entity.Ticket;
import com.paraza.ts.ticketsystem.entity.User;
import com.paraza.ts.ticketsystem.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/admin")
public class AdminController {

    private UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    @ResponseStatus(value = HttpStatus.OK)
    public String getAllUsers() {
        return "all users";
    }

    @PostMapping("/create-user")
    @ResponseStatus(value = HttpStatus.OK)
    public User createUser(@RequestBody @Valid User user) {
        return userService.createUser(user);
    }
}
