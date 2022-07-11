package com.example.shoppingmall_springboot.repository;

import com.example.shoppingmall_springboot.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByMemberId(Long memberId);
}
