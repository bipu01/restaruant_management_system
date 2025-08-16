package com.crudSE.demo.models;

import com.crudSE.demo.models.Customer.Customer;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class OrderList {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @OneToMany(mappedBy = "orderList", cascade = CascadeType.ALL)
  private List<OrderItem> orderItems;
  
  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;
}
