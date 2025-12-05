/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//package com.mycompany.firsttestjava;
import java.util.Scanner;
//import projectdungeon.Player;

/**
 *
 * @author tuvaw
 */
public class DragonTreasure {
    
    private Room room;
    
    private Player player;
    
    private Door door;

    private Dungeon dungeon;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        DragonTreasure game = new DragonTreasure();
        game.setupGame();

  }


    public void setupGame(){
        //Room[] rooms= new Room[7];
        //Door[] doors = new Door[10];
        player = new Player();
        
        Room roomStart = new Room("Choose west or east to...");
        Room room1 = new Room("Welcome to room1.choose west or east to continue");
        Room room2 = new Room("Welcome to room2. Chose west or east to continue");
        Room room3 = new Room("Welcome to room3. Chose south to go back and try again");
        Room room4 = new Room("Welcome to room4. Chose north to find the treasure");
        Room room5 = new Room("Welcome to room5. Chose west or east to continue");
        Room room6 = new Room("Welcome to room6. Chose south to go back and try again");
        Room roomEnd = new Room("Treasure!!");
        
        Room[] rooms = {
            roomStart, room1, room2, room3, room4, room5, room6, roomEnd
        };
        
        
        /*Door[] door = {
            new Door ("w"), 
            new Door ("e"),
            new Door ("s"),
            new Door ("w")
        };*/
        
        //sätt dörrar till rummen här
        roomStart.setW(new Door(room1));
        roomStart.setE(new Door(room2));
        
        room1.setE(new Door(room3));
        room1.setW(new Door(room4));
       
        room2.setE(new Door(room6));
        room2.setW(new Door(room5));
        
        room3.setS(new Door(roomStart));
        room6.setS(new Door(roomStart));
               
        room4.setN(new Door(roomEnd));
 
        room5.setE(new Door(room4));
        room5.setW(new Door(room3));        
        
        Dungeon dungeon = new Dungeon(player, roomStart);
    }
      
}





//package projectdungeon

       
/*At the start of the game this function should excist
setupGame()
setupGame()
    creates all the Rooms
    saves them in a data structure like an array or Arraylist.

An instance of (Player) is created 
createPlayer()
Doors to every room is created 
createDoors()
Thereafter the game starts
playGame()
    WelcomePlayer() 
    doNarrative()
        print the description of the rooms
        print available doors
    displayDirections()
        choose direction s,w,e,n
    playernavigation()
   moves the player to the next room 
 endGame()
    
 
  package projectdungeon;

import java.util.Scanner;


public class DragonTreasure {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Player myPlayer = new Player();
        System.out.printf("Initial name is: %s%n%n", myPlayer.getName() );
        System.out.println("Please enter your playername: ");
        String theName = input.nextLine();
        myPlayer.setName(theName);
        System.out.println();
        System.out.printf("Playername is: %n%s%n", myPlayer.getName()); 
    }
    }
*/   
