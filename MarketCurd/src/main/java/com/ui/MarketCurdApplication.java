package com.ui;
import com.ui.dao.IProductDAO;
import com.ui.dto.Product;
import com.ui.servie.ServiceImp;

import antlr.collections.List;

import com.ui.repositary.Pagingexample;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ui.servie.ServiceImp;

@SpringBootApplication
public class MarketCurdApplication implements CommandLineRunner{
     
	@Autowired
	ServiceImp sImp ;
//	@Autowired
//	IProductDAO dao;
	@Autowired
	Pagingexample px;
	public static void main(String[] args) {
		SpringApplication.run(MarketCurdApplication.class, args);
	}
	public boolean addProduct() {
		Product ptProduct = new Product(5,"nankthai",205);
		sImp.addProduct(ptProduct);
		return true;
	}
	public boolean delete(int key) {
		return sImp.delete(key);
	}
	public void showRecodProduct(){
		Iterable<Product> ptIterable = sImp.showRecodProduct();
		ptIterable.forEach(System.out::println);
	}
	public void showProduct(int key) {
	 sImp.showProduct(key);
	}
	public void getpage1() {
		Pageable page = PageRequest.of(0, 4);
		Page<Product> pagee1 = px.findAll(page);
		pagee1.forEach(System.out::println);
		
	}
	public void pagesort() {
		Sort st = Sort.by("productName");
		Iterable<Product> ptIterable = px.findAll(st);
		ptIterable.forEach(System.out::println);
	}
	
	public void run(String... args) {
	//Product product = new Product(1,"bhaskar",45);
//		product = this.dao.save(product);
//		Optional<Product > product = this.dao.findById(1);
//		System.out.print(product );
	//	System.out.println(this.dao.count());        // show the number of records in the table
		
		//this.addProduct();
		//this.showRecodProduct();
		//this.showProduct(2);
		//this.delete(2);
		//this.showProduct(2);
		//this.getpage1();
		//this.pagesort();
		System.out.println("122".matches("[1-9]\\1"));
	
		
		
	}

}
