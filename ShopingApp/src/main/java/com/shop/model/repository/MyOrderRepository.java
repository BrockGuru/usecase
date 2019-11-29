package com.shop.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.entity.MyOrder;

public interface MyOrderRepository extends JpaRepository<MyOrder, Long> {
	
}
