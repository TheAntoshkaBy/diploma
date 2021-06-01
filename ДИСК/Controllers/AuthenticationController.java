package com.epam.controller;

import javax.validation.Valid;

import com.epam.dto.request.AuthenticationDTO;
import com.epam.dto.request.create.CreateUserDTO;
import com.epam.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@CrossOrigin
public class AuthenticationController {

    final AuthenticationService authenticationService;

    public AuthenticationController(
            AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping(value = "/login")
    public ResponseEntity login(@RequestBody AuthenticationDTO request) {
        return ResponseEntity.ok().body(authenticationService.logIn(request));
    }

    @PostMapping(value = "/singUp")
    public ResponseEntity singUp(@RequestBody @Valid CreateUserDTO userDTO) {
        return ResponseEntity.ok().body(authenticationService.singUp(userDTO));
    }

    @PostMapping(value = "/logOut/{userName}")
    public ResponseEntity logOut(@PathVariable String userName) {
        authenticationService.logOut(userName);
        return ResponseEntity.ok().build();
    }
}
