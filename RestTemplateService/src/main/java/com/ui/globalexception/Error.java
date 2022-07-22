package com.ui.globalexception;

import java.time.LocalDateTime;


public class Error {
	LocalDateTime ldt ;
	String url;
	String msg;
	@Override
	public String toString() {
		return "Error [ldt=" + ldt + ", url=" + url + ", msg=" + msg + "]";
	}
	public Error(LocalDateTime ldt, String url, String msg) {
		super();
		this.ldt = ldt;
		this.url = url;
		this.msg = msg;
	}
	public Error() {
		super();
	}
	public LocalDateTime getLdt() {
		return ldt;
	}
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	} 
	

}
