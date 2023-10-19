package com.geekster.Room.App.controller;

import com.geekster.Room.App.model.Room;
import com.geekster.Room.App.service.Roomservice;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Roomcontroller {
    @Autowired
    Roomservice roomservice;

    //post api
    @PostMapping("addroom")
    public String addroom(@RequestBody Room newRoom)
    {
        return roomservice.addroom(newRoom);
    }
    @PostMapping("addrooms")
    public String addrooms(@RequestBody List<Room> newrooms)
    {
        return roomservice.addrooms(newrooms);
    }
   @GetMapping("rooms")
    public List<Room> getallrooms()
   {
        return roomservice.getallrooms();
   }
   @GetMapping("getroom/id/{id}")
    public  Room getroombyid(@PathVariable Integer id)
   {
       return roomservice.getroombyid(id);
   }
    @DeleteMapping("deleterooms/ids")
    public String removeroomsbyids(@RequestBody List<Integer> ids)
    {
        return roomservice.removeroomsbyids(ids);
    }
    //custom operations ||custom query
    @GetMapping("findroom/price/{price}")
    public List<Room> getroombyprice(@PathVariable Integer price)
    {
        return roomservice.getroombyprice(price);
    }
    ///gives me all the rooms which are availabele and theere price should be less than 10000 again custom method
    //needed rules for custom method that gpa uderstand that
    @GetMapping("rooms/price/{price}/and/available")

    public List<Room> getavailableroomsbelowprice(@PathVariable Integer price)
    {
        return roomservice.getavailableroomsbelowprice(price);
    }
    @GetMapping("rooms/price/{price}/or/available")

    public List<Room> getavailableroomsorbelowprice(@PathVariable Integer price)
    {
        return roomservice.getavailableroomsorbelowprice(price);
    }





}
