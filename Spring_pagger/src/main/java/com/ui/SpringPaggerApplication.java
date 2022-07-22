package com.ui;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import com.ui.dto.*;
import com.ui.exception.PaggerException;
import com.ui.service.TransactionServiceImpl;

@SpringBootApplication
public class SpringPaggerApplication implements CommandLineRunner {
	
	@Autowired
	TransactionServiceImpl transactionService ; 

	public static void main(String[] args) {
		SpringApplication.run(SpringPaggerApplication.class, args);
	}
	public void getAllTransactions() throws PaggerException {
			List<TransactionDTO> transactionList = transactionService.getAllTransaction(0, 5);
			transactionList.forEach(System.out::println);
 
          }
		public void run(String... args) throws PaggerException {
			this.getAllTransactions();
			
		}
	
	
}
