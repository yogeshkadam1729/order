package com.roboelectric.order.service;

import com.roboelectric.order.dto.*;
import com.roboelectric.order.entity.Order;
import com.roboelectric.order.mapper.OrderMapper;
import com.roboelectric.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Autowired
    RestTemplate restTemplate;

    public OrderDTO placeOrder(OrderFrontEndDTO orderFrontEndDTO)
    {
        int orderId = sequenceGenerator.generateNextOrderId();
        UserDTO user = fetchUserDetailsFromSystem(orderFrontEndDTO.getUserId());
        Order order = new Order(orderId,orderFrontEndDTO.getDevices(),orderFrontEndDTO.getShop(),user);
        orderRepository.save(order);
        return OrderMapper.INSTANCE.mapOrderToOrderDTO(order);

    }

    private UserDTO fetchUserDetailsFromSystem(int userId) {
       return restTemplate.getForObject("http://SHOPS-SERVICE/users/getUser/"+userId, UserDTO.class);
    }


}
