/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author Mjoha
 */
//Class attribute private healing.Int
public class Potion extends Item {

    private int healing;


    public Potion(int healing) {
        super("Health Potion");
        this.healing = healing;
    }


    //override för att skriva över originella use(Player player)
    @Override
    public void use(Player player){
        player.heal(20);
    }

    
}
