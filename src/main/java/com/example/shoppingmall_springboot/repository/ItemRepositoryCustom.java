package com.example.shoppingmall_springboot.repository;

import com.example.shoppingmall_springboot.Dto.ItemSearchDto;
import com.example.shoppingmall_springboot.Dto.MainItemDto;
import com.example.shoppingmall_springboot.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}