package com.roboelectric.order.controller;

import com.roboelectric.order.dto.OrderDTO;
import com.roboelectric.order.dto.OrderFrontEndDTO;
import com.roboelectric.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("order")
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/placeOrder")
    public ResponseEntity<OrderDTO> addDevice(@RequestBody OrderFrontEndDTO orderFrontEndDTO)
    {
        return new ResponseEntity<>(orderService.placeOrder(orderFrontEndDTO), HttpStatus.CREATED);
    }
}
