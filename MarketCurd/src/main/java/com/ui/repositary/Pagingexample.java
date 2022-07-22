package com.ui.repositary;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ui.dto.Product;

public interface Pagingexample extends PagingAndSortingRepository<Product, Integer> {

}
