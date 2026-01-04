/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tuvaw
 */

/* 
roomDesc: Sting - private (class attribute, instance variable)
do Narritive():void - public (method, class operator)
*/
//Class operator void do battle
package com.mycompany.java;


public class Room {

    private String roomDescription ="";
    private Door n;  
    private Door s;
    private Door e;
    private Door w;
    private Door q;
    
    
    private Monster monster;
    private Item item;  
    private Dungeon dungeon;
    private Player player;
        private boolean gameOver = false;
//item ska kunna hittas i ett room


    // konstruktor
    public Room (String roomDescription){
        this.roomDescription = roomDescription;
    }
    
    public void setN(Door door) {this.n = door;}
    public void setS(Door door) {this.s = door;}
    public void setW(Door door) {this.w = door;}
    public void setE(Door door) {this.e = door;}
    public void setQ(Door door) {this.q = door;}

    public Door getN() {
        return n;
    }
    public Door getS() {
        return s;
    }
    public Door getE() {
        return e;
    }
    public Door getW() {
        return w;
    }
    
    public Door getQ() {
        return q;
    }
    
    public void setMonster(Monster monster) {
       this.monster = monster;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setItem(Item item){
        this.item = item;
    }

    public Item getItem(){
        return item;
    }


     //skriver ut beskrivningen utan att behöva ändra värden här
    // en if sats som säger "om item inte är null så..."
    public void doNarrative() {
        System.out.printf("%s%n%n", roomDescription);
        if(item != null){
            System.out.println("Oh! You see a " + item.getName() + "on the floor!");
        }

        //System.out.printf("There are doors leading to: ");
       
        //if (n != null)
        /*for (Door door: doors) {
          System.out.printf("%c", door.position);
        }*/
    }
    
    public void doBattle(Player player, Monster monster){
        System.out.printf("Do you want to attack the " + getMonster().getName() + "?%n Press  '1' to pick up Weapon" );
        String command = input.nextLine();
        if (command.equals ("yes")){        
            player.healthPoints -= damage;
            monster.takeDamage();
            monster.damage();
        }
        else {
            dungeon.gameOver = true;
        }

    }
}

/*
    public void displayDoor() {
        for(Door d : doors){
            System.out.println("You can choose direction" + d.getDirection());
        } //metod. Kopplar till Riktning i Doors för att hämta n, s, ö, v
        // d är alias från klassen Door där getRiktning kommer ifrån
    } 


    public String getDescription(){
        return Description;
    }

    public void setDescirption(String Description){
        this.description = description;
    }


    public void setDoorDirection(Door[] doors){
        this.doors = doors;
    }

    public Door[] getDoorDirection(){
        return doors;
    }
} */
