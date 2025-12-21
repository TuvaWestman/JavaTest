/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author Mjoha
 */
//Class attribute private name string, health points.Int, damage.Int, 
//monster desc.string
public class Monster {    //göra denna till Abstract??
    private String name;
    private int healthPoints;
    private int damage;
    private String description;
    
    // Constructor
    public Monster(String name, int healthPoints, int damage, String description) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.description = description;
    }
    
        public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void display() {
        System.out.println(name);
        System.out.println(description);
        System.out.println(name + " HP: " + healthPoints);
    }  
    
     /*Metod för Battle? System.out.print("Choose A to attack");, 
       if (A = true){System.out.print("Good work, attack again? Enter A");}
       if (A = true){System.out.printf("You win, the" %s%n has HP at %d%n, get.Monster);}*/


    /*class Dragon extends Monster
            
        @override
        public void calculateHealthPoints()
    
