package com.jdc.schoolMgntSystem.exception;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ErrorDetail {
	
    private Date timestamp;
    private String message;
    private String code;
    private String details;
   // private BusinessErrorCode errorCode;
	public ErrorDetail(Date timestamp, String message, String details ) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		//this.code = code;
		this.details = details;
	}
    
    
}