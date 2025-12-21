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
    
    public abstract void use(Player player);
}
/*
public abstract class Item {
    protected String name;


    public Item(String name){
        this.name = name;
    }
     public void setTreasure(Treasure treasure) {
       this.treasure = treasure;
    }

    public Treasure getTreasure() {
        return treasure;
        
        public void setWeapon(Weapon weapon) {
       this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
     
     public void setPotion(Potion potion) {
       this.potion = potion;
    }

    public Potion getPotion() {
        return potion;
        
     public void setKey(Key key) {
       this.key = key;
    }

    public Key getKey() {
        return key;
    } /*
    
// Sätta alla Item som en ArrayList? Treasure, Potion, Weapon..
    
    //metod som gör att item kopplas till Player (den är abstract för koden inte finns här)
    public abstract void use(Player player);


}
