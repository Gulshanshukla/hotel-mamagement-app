package com.geekster.Room.App.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="OYO")///TO CHANGE TABLE NAME
public class Room {
    @Id
    private Integer roomId;
    private Integer roomNumber;
    private type roomType;
   // @Column(name="available")// change column name
    private boolean roomAvailable;
    private Integer roomPrice;

}
