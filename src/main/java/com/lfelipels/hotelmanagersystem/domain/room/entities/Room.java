package com.lfelipels.hotelmanagersystem.domain.room.entities;

import com.lfelipels.hotelmanagersystem.domain.room.enums.RoomType;
import com.lfelipels.hotelmanagersystem.domain.shared.Entities.EntityBase;
import com.lfelipels.hotelmanagersystem.domain.shared.objectsValues.Money;
import com.lfelipels.hotelmanagersystem.infraestructure.persistency.hibernate.types.MoneyType;

import javax.persistence.*;

@Entity()
@Table(name = "rooms")
public class Room extends EntityBase {

    @Column(name = "type")
    private RoomType roomType;

    @Column(length = 50)
    private String description;

    @Column(name = "price", columnDefinition = "integer")
    @Convert(converter = MoneyType.class)
    private Money price;
    private String details;

    public Room() {
        super();
    }

    public Room(RoomType roomType, String description, Money price, String details) {
        super();
        this.roomType = roomType;
        this.description = description;
        this.price = price;
        this.details = details;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
