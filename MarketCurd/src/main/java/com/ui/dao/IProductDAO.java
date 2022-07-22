package com.ui.dao;
import com.ui.dto.*;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends PagingAndSortingRepository<Product, Integer>{

}
