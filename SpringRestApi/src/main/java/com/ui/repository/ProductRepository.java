package com.ui.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ui.dto.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
