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
    private final String name;    
    private int healthPoints;
    public ArrayList<Item> inventory;
    private int damage;
    private int goldValue;
    
    
    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.goldValue = 0;
        this.inventory = new ArrayList<>();

        
        inventory.add(new Weapon(10));
        inventory.add(new Potion(20));
        //inventory.add(new Treasure(200));
        //inventory.add(new Key()); 
    }
    
    public void addGold(int amount){
        goldValue += amount;
    }
            
    public void addItem(Item item) {
        inventory.add(item);
        System.out.println("You picked up: " + item.getName());
    }


        
    public void heal(int amount) {
        this.healthPoints += amount;
        if (healthPoints > 100) healthPoints = 100;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
        //System.out.println("You lost some health-points! " + this.healthPoints);
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

    public void displayInventory(){
       System.out.println("Inventory:");
       
       if (inventory.isEmpty()) {
           System.out.println("Your inventory is empty");
           return;
       }
       
       for (Item item : inventory){
           System.out.println(" -" + item);
        }
    }

    public boolean hasKey(){
        for (Item item : inventory){
            if (item instanceof Key){
                return true;
            }
        }
        return false;
    }

    public Key getKey(){
        for (Item item : inventory){
            if (item instanceof Key){
            return (Key) item;
            }
        }
        return null;
    }

}
