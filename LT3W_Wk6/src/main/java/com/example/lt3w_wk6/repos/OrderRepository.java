package com.example.lt3w_wk6.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lt3w_wk6.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}