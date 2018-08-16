package com.yc.web.dto;

import java.io.Serializable;

public class JsonModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -595260614989911741L;
	
	private Integer code;
	private Object result;
	private String errorMsg;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
}
