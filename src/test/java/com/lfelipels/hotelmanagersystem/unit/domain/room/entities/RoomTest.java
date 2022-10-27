package com.lfelipels.hotelmanagersystem.unit.domain.room.entities;

import com.lfelipels.hotelmanagersystem.domain.room.entities.Room;
import com.lfelipels.hotelmanagersystem.domain.room.enums.RoomType;
import com.lfelipels.hotelmanagersystem.domain.shared.objectsValues.Money;
import org.junit.jupiter.api.Test;

import java.util.Currency;

public class RoomTest {

    @Test
    public void makeARoom() {
        Money price = new Money(1000, Currency.getInstance("BRL"));
        Room room = new Room(
                RoomType.DEFAULT,
                "room 01",
                price,
                "details lorem"
        );
    }
}
