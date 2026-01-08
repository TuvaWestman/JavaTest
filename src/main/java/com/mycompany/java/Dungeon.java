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

    private final Player player;
    
    private boolean gameOver = false;
    private Room currentRoom;
    private Room nextRoom;
    
    /*
    private Monster monster;
    private Treasure treasure;
    private Room roomStart;
    private Room roomEnd;
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Room room5;
    private Room room6;
    private Door door;
    private Room roomStop;
    private String direction;
    private Room room;*/
    

    Scanner input = new Scanner(System.in);

    public Dungeon(Player player, Room currentRoom){
        this.player = player;
        this.currentRoom = currentRoom;
        //this.currentRoom = null;
        //this.item = item;
    }
    

    public void playGame(){
        currentRoom.doNarrative();  //ska inte denna användas??
        while(!gameOver) {

            //System.out.print("Enter command n/s/e/w: ")
            String command = input.nextLine();


            switch (command) {
                case "n":
                case "s": 
                case "w":
                case "e":

                    Door door = movePlayer(command);
                   /* if (door == null){
                        System.out.println("There is no door in that direction. ");
                    break;
                    }*/


                        if(nextRoom != null) {
                            currentRoom = nextRoom;
                            somethingHappens();
                            currentRoom.doNarrative();
                        } 
                        break;



                case "i":
                    System.out.println("Items in your inventory can help you if you encounter a monster. You have following items in your inventory. ");
                    player.displayInventory();
                    System.out.println(" ");
                    System.out.println("Choose west 'w' or east 'e' door to continue ");
                    break;
                case "q":
                    gameOver = true;
                    System.out.println("You've exited the game, thank you for playing");setGameOver(true);
                    break;
                default:
                    System.out.println("Invalid command, try again");
            }







        }
    }
   
    public void somethingHappens(){
    
        Monster monster = currentRoom.getMonster();
        if (monster != null) {
            System.out.println("You encounter a " + monster.getName() + "! " + monster.getDescription());

            currentRoom.doBattle(player, monster);

                System.out.printf("Do you want to use potion to heal? %n Press  'B' to use potion%n" );
            String command = input.nextLine();

            if (command.equalsIgnoreCase ("B")){  
                player.heal(10);

                System.out.println("You use your potion. now life point is " + player.getHealthPoints());

            }
            else {
                System.out.println("you didnt use potion");
            }
        }


    
        Item item = currentRoom.getItem();
        if(currentRoom.getItem() instanceof Key) {
            System.out.println("Here is a " + currentRoom.getItem().getName() + ". Do you want to pick it up? press 'yes' or 'no'");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                player.addItem(currentRoom.getItem());
                //player.inventory.add(currentRoom.getItem());
                currentRoom.setItem(null);
                System.out.println("You picked up the item.");
                //player.inventory.add(new Key("GoldKey"));
            }

        }

                    
    if (currentRoom.getItem() instanceof Treasure) {

        Treasure treasure = (Treasure) currentRoom.getItem();
        System.out.println("Here is a " + currentRoom.getItem().getName() + ". You found the treasure!");
                    player.addGold(treasure.getGoldValue());

                    currentRoom.setItem(null);
                  
                    gameOver = true;
            }
            

    }
    

     public Door movePlayer(String direction){

        Door chosenDoor = null;
        nextRoom = null;

        /*for (Door d: currentRoom.getDoors()){
            if (d.getDirection().equals(direction)){
            currentRoom = d.getIsLeadingTo();
            currentRoom.displayDescription();
            return;
        }*/


        switch (direction){
            case "n":
                chosenDoor = currentRoom.getN();
                nextRoom = currentRoom.getN()!= null ? currentRoom.getN().getIsLeadingTo() : null;
            break;
            case "s":
                chosenDoor = currentRoom.getS();
                nextRoom = currentRoom.getS() != null ? currentRoom.getS().getIsLeadingTo() : null;
            break;
            case "e":
                chosenDoor = currentRoom.getE();
                nextRoom = currentRoom.getE()!= null ? currentRoom.getE().getIsLeadingTo() : null;
            break;
            case "w":
                chosenDoor = currentRoom.getW();
                nextRoom = currentRoom.getW() != null ? currentRoom.getW().getIsLeadingTo() : null;
            break;
            case "q": setGameOver(true);
            System.out.println("You are dead, game over!");
            break;
            default:
            System.out.println("invalid direction! try again. ");
            nextRoom = null;
            break;
        }

       if (chosenDoor == null) {
        nextRoom = null;
        return null;
         } 
        
        if (chosenDoor.isLocked()) {
            System.out.println("The door is locked.");

if (!player.hasKey()) {
    System.out.println("You don't have a key.");
    System.out.println("Press 'q' to quit.");

    String answer = input.nextLine();

    if (answer.equalsIgnoreCase("q")) {
        setGameOver(true);
        System.out.println("Game over. You should have taken the key;)");
        nextRoom = null;
        return null;
    }

    // Ogiltigt val → stanna kvar
    nextRoom = null;
    return null;
}

        System.out.println("Do you want to use the key? (yes/no): ");
        String answer2 = input.nextLine();

        if (answer2.equalsIgnoreCase("yes")) {
            chosenDoor.unlock(player.getKey());
        } else {
            System.out.println("You decide not to use the key.");
            nextRoom = null;
            return null;
        }
    
   }

        return chosenDoor;
     }

       
     
        public void setGameOver(boolean value){  
        this.gameOver= value; 
        }   
    
        public boolean isGameOver(){
        return gameOver;
    }
}

    
