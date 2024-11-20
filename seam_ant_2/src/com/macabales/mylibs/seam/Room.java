/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.macabales.mylibs.seam;
import java.util.ArrayList;
/**
 *
 * @author carlmacabales
 */
public class Room {
    private String name;
    private ArrayList<Equipment> equipmentList;

    public Room(String name) {
        this.name = name;
        this.equipmentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void assignEquipment(Equipment equipment) {
        this.equipmentList.add(equipment);
    }
}
