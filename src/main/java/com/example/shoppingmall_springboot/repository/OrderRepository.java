package com.example.shoppingmall_springboot.repository;

import com.example.shoppingmall_springboot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
