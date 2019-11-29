package com.shop.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.entity.Review;

public interface ReviewRepository extends JpaRepository<Review,Long> {

}
