/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tuvaw
 */

/* 
name string - private (class attribute)
*/
//Health points.Int, damage.Int   Hälsopoäng
package com.mycompany.java;

//ska vi göra array list för items spelare har?

import java.util.ArrayList;


public class Player {
    private String name;    
    private int healthPoints;

    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
    }
    
    public int getHealthPoints() {
        return healthPoints;
    }


    public void takeDamage(int damage) {
        healthPoints -= damage;
        if (healthPoints < 0) {
            healthPoints = 0;
        }
    }

    public boolean isAlive() {
        return healthPoints > 0;
    }
    

    public String getName(){
        return name;
    }

 ArrayList<String>Itemlist = new ArrayList<Item>();
Item.add("Weapon");
Item.add("Potion");
Item.add("Treasure");
Item.add("Key");
}