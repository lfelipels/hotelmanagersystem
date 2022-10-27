package com.lfelipels.hotelmanagersystem.domain.room.enums;

public enum RoomType {
    DEFAULT(1, "Default"),
    PREMIUM(2, "Premium");

    private Integer code;
    private String description;

    RoomType(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
