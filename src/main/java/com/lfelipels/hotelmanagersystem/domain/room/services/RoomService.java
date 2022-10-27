package com.lfelipels.hotelmanagersystem.domain.room.services;

import com.lfelipels.hotelmanagersystem.domain.room.dtos.CreateRoomDto;
import com.lfelipels.hotelmanagersystem.domain.room.entities.Room;
import com.lfelipels.hotelmanagersystem.domain.room.repositories.RoomRepositoryInterface;
import com.lfelipels.hotelmanagersystem.domain.shared.objectsValues.Money;
import org.springframework.stereotype.Service;

import java.util.Currency;

@Service
public class RoomService {
    private final RoomRepositoryInterface roomRepository;

    public RoomService(RoomRepositoryInterface roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room create(CreateRoomDto roomData){

        Room room = new Room();
        room.setRoomType(roomData.getRoomType());
        room.setDescription(roomData.getDescription());
        room.setDetails(roomData.getDetails());
        //set price
        String price = roomData.getPrice().replaceAll("[^0-9]", "");
        room.setPrice(new Money(Integer.parseInt(price), Currency.getInstance("BRL")));
        this.roomRepository.save(room);
        return room;
    }
}
