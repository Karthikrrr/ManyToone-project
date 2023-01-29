package com.Learn.SpringLearn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Learn.SpringLearn.entity.product_category;

@Repository
public interface productCatRepo extends JpaRepository<product_category , Long> {
}
