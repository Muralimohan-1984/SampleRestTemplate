package com.example.sample.model;

import java.util.List;

public class SampleRespDTO {
	
	private List<DataBean> data;
	private SupportBean support;
	
	private String dob;
	
	

	public List<DataBean> getData() {
		return data;
	}

	public void setData(List<DataBean> data) {
		this.data = data;
	}

	public SupportBean getSupport() {
		return support;
	}

	public void setSupport(SupportBean support) {
		this.support = support;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	

}
