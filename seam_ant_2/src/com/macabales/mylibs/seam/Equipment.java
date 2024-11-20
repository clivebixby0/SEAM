/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.macabales.mylibs.seam;

/**
 *
 * @author carlmacabales
 */
public class Equipment {
    private String name;
    private String condition;

    public Equipment(String name) {
        this.name = name;
        this.condition = "good condition";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
