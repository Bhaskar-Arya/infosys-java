package com.ui.servie;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ui.dao.IProductDAO;
import com.ui.dto.Product;

@Service
public class ServiceImp implements IProductServiceInterface{
	@Autowired 
	IProductDAO ptProduct; 
	public boolean addProduct(Product recordProduct ) {
		ptProduct.save(recordProduct);
		return true;
	}
	public boolean delete(int key) {
		ptProduct.deleteById(key);
		return true;
	}
	public Iterable<Product> showRecodProduct() {
		return ptProduct.findAll();
	}
	public void showProduct(int key) {
		Optional<Product> objOptional = ptProduct.findById(key);
		if(objOptional.isPresent())
			System.out.println(" product is present "+objOptional);
		else 
			System.out.println(" product is not found ");
	}
	//public String showallRecord();
	


}
