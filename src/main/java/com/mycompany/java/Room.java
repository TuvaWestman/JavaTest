/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tuvaw
 */

package com.mycompany.java;
import java.util.Scanner;

public class Room {

    private String roomDescription = "";
    private Door n;
    private Door s;
    private Door e;
    private Door w;
    private Door q;


    private Monster monster;
    private Item item;
    //private Dungeon dungeon;
    //private Player player;
    private boolean gameOver = false;

    Scanner input = new Scanner(System.in);

    public Room(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public void setN(Door door) {
        this.n = door;
    }

    public void setS(Door door) {
        this.s = door;
    }

    public void setW(Door door) {
        this.w = door;
    }

    public void setE(Door door) {
        this.e = door;
    }

    public void setQ(Door door) {
        this.q = door;
    }

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

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void doNarrative() {
        System.out.printf("%s%n%n", roomDescription);
    }
    
    public void doBattle(Player player, Monster monster){
        System.out.printf("Do you want to attack the " + getMonster().getName() + "?%n Press 'A' to pick up Weapon%n" );
        String command = input.nextLine();
        if (command.equalsIgnoreCase ("A")){  
            System.out.println("You use your weapon! You still lost 10 points in life and mosnter lost 30 points in life");
            player.takeDamage(10);
            monster.takeDamage(10);
            
        }
        else {
            System.out.println("You fought without weapon and lost 20 points in life. monster only lost 10");
        }
        
        System.out.println("Your current health: " + player.getHealthPoints());
        

    }
}

