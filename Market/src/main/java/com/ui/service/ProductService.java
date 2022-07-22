package com.ui.service;
import com.ui.*;
import com.ui.repo.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ProductService {
	
	@Autowired
	ProducRepo rp;
	public boolean addProduct (Product pt) {
       boolean flag = rp.addProduct(pt);
       return true;

      }
	public Product show(int key) {
		return rp.show(key);
	}
	public boolean update(Product p) {
		rp.update(p);
		return true;
	}
}
