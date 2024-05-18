package com.roboelectric.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderFrontEndDTO {

    private List<DeviceDTO> devices;
    private ShopsDTO shop;
    private int userId;

}
