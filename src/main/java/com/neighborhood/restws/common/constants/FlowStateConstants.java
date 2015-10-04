package com.neighborhood.restws.common.constants;

/**
 * @author Balaji
 */
public enum FlowStateConstants {
	DB_ERROR("9999");


	private String value;
	
	private FlowStateConstants(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
