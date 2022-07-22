package com.ui.service;

import com.ui.exception.PaggerException;
import com.ui.dto.*;
import java.time.LocalDate;

import java.util.List;



public interface TransactionService {
	public List<TransactionDTO> getAllTransaction(Integer pageNo, Integer pageSize) throws PaggerException;
	public List<TransactionDTO> getAllTransactionByTransactionDateAfter(LocalDate transactionDate, Integer pageNo,
			Integer pageSize) throws PaggerException;
	
}