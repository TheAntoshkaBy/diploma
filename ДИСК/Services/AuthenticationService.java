package com.epam.service;

import java.util.Map;

import com.epam.dto.request.AuthenticationDTO;
import com.epam.dto.request.create.CreateUserDTO;

public interface AuthenticationService {

    Map<Object, Object> logIn(AuthenticationDTO requestDTO);

    Map<Object, Object> singUp(CreateUserDTO request);

    void logOut(String userName);
}
