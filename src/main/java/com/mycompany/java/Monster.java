/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author Mjoha
 */

public class Monster {  
    private final String name;
    private int healthPoints;
    private final int damage;
    private final String description;

    public Monster(String name, int healthPoints, int damage, String description) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }
    

   public int getHealthPoints() {
        return healthPoints;
    }

   public void takeDamage(int damage) {
        this.healthPoints -= damage;
        //System.out.println("Monster health-points! " + this.healthPoints);
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
 

