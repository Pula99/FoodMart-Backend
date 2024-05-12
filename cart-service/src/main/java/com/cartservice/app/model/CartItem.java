package com.cartservice.app.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer productID;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "cart_items")
    private Cart cart;
}
