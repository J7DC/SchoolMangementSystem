package com.jdc.schoolMgntSystem.exception;

public enum BusinessErrorCode {
	
	BU_ERR_GENERAL_ERROR("BU_ERR_1000","General Business error"),
	BU_ERR_BAD_TOKEN("BU_ERR_1001","Bad token or Unauthorized access"),
	BU_ERR_REQ_OBJECT_NOT_FOUND("BU_ERR_1002","Requested object not found in system"),
	BU_ERR_BAD_INPUT("BU_ERR_1003","Bad input request"), 
	BU_ERR_OPERATION_NOT_ALLOW("BU_ERR_1004","Operation not allowed");
	
	private final String code;
	
	private final String description;
		
	private BusinessErrorCode(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String getCode() {
		return code;
	}

	public static  BusinessErrorCode getErrorCodeDetail(String value) {
		return BusinessErrorCode.valueOf(value);
	}
	
	/*public static void main(String[] args){
		System.out.println(BusinessErrorCode.valueOf("BU_ERR_OPERATION_NOT_ALLOW").getDescription());
	}*/

}
