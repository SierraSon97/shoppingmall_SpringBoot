package com.example.shoppingmall_springboot.repository;

import com.example.shoppingmall_springboot.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
