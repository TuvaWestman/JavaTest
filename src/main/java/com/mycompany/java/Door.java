/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tuvaw
 */


package com.mycompany.java;


public class Door {

    private String direction;
    private Room isLeadingTo;
    private boolean locked;

    public Door(String direction, Room isLeadingTo, boolean locked) {
        this.direction = direction;
        this.isLeadingTo = isLeadingTo;
        this.locked = locked;
    }


    public boolean isLocked() {
        return locked;
    }

    public void lock() {
    locked = true;
   // System.out.println("Door is locked, you need a key.");
}


    public void unlock(Key key){
        locked = false;
        System.out.println("You have unlocked the door.");
    }

    
    public void openLockedDoor(){
        if(locked){
            System.out.println("Door is locked, you can't enter without a key.");
        }else{
            System.out.println("Door opens");
        }
    }
    
    
    public void setDirection(String Direction){
        this.direction = direction;
    }

    public String getDirection(){
        return direction;
    }


    public void setIsLeadingTo(Room isLeadingTo){
        this.isLeadingTo = isLeadingTo;
    }

    public Room getIsLeadingTo(){
        return isLeadingTo;
    }
    

}
