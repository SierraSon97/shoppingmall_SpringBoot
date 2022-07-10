package com.example.shoppingmall_springboot.Dto;

import com.example.shoppingmall_springboot.entity.OrderItem;
import lombok.Data;

@Data
public class OrderItemDto {
    public OrderItemDto(OrderItem orderItem, String imgUrl){
        this.itemNm = orderItem.getItem().getItemNm();
        this.count = orderItem.getCount();
        this.orderPrice = orderItem.getOrderPrice();
        this.imgUrl = imgUrl;
    }

    private String itemNm;
    private int count;

    private int orderPrice;
    private String imgUrl;
}
