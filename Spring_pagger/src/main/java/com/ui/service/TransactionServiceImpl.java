package com.ui.service;

import java.util.List;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ui.dto.TransactionDTO;
import com.ui.exception.PaggerException;
import com.ui.repoistory.TransactionRepository;
import static java.util.stream.Collectors.*;
import com.ui.entity.Transaction;

import java.time.LocalDate;
@Service
public class TransactionServiceImpl implements TransactionService{
	@Autowired
	TransactionRepository rpRepository;
	public List<Transaction> getAllTransaction(Integer pageNo, Integer pageSize) throws PaggerException{
		Pageable pgPageable = PageRequest.of(pageNo,pageSize);
		Page<TransactionDTO> transactionalrecorDtos = rpRepository.findAll(pgPageable);
		if(transactionalrecorDtos.isEmpty())
			throw new PaggerException(" no record fetch for getAllTransaction" );
		List<Transaction> entityList = transactionalrecorDtos.getContent();
		return entityList;
	}
	
	public List<TransactionDTO> getAllTransactionByTransactionDateAfter(LocalDate transactionDate, Integer pageNo,
			Integer pageSize) throws PaggerException {
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		List<TransactionDTO> transactions = rpRepository.findByTransactionDateAfter(transactionDate, pageable);
		if (transactions.isEmpty()) {
			throw new PaggerException("Service.NO_CUSTOMERS_IN_THIS_PAGE");
		}
		return transactions;
	}
		
	

}
