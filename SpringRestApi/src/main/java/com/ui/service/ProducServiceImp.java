package com.ui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ui.dto.Product;
import com.ui.repository.ProductRepository;

@Service
public class ProducServiceImp {
    @Autowired
	ProductRepository productrepo;
    public Iterable<Product> findall() {
    	return productrepo.findAll();
    }
    public Product findsingle(int id) {
    	return productrepo.findById(id).get();
    }
    
    public boolean modfiyData(Product p) {
    	if(productrepo.existsById(p.getPid())) {
    	    productrepo.save(p);
    	    return true; }
    	
	return false;
		
    }
    public void addProduct(Product p) {
    	productrepo.save(p);
    	
    	
    }
    public void deleteProduct(Product p) {
    	productrepo.delete(p);
    	
    }
    public boolean deleteProductbyId(int id) {
    	productrepo.deleteById(id);
    	return true;
    }
}
