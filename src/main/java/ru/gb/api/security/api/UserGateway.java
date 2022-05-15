package ru.gb.api.security.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.gb.gb.api.security.UserDto;
import java.util.List;


public interface UserGateway {

    @GetMapping
    public List<UserDto> getUserList();

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable("userId") Long id);

    @PostMapping
    public ResponseEntity<UserDto> handlePost(@Validated @RequestBody UserDto userDto);

    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> handleUpdate(@PathVariable("userId") Long id, @Validated @RequestBody UserDto userDto);

    @DeleteMapping("/{userId}")
    public void deleteById(@PathVariable("userId") Long id);

}