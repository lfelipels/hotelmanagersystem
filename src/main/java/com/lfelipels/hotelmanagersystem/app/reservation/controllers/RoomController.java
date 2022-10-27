package com.lfelipels.hotelmanagersystem.app.reservation.controllers;

import com.lfelipels.hotelmanagersystem.domain.room.dtos.CreateRoomDto;
import com.lfelipels.hotelmanagersystem.domain.room.entities.Room;
import com.lfelipels.hotelmanagersystem.domain.room.services.RoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/rooms")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping()
    public ResponseEntity<Object> store(@RequestBody CreateRoomDto roomData) {
        Room room = this.roomService.create(roomData);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(room);
    }
}
