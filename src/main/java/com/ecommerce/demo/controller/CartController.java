package com.ecommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.demo.Service.CartService;
import com.ecommerce.demo.model.CartItemDto;

import jakarta.validation.Valid;

//import javax.validation.Valid;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public String addToCart(@Valid @RequestBody CartItemDto cartItem) {
        cartService.saveItem(cartItem);
        return "Item added to cart successfully!";
    }
}

