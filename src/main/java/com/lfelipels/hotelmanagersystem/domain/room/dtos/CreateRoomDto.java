package com.lfelipels.hotelmanagersystem.domain.room.dtos;

import com.lfelipels.hotelmanagersystem.domain.room.enums.RoomType;

public class CreateRoomDto {
    private RoomType roomType;
    private String description;
    private String price;
    private String details;
    private String currencyCode;

    public CreateRoomDto(RoomType roomType, String description, String price, String details, String currencyCode) {
        this.roomType = roomType;
        this.description = description;
        this.price = price;
        this.details = details;
        this.currencyCode = currencyCode;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getDetails() {
        return details;
    }
}
