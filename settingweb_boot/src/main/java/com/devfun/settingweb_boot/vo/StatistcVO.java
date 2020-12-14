package com.devfun.settingweb_boot.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class StatistcVO {
	private int requestID;
	private String requestCode;
	private String userID;
	private String createDate;
	public int getRequestID() {
		return requestID;
	}
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}
	public String getRequestCode() {
		return requestCode;
	}
	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	} 

	
}