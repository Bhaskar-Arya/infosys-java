package com.ui.utility;

import java.time.LocalDateTime;


public class Error {
	private String servername;
	private String url; 
	private LocalDateTime lDateTime ; 
	private String hostserver;
	public String getServername() {
		return servername;
	}
	public void setServername(String servername) {
		this.servername = servername;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public LocalDateTime getlDateTime() {
		return lDateTime;
	}
	public void setlDateTime(LocalDateTime lDateTime) {
		this.lDateTime = lDateTime;
	}
	public String getHostserver() {
		return hostserver;
	}
	public void setHostserver(String hostserver) {
		this.hostserver = hostserver;
	}
	public Error() {
		super();
	}
	public Error(String servername, String url, LocalDateTime lDateTime, String hostserver) {
		super();
		this.servername = servername;
		this.url = url;
		this.lDateTime = lDateTime;
		this.hostserver = hostserver;
	}
	@Override
	public String toString() {
		return "Error [servername=" + servername + ", url=" + url + ", lDateTime=" + lDateTime + ", hostserver="
				+ hostserver + "]";
	}
	

}
