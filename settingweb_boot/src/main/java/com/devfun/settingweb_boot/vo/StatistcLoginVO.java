package com.devfun.settingweb_boot.vo;

public class StatistcLoginVO {
	private int requestID;
	private String requestCode;
	private String userID;
	private String createDate;
	int avgCnt;
	
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
	public int getAvgCnt() {
		return avgCnt;
	}
	public void setAvgCnt(int avgCnt) {
		this.avgCnt = avgCnt;
	}
	
	
}