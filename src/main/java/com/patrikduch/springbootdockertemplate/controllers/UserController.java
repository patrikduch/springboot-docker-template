package com.patrikduch.springbootdockertemplate.controllers;

import com.patrikduch.springbootdockertemplate.models.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public ResponseEntity<UserModel> getUsers() {

        var users =  new ArrayList<UserModel>();

        var firstUser = new UserModel();
        firstUser.setId(1L);
        firstUser.setUsername("patrikducha");

        var secondUser = new UserModel();
        secondUser.setId(2L);
        secondUser.setUsername("patriknovak");

        users.add(firstUser);
        users.add(secondUser);

        return new ResponseEntity(users, HttpStatus.OK);
    }
}
