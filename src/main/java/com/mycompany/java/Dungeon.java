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
    private Room room;
    private Room currentRoom;
    private Monster monster;
    private Treasure treasure;
    private Room nextRoom;
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
    private boolean gameOver = false;
    private String direction;
    

    Scanner input = new Scanner(System.in);

    public Dungeon(Player player, Room currentRoom){
        this.player = player;
        this.currentRoom = currentRoom;
        //this.currentRoom = null;
        //this.item = item;
    }


    public void playGame(){
        
        while(!gameOver) {

            //System.out.print("Enter command n/s/e/w: ")
            String command = input.nextLine();

            switch (command) {
                case "n":
                case "s":
                case "w":
                case "e": 
                    movePlayer(command);
                    somethingHappens();
                    if (nextRoom != null){
                currentRoom = nextRoom;
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
                    currentRoom = null;
                    gameOver = true;
                    System.out.println("You've exited the game, thank you for playing");
                    return;
                default:
                    System.out.println("Invalid command, try again");
            }
           
        }
    }
   
    public void somethingHappens(){
    
    Monster monster = currentRoom.getMonster();
    if (monster != null) {
        System.out.println("You encounter a " + monster.getName() + "!");
        room.doBattle(player, monster);
                
                if(currentRoom.getItem() != null){
                System.out.print("Here is a " + currentRoom.getItem().getName() + ". Do you want to pick it up? press 'yes' or 'no'");
                String answer = input.nextLine();
                    if(answer.equalsIgnoreCase("yes")){
                        player.addItem(currentRoom.getItem());
                        currentRoom.setItem(null);
                        System.out.print("You picked up the item.");
                }
            }
                
             Item item = currentRoom.getItem();
                 if (item != null) {
                 if (currentRoom == roomEnd && currentRoom.getItem() instanceof Treasure) {

                    System.out.println("""
                                   _.--.
                               _.-'_:-'|| 
                           _.-'_.-::::'|| 
                      _.-:'_.-::::::' || 
                   .'`-.-:::::::'     || 
                  /.'`;|:::::::'      ||_
                 || ||::::::'        _.;._'-._
                 || ||:::::'     _.-!oo @.!-._'-.
                 \\. ||:::::. -!() oo @!()@.-'_.||
                  '.'-;|:. -'.&$@.& ()$%-'o.'\\U||
                   `>'-.!@%()@'@_%-'_.-o _.|'||
                    ||-._'-.@.-'_.-' _.-o |'||
                    ||=[ '-._.-\\U/.-' o |'||
                    || '-.]=|| |'|     o |'||
                    ||      || |'|      _| ';
                    ||      || |'|   _.-'_.-'
                    |'-._   || |'|_.-'_.-'
                    '-._'-.|| |' `_.-'
                        '-.||_/.-'
                    """);

                    Treasure treasure = (Treasure) currentRoom.getItem();
                    player.addGold(treasure.getGoldValue());

                    currentRoom.setItem(null);
                    System.out.println("🎉 You found the treasure and won the game!");
                    gameOver = true;
            }
            
    }

            
        }
    
    
            
    }
    

     public void movePlayer(String direction){

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
            case "q": gameOver = true; nextRoom = null;
            default: 
            System.out.println("invalid direction! try again. ");
            nextRoom = null;
            break;
             }
        
        

         }
        public void setGameOver(boolean value){  
        this.gameOver= value; 
        }   
    public boolean isGameOver(){
        return gameOver;
    }
}
    
        

 /*
        if (currentRoom == roomStart) {
            System.out.print("Here is a key. Do you want to pick it up? press 'yes' or 'no'");
            String answer = input.nextLine();
            if (answer.equals("yes")){
                    player.addItem(new Key());
                    System.out.print("You picked up the key.");

        }
            else{
            System.out.println("You can not move forward without the key..");
            }
        }
        */

            // currentRoom.getMonster(); // vi bör nog ha detta här istället för new monster
