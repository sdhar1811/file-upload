package com.fileupload.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {

	@ExceptionHandler(MainExceptionHandler.class)
	public ResponseEntity<Map<String,Object>> handleIncompleteDetails(MainExceptionHandler ex, WebRequest req){
		Map<String,Object> map = new HashMap<>();		
		
		map.put("message","File details are incorrect / file is corrupted");		
		
		return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
		
	}
}
