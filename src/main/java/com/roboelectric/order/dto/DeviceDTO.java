package com.roboelectric.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDTO {
    private int id;
    private DeviceType deviceType;
    private String deviceName;
    private DeviceCategory deviceCategory;
    private String deviceNo;
}
