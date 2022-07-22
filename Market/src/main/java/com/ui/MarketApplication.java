package com.ui;
import org.springframework.beans.factory.annotation.Autowired;
import com.ui.service.*;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class MarketApplication implements CommandLineRunner{
     
	@Autowired
	ProductService rp;
	

	public static void main(String[] args) throws Exception{
		SpringApplication.run(MarketApplication.class, args);
	}
	public void update() {
		Product p = new Product(10,"milkcake",250);
        System.out.println("record has been updated "+rp.update(p));	
	}
	
        public void run(String... args) {
        	this.update();
        }
}
