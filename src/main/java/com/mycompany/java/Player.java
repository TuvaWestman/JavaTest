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
    private ArrayList<Item> inventory;
    
        public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.inventory = new ArrayList<>();
    }
   
    ArrayList<String>Itemlist = new ArrayList<Item>();
    
    public void ArrayList<Item> getItem(){
        return items;
    }

    
    public void addItem(Item item) {
        items.add(item);
        System.out.println("You picked up: " + item.name);
    }

    
    public void heal(int amount) {
        healthPoints += amount;
        if (healthPoints > 100) healthPoints = 100;
    }

    public void takeDamage(int damage) {
        healthPoints -= damage;
    }
    
    public int getHealthPoints() {
        return healthPoints;
    }

    
    public boolean isAlive() {
        return healthPoints > 0;
    }
    

    public String getName(){
        return name;
    }


    //metod för display
    public void displayItem(){
        for(Item i : inventory) {
            System.out.print(i.getName());
        }
    }

}