package com.food.ordering.system.order.service.domain.event;

import com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderPaidEvents extends OrderEvents {

    public OrderPaidEvents(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
