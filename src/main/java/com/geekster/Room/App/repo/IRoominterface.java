package com.geekster.Room.App.repo;

import com.geekster.Room.App.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IRoominterface extends CrudRepository<Room,Integer> {




  //  List<Room> findRoomByPrice(Integer price);

    List<Room> findByRoomPrice(Integer price);

   // void findByLessThanEqualToRoomPriceAndRoomAvailable(Integer price, boolean b);

  //  List<Room> findByRoomPriceLessThanEqualToAndRoomAvailable(Integer price, boolean b);

    List<Room> findByRoomPriceLessThanEqualAndRoomAvailable(Integer price, boolean b);

    List<Room> findByRoomPriceLessThanEqualORRoomAvailable(Integer price, boolean b);

}
