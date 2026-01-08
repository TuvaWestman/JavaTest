/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author Mjoha
 */
public class Potion extends Item {

    private final int healing;

 
    public Potion(int healing) {
        super("Health Potion");
        this.healing = healing;
    }

    @Override
    public void use(Player player){
        player.heal(20);
    }
    @Override
    public String toString(){
        return "Health Potion";
    }
    
}
