package com.Learn.SpringLearn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Learn.SpringLearn.entity.product;

@Repository
public interface productRepo extends JpaRepository<product , Long> {

}
