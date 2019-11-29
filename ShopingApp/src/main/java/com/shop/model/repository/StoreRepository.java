package com.shop.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.entity.Store;

public interface StoreRepository extends JpaRepository<Store,Long>{

}
