package ru.gb.api.order.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.gb.api.order.dto.OrderDto;

import java.util.List;

public interface OrderGateway {


    @GetMapping
    List<OrderDto> getOrderList(@CookieValue(value = "jwt") String jwt);

    @GetMapping("/{orderId}")
    ResponseEntity<OrderDto> getOrder(@PathVariable("orderId") Long id);

    @PostMapping
    ResponseEntity<OrderDto> handlePost(@Validated @RequestBody OrderDto orderDto, @CookieValue(value = "jwt")  String jwt);

    @PutMapping("/{orderId}")
    ResponseEntity<OrderDto> handleUpdate(@PathVariable("orderId") Long id,
                                          @Validated @RequestBody OrderDto orderDto);

    @DeleteMapping("/{orderId}")
    void deleteById(@PathVariable("orderId") Long id);
}
