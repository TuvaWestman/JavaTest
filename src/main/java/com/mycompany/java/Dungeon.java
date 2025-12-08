/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tuvaw
 */

/* 
currentRoom:room - private 
welcome message string - private
playGame(): void - public (method)
*/
package com.mycompany.java;


import java.util.Scanner;


public class Dungeon {

    private Player player;
    private Room currentRoom;
    private Room nextRoom;
    private Door door;
    private boolean gameOver = false;

    Scanner input = new Scanner(System.in);

    public Dungeon(Player player, Room currentRoom){
        this.player = player;
        this.currentRoom = currentRoom;
    }


    public void playGame(){
        System.out.printf("Welcome %s!%n", player.getName());
        currentRoom.doNarrative();
        
        
        while(!gameOver) {

            //System.out.print("Enter command n/s/e/w: ")
            String command = input.nextLine();

            switch (command) {
                case "n":
                case "s":
                case "w":
                case "e": 
                    movePlayer(command);
                    break;
                /*case "q":
                    gameOver = true;
                    System.out.println("Your exited the game");
                    break;*/
                default:
                    System.out.println("Invalid command");
            }
        }
    }

    private void movePlayer(String direction){
        Room nextRoom = null;

        /*for (Door d: currentRoom.getDoors()){
            if (d.getDirection().equals(direction)){
            currentRoom = d.getIsLeadingTo();
            currentRoom.displayDescription();
            return;
        }*/
        switch (direction){
            case "n": nextRoom = currentRoom.getN()!= null ? currentRoom.getN().getIsLeadingTo() : null;
            break; 
            case "s": nextRoom = currentRoom.getS() != null ? currentRoom.getS().getIsLeadingTo() : null;
            break;
            case "e": nextRoom = currentRoom.getE()!= null ? currentRoom.getE().getIsLeadingTo() : null;
            break;
            case "w": nextRoom = currentRoom.getW() != null ? currentRoom.getW().getIsLeadingTo() : null;
            break;  
            
            default: 
            System.out.println("invalid direction! try again. ");
            nextRoom = null;
            break;
        }
        
        if (nextRoom != null){
            currentRoom = nextRoom;
            currentRoom.doNarrative();
        }
    }
}

