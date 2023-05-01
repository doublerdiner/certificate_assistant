package com.codeclan.certificateassistant.controllers;

import com.codeclan.certificateassistant.models.User;
import com.codeclan.certificateassistant.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }
    @PutMapping (value = "/users/{id}")
    public ResponseEntity<User> updateUser(
            @PathVariable Long id,
            @RequestBody User user
    ){
        User updateUser = userRepository.findById(id).get();
        updateUser.setName(user.getName());
        updateUser.setClients(user.getClients());
        userRepository.save(updateUser);
        return new ResponseEntity<>(updateUser, HttpStatus.ACCEPTED);
    }
}
