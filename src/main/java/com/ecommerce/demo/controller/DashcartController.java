package com.ecommerce.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.demo.Service.CartService;
import com.ecommerce.demo.Service.DashCartService;
import com.ecommerce.demo.model.CartItem;
import com.ecommerce.demo.model.CartItemDto;
import com.ecommerce.demo.model.DashboardItem;
import com.ecommerce.demo.model.DashcartitemDto;

import jakarta.validation.Valid;

//import javax.validation.Valid;

@RestController
@RequestMapping("/dashcart")
public class DashcartController {

    @Autowired
    private DashCartService cartService;

    @PostMapping("/add")
    public String addToCart(@Valid @RequestBody DashcartitemDto cartItem) {
        cartService.saveItem(cartItem);
        return "Item added to cart successfully!";
    }
    
    @GetMapping("/items")
    public List<DashboardItem> getCartItems() {
        return cartService.getAllCartItems();
    }
    
    
    
}


