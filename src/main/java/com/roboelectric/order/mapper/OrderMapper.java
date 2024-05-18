package com.roboelectric.order.mapper;


import com.roboelectric.order.dto.OrderDTO;
import com.roboelectric.order.dto.OrderFrontEndDTO;
import com.roboelectric.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);

    OrderDTO mapOrderToOrderDTO(Order order);


}
