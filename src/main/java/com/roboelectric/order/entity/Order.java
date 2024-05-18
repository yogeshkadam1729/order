package com.roboelectric.order.entity;

import com.roboelectric.order.dto.DeviceDTO;
import com.roboelectric.order.dto.ShopsDTO;
import com.roboelectric.order.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "order")
public class Order {

    private int orderId;
    private List<DeviceDTO> devices;
    private ShopsDTO shop;
    private UserDTO user;


}
