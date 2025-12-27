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
    private Room roomStart;
    private Room roomEnd;
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Room room5;
    private Room room6;
    private Door door;
    private boolean gameOver = false;
    private String direction;
    

    Scanner input = new Scanner(System.in);

    public Dungeon(Player player, Room currentRoom){
        this.player = player;
        this.currentRoom = currentRoom;
        //this.item = item;
    }


    public void playGame(){
        
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
                case "i":
                    player.displayItem();
                    break;
                /*case "q":
                    gameOver = true;
                    System.out.println("Your exited the game");
                    break;*/
                default:
                    System.out.println("Invalid command, try again");
            }
            
            if (currentRoom == roomEnd) {
                Treasure treasure = new Treasure(200);
                 System.out.println(
                "                   _.--.\n"+
                "               _.-'_:-'||\n"+
                "           _.-'_.-::::'||\n"+
                "      _.-:'_.-::::::' ||\n"+
                "   .'`-.-:::::::'     ||\n"+
                "  /.'`;|:::::::'      ||_\n"+
                " || ||::::::'        _.;._'-._\n"+
                " || ||:::::'     _.-!oo @.!-._'-.\n"+
                " \\. ||:::::. -!() oo @!()@.-'_.||\n"+
                "  '.'-;|:. -'.&$@.& ()$%-'o.'\\U||\n"+
                "   `>'-.!@%()@'@_%-'_.-o _.|'||\n"+
                "    ||-._'-.@.-'_.-' _.-o |'||\n"+
                "    ||=[ '-._.-\\U/.-' o |'||\n"+
                "    || '-.]=|| |'|     o |'||\n"+
                "    ||      || |'|      _| ';\n"+
                "    ||      || |'|   _.-'_.-'\n"+
                "    |'-._   || |'|_.-'_.-'\n"+
                "    '-._'-.|| |' `_.-'\n"+
                "        '-.||_/.-'\n"
            );
            player.addItem(treasure);//?? ska vi ha såhär?
        }

        
        if (nextRoom != null){
            currentRoom = nextRoom;
            currentRoom.doNarrative();
        }
        
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

        if (currentRoom == room4){
            Monster dragon = new Monster(
                    "Dragon",
                    120,
                    25,
                    """
                               / \\  //\\
                      |\\___/|      \\//
                      /O  O  \\__     //
                     /     /  \\/_  //
                     @_^_@'/   \\/_/
                     //_^_/     \\
                  ( //) |        |
                ( / / ) |        |
                ( \\ \\ ) |        |
        
                    A massive dragon blocks your path.
                    """
            );
           
        }

            if (currentRoom == room6){
                Monster goblin = new Monster(
                        "Goblin",
                        40,
                        8,
                        """
                          .._>/)
                         (o_O )
                         <|   )
                          /   \\
                         (_/ \\_)
            
                        A small, sneaky goblin with sharp teeth.
                        """
                );
            }
        
        }
    }

     public void movePlayer(String direction){
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
        
         
        
    }
}

