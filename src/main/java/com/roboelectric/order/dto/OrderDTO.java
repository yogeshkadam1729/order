package com.roboelectric.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private int orderId;
    private List<DeviceDTO> devices;
    private ShopsDTO shop;
    private UserDTO user;
}
