package com.prabhakar.retrofit_iiiuploadimage;

import java.io.Serializable;

public class ResponseDTO implements Serializable {
	private DataDTO data;
	private boolean success;
	private int status;

	public DataDTO getData(){
		return data;
	}

	public boolean isSuccess(){
		return success;
	}

	public int getStatus(){
		return status;
	}
}