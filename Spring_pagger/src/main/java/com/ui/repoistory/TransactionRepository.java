package com.ui.repoistory;

import java.time.LocalDate;
import com.ui.entity.Transaction;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ui.dto.TransactionDTO;

import java.util.List;
@Repository
public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Integer> {
	public List<Transaction> findByTransactionDateAfter(LocalDate transactionaDate, Pageable pageable);
}
