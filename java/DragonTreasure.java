/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//package com.mycompany.firsttestjava;
import java.util.Scanner;
import projectdungeon.Player;

/**
 *
 * @author tuvaw
 */
public class DragonTreasure {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  }
    private Room room;
    
    private Player player;
    
    private Door door;
    
    public void setupGame(){
        rooms[] = new Room();
        rooms[] = new Room();
        rooms[] = new Room();
        rooms[] = new Room();
        rooms[] = new Room();
        rooms[] = new Room();
        
        player = new Player();
        
        door = new Door();
       
}  
        public void endGame(){
        
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
