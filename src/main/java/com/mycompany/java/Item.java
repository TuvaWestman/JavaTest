/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author Mjoha
 */
public abstract class Item {
    protected String name;


    public Item(String name){
        this.name = name;
    }

    //metod som gör att item kopplas till Player (den är abstract för koden inte finns här)
    public abstract void use(Player player);


}
