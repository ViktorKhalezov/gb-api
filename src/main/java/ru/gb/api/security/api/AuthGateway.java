package ru.gb.api.security.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.gb.api.security.dto.AuthenticationUserDto;

public interface AuthGateway {

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthenticationUserDto authenticationUserDto); {

}