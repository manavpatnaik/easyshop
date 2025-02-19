package com.springapi.easyshop.service.order;

import com.springapi.easyshop.dto.OrderDto;
import com.springapi.easyshop.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
