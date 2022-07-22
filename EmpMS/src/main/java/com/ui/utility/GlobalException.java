package com.ui.utility;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(EmpException.class)
	public ResponseEntity<Error> empExceptionError(Exception e, HttpServletRequest httpServletRequest) {
		Error error = new Error();
		String url = httpServletRequest.getRequestURI();
		String hostServer = httpServletRequest.getRemoteHost();
		error.setHostserver(e.getMessage());
		error.setlDateTime(LocalDateTime.now());
		error.setUrl(url);
		error.setServername(httpServletRequest.getServerName());
        return new ResponseEntity<Error>(error,HttpStatus.BAD_REQUEST);		
	}

}
