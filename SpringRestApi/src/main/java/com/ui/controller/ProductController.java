package com.ui.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ui.dto.Product;
import com.ui.service.ProducServiceImp;

@Controller
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProducServiceImp psi;

	@GetMapping("/allrecord")
	public Iterable<Product> getallrecord(){
		return psi.findall();
	}
	@GetMapping("/getsinglerecord/{id}")
	public Product getsinglerecord(@PathVariable("id") int id ) {
		return psi.findsingle(id);
	}
	@DeleteMapping("/deleteproduct")
	public void deleteProduct(@RequestBody Product p) {
		psi.deleteProduct(p);
	}
	@PostMapping("/addproduct")
	public void addProduct(@Valid @RequestBody Product p){
		psi.addProduct(p);
		
	}
	@DeleteMapping("deletebyid/{id}")
	public boolean deleteProductbyId(@PathVariable("id")int id) {
		psi.deleteProductbyId(id);
		return true;
	}
     @PostMapping("/modifyproduct")
	 public boolean modfiyData(@RequestBody Product p) {
    	 //Responseen
       boolean flag = psi.modfiyData(p);
       if(flag)
    	   return true; 
       return false; 
    	 
     }
}
