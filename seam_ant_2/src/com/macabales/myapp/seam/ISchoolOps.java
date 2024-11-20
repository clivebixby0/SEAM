package com.macabales.myapp.seam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author carlmacabales
 */
public interface ISchoolOps {
    void addEquipment(String equipmentName);
    void addRoom(String roomName);
    void assignEquipmentToRoom(String equipmentName, String roomName);
    void recordEquipmentCondition(String equipmentName, String condition);
    String generatePurchaseReport();
    String generateConditionReport();
}
