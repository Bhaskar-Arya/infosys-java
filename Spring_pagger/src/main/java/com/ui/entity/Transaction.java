package com.ui.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Transaction {
	@Id
	private Integer id;
	private LocalDate transactionaDate;
	private Float transctionalAmount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getTransactionaDate() {
		return transactionaDate;
	}
	public void setTransactionaDate(LocalDate transactionaDate) {
		this.transactionaDate = transactionaDate;
	}
	public Float getTransctionalAmount() {
		return transctionalAmount;
	}
	public void setTransctionalAmount(Float transctionalAmount) {
		this.transctionalAmount = transctionalAmount;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", transactionaDate=" + transactionaDate + ", transctionalAmount="
				+ transctionalAmount + "]";
	}
	
}

