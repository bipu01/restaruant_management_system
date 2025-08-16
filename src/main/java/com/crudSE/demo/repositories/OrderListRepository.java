package com.crudSE.demo.repositories;

import com.crudSE.demo.models.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderListRepository extends JpaRepository<OrderList, Long> {
}
