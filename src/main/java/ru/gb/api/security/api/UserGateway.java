package ru.gb.api.security.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.gb.api.security.dto.UserDto;
import java.util.List;


public interface UserGateway {

    @GetMapping
    public List<UserDto> getUserList();

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUser(@PathVariable("userId") Long id);

    @PostMapping
    public ResponseEntity<?> handlePost(@Validated @RequestBody UserDto userDto);

    @PutMapping("/{userId}")
    public ResponseEntity<?> handleUpdate(@PathVariable("userId") Long id, @Validated @RequestBody UserDto userDto);

    @DeleteMapping("/{userId}")
    public void deleteById(@PathVariable("userId") Long id);

}