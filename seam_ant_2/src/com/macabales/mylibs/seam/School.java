package com.macabales.mylibs.seam;

import java.util.ArrayList;
import com.macabales.myapp.seam.ISchoolOps;

/**
 * Singleton class managing equipment and rooms.
 */
public class School implements ISchoolOps {
    private static final int MAX_EQUIPMENT = 5;
    private static final int MAX_ROOMS = 3;

    private ArrayList<Equipment> equipmentList;
    private ArrayList<Room> roomList;

    // singleton instance
    private static School instance;

    private School() {
        equipmentList = new ArrayList<>();
        roomList = new ArrayList<>();
    }

    // access to singleton
    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }

    public ArrayList<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    @Override
    public void addEquipment(String equipmentName) {
        if (equipmentList.size() < MAX_EQUIPMENT) {
            equipmentList.add(new Equipment(equipmentName));
        } else {
            
        }
    }

    @Override
    public void addRoom(String roomName) {
        if (roomList.size() < MAX_ROOMS) {
            roomList.add(new Room(roomName));
        } else {
            
        }
    }

    @Override
    public void assignEquipmentToRoom(String equipmentName, String roomName) {
        Equipment equipment = findEquipmentByName(equipmentName);
        Room room = findRoomByName(roomName);

        if (equipment != null && room != null) {
            room.assignEquipment(equipment);
        } else {
            
        }
    }

    @Override
    public void recordEquipmentCondition(String equipmentName, String condition) {
        Equipment equipment = findEquipmentByName(equipmentName);

        if (equipment != null) {
            equipment.setCondition(condition);
        } else {
                            
        }
    }

    @Override
    public String generatePurchaseReport() {
        StringBuilder report = new StringBuilder();
        report.append("=====================================\n");
        report.append("Equipment to be purchased:\n");
        report.append("=====================================\n");
        for (Equipment equipment : equipmentList) {
            if (equipment.getCondition().equals("lost") || equipment.getCondition().equals("for replacement")) {
                report.append(equipment.getName()).append("\n");
            }
        }
        return report.toString();
    }

    @Override
    public String generateConditionReport() {
        StringBuilder report = new StringBuilder();
        report.append("=====================================\n");
        report.append("All equipment and their conditions:\n");
        report.append("=====================================\n");
        for (Equipment equipment : equipmentList) {
            report.append(equipment.getName()).append(": ").append(equipment.getCondition()).append("\n");
        }
        return report.toString();
    }

    private Equipment findEquipmentByName(String name) {
        for (Equipment equipment : equipmentList) {
            if (equipment.getName().equals(name)) {
                return equipment;
            }
        }
        return null;
    }

    private Room findRoomByName(String name) {
        for (Room room : roomList) {
            if (room.getName().equals(name)) {
                return room;
            }
        }
        return null;
    }
}
