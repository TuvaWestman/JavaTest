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
    
    private int keyId;
    
    public Key(int id){
        super("Key");
        this.keyId = keyId;
    }
    
    public int getKeyId() {
        return keyId;
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
