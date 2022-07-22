package com.ui.repositary;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.ui.dto.Product;
import org.springframework.stereotype.Repository;
@Repository
public interface Repoistory extends CrudRepository<Product,Integer>{
	List<Product> findme(Product p, int i);
	
}
