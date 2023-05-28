package com.jdc.schoolMgntSystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BusinessException extends Exception {
	
private static final long serialVersionUID = -8671087635049186054L;
	
	private BusinessErrorCode errorCode;
	
	public BusinessException(BusinessErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;		
	}
	
	public BusinessException(BusinessErrorCode errorCode, String message,Throwable cause) {
		super(message,cause);
		this.errorCode = errorCode;
		
	}

	public BusinessException(BusinessErrorCode errorCode) {
		this(errorCode,errorCode.getDescription());
	}
	
	

	public BusinessException(String message, Throwable cause) {
		this(BusinessErrorCode.BU_ERR_GENERAL_ERROR,message,cause);
		
	}

	public BusinessException(String message) {
		this(BusinessErrorCode.BU_ERR_GENERAL_ERROR,message);
	}

	public BusinessException(Throwable cause) {
		this(BusinessErrorCode.BU_ERR_GENERAL_ERROR,BusinessErrorCode.BU_ERR_GENERAL_ERROR.getDescription(),cause);
	}

	public BusinessErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(BusinessErrorCode errorCode) {
		this.errorCode = errorCode;
	}


}
