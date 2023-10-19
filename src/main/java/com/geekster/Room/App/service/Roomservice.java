package com.geekster.Room.App.service;

import com.geekster.Room.App.model.Room;
import com.geekster.Room.App.repo.IRoominterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Roomservice {
    @Autowired
    IRoominterface iroominterface;
    public String addroom(Room newroom)
    {
        iroominterface.save(newroom);
                return "room added";

    }
    public Room getroombyid(Integer id)
    {
        return iroominterface.findById(id).get();
    }

    public String addrooms(List<Room> newrooms) {
        iroominterface.saveAll(newrooms);
        return newrooms.size()+"rooms were added";
    }

    public List<Room> getallrooms() {
        return (List<Room>) iroominterface.findAll();
    }

    public String removeroomsbyids(List<Integer> ids) {
      iroominterface.deleteAllById(ids);
      return "rooms removed";
    }

    public List<Room> getroombyprice(Integer price) {
       return  iroominterface.findByRoomPrice(price);
    }

    public List<Room> getavailableroomsbelowprice(Integer price) {
    return iroominterface.findByRoomPriceLessThanEqualAndRoomAvailable(price,true);
    }

    public List<Room> getavailableroomsorbelowprice(Integer price) {
        return iroominterface.findByRoomPriceLessThanEqualORRoomAvailable(price,true);
    }
}
