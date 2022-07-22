package com.ui.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Product {
	@Max(value=100,message = " this is max limit ")
	int pid;
	String pname;
    @Min(value=3,message="prate cannot be min 3 ")
	int prate;
	public Product() {
		super();
	}
	public Product(int pid, String pname, int prate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prate = prate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPnmae() {
		return pname;
	}
	public void setPnmae(String pname) {
		this.pname = pname;
	}
	public int getPrate() {
		return prate;
	}
	public void setPrate(int prate) {
		this.prate = prate;
	}


}
