/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author Mjoha
 */
//Class attribute private gold value.Int
public class Treasure extends Item {
   
    private int goldValue;

   
    public Treasure(int goldValue) {
        super("Treasure");
        this.goldValue = goldValue;
    }
    
        
    @Override
    
        public void use(Player player){
        player.addGold(goldValue);
    }
        
        @Override
    public String toString(){
        return "Treasure";
    }

          /*  private int setGoldValue() {
        this.goldValue = goldValue;
    } 
        private int getGoldValue() {
        return goldValue;
    } */
        
}
