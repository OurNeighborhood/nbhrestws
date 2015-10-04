package com.neighborhood.restws.common.constants;

public enum CommonNBHConstants {
    VERSION("version"),
    EMPTY_STRING(""),

    ONLINE("online"),
    MOBILE("mobile"),
    SMS("sms"),
    ADMIN("admin");
    
    private String value;

    private CommonNBHConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
