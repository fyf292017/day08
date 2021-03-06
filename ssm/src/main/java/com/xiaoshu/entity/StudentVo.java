package com.xiaoshu.entity;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.format.annotation.DateTimeFormat;

public class StudentVo extends Student{

	@Column(name = "m_name")
    private String mName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date start;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date end;

	
	
	
	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}
	
	
}
