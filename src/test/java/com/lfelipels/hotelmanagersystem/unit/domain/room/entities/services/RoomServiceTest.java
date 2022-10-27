package com.lfelipels.hotelmanagersystem.unit.domain.room.entities.services;

import com.lfelipels.hotelmanagersystem.domain.room.dtos.CreateRoomDto;
import com.lfelipels.hotelmanagersystem.domain.room.entities.Room;
import com.lfelipels.hotelmanagersystem.domain.room.enums.RoomType;
import com.lfelipels.hotelmanagersystem.domain.room.repositories.RoomRepositoryInterface;
import com.lfelipels.hotelmanagersystem.domain.room.services.RoomService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class RoomServiceTest {

    @Test
    public void createARoom(){
        RoomRepositoryInterface roomRepository = mock(RoomRepositoryInterface.class);
        RoomService roomService = new RoomService(roomRepository);
        CreateRoomDto roomData = new CreateRoomDto(
                RoomType.DEFAULT,
                "room 1",
                "100.99",
                "details room",
                "BRL"
        );
        Room newRoom = roomService.create(roomData);
        verify(roomRepository, atLeastOnce()).save(any(Room.class));
        Assertions.assertNotNull(newRoom);
        Assertions.assertEquals(10099, newRoom.getPrice().getValue());
        Assertions.assertEquals("R$ 100,99", newRoom.getPrice().toString());
    }
}
