package com.lfelipels.hotelmanagersystem.domain.room.repositories;

import com.lfelipels.hotelmanagersystem.domain.room.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoomRepositoryInterface extends JpaRepository<UUID, Room> {
    public void save(Room room);
}
