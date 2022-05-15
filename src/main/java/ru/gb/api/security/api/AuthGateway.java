package ru.gb.api.security.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.gb.gb.api.security.AuthenticationUserDto;


public interface AuthGateway {


    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthenticationUserDto authenticationUserDto);

}