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
    private int goldValue;
    private ArrayList<Item> inventory;
    private int damage;
    
    
    public Player(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.goldValue = 0;
        this.inventory = new ArrayList<>();

        
        
        inventory.add(new Weapon(10));
        inventory.add(new Potion(20));
        //inventory.add(new Treasure(200));
        inventory.add(new Key()); 
    }
    
    /*ArrayList<Item>Item = new ArrayList<Item>();
        Item.add(new Weapon(10));
        Item.add(new Potion(20));
        Item.add(new Treasure(200));
        Item.add(new Key()); */
   
   // ArrayList<String>items = new ArrayList<String>();
    
   /* public ArrayList<Item>items.get(){
        return inventory;
    } */

    public void addGold(int amount){
        goldValue += amount;
    }
            
    public void addItem(Item item) {
        inventory.add(item);
        System.out.println("You picked up: " + item.name);
    }

    public void doBattle(int damage) {
        this.healthPoints -= damage;
    }
        
    public void heal(int amount) {
        this.healthPoints += amount;
        if (healthPoints > 100) healthPoints = 100;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
        System.out.println("You lost some health-points! " + this.healthPoints);
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
    public void displayInventory(){
       System.out.println("Inventory:");
       
       if (inventory.isEmpty()) {
           System.out.println("Your inventory is empty");
           return;
       }
       
       for (Item item : inventory){
           System.out.println(" -" + item);
        /*for(int i = 0; i < inventory.size(); i++) {
            System.out.println((i + 1) + ". " + inventory.get(i).getName());*/
        }
    }

}

/*public static void display(ArrayList<String> items){
    for (i)
        System.out.printf(" %s", item);
}
}*/