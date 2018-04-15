package com.hepexta.core.dto;

import java.util.Date;

public class TransferData {

	private String  key;
	private Integer value;
	private Date    date;

	public TransferData() {
	}

	public TransferData( String key, Integer value, Date date ) {
		this.key = key;
		this.value = value;
		this.date = date;
	}

	public String getKey() {
		return key;
	}

	public void setKey( String key ) {
		this.key = key;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue( Integer value ) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate( Date date ) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "TransferData{" +
				"key='" + key + '\'' +
				", value=" + value +
				", date=" + date +
				'}';
	}
}
