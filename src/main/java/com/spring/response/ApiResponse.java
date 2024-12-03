package com.spring.response;

import lombok.Data;

@Data
public class ApiResponse {
    private String message;
    private Boolean status;


    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public ApiResponse(String message, Boolean status) {
        this.status=status;
        this.message=message;
    }

    public ApiResponse() {
    }
}