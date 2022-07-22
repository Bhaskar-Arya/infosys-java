package com.ui.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class TransactionDTO {
	private Integer id;
	private LocalDate transactionaDate ;
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
		return "TransactionDTO [id=" + id + ", transactionaDate=" + transactionaDate + ", transctionalAmount="
				+ transctionalAmount + "]";
	}
	public TransactionDTO(Integer id, LocalDate transactionaDate, Float transctionalAmount) {
		super();
		this.id = id;
		this.transactionaDate = transactionaDate;
		this.transctionalAmount = transctionalAmount;
	}
	public TransactionDTO() {
		super();
	}
	

}
