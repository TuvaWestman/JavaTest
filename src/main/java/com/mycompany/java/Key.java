/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author Mjoha
 */
public class Key extends Item {
    
    public Key(){
        super("Key");
    }
    
    
    @Override
    public void use(Player player) {
        System.out.println("Use the key on a locked door.");
    }
    @Override
    public String toString(){
        return "Key";
    }
}
