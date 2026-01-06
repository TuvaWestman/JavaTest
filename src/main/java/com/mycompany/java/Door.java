/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tuvaw
 */

/*
position- char - private (class attribute/instance variable)

locked(bool) - private (class attribute/instance variable)

isLocked()bool  - public (this is a method)
*/
//Class operator public isLoocked boolean
//Class atribute private if loocked or not
package com.mycompany.java;


public class Door {

    private String direction;
    private Room isLeadingTo;
    private boolean locked = true;
    private int keyId;

    // konstuktor (skapar objekt av klassen & sätter startvärde)
    public Door(String direction, Room isLeadingTo) {
        this.direction = direction;
        this.isLeadingTo = isLeadingTo;
        this.locked = locked;
    }
    
    public Door(int keyId){
        this.keyId = keyId;
    }

    public boolean isLocked() {
        return locked;
    }

    public void lock() {
    locked = true;
    System.out.println("Door is locked, you need a key.");
}
    
    public void unlock(Key key) {
        if(key.getName().equals("goldKey")) {
         locked = false;
         System.out.println("Door is now unlocked.");   
        }else {
           System.out.println("Wrong key");
        }
        
    }
    
    public void openLockedDoor(){
        if(locked){
            System.out.println("Door is locked, you can't enter without a key.");
        }else{
            System.out.println("Door opens");
        }
    }
    
    
    //kan finnas setters här, lägg till// setters.. (anteckning ta bort sen)
    public void setDirection(String Direction){
        this.direction = direction;
    }

    // getters för Door (attribut)
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
