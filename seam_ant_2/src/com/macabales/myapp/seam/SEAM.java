package com.macabales.myapp.seam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import com.macabales.mylibs.seam.School;

/**
 *
 * @author carlmacabales
 */
public class SEAM {
    public static void main(String[] args) {
        ISchoolOps school = School.getInstance();

        String[] equipmentNames = {"Projector", "Microscope", "Laptop", "Printer", "Tablet"};
        String[] roomNames = {"MKTLab", "MKT100", "MKT101"};

        // add equipment
        for (String equipmentName : equipmentNames) {
            school.addEquipment(equipmentName);
        }

        // addroom
        for (String roomName : roomNames) {
            school.addRoom(roomName);
        }

        // assign equipment to room
        school.assignEquipmentToRoom("Projector", "MKT100");
        school.assignEquipmentToRoom("Microscope", "MKTLab");
        school.assignEquipmentToRoom("Laptop", "MKT101");
        school.assignEquipmentToRoom("Printer", "MKT11");
        school.assignEquipmentToRoom("Tablet", "MKTLab");

        // record equipment condition
        school.recordEquipmentCondition("Projector", "good condition");
        school.recordEquipmentCondition("Microscope", "needs repair");
        school.recordEquipmentCondition("Laptop", "for replacement");
        school.recordEquipmentCondition("Printer", "lost");
        school.recordEquipmentCondition("Tablet", "good condition");

        // generate report
        school.generatePurchaseReport();
        school.generateConditionReport();
    }
}
