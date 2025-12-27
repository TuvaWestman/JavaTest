/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author Mjoha
 */
//Class attribute private increased damage.Int
public class Weapon extends Item {
    private int damage;

    public Weapon(int damage){
        super("Weapon");
        this.damage = damage;
    }

    @Override
    public void use(Player player){
        player.attack(damage);
    }
}
    
