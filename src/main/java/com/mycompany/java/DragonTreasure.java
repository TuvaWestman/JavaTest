/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.java;

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


        
        DragonTreasure game = new DragonTreasure();
        game.setupGame();

  }


    public void setupGame(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Welcome! %nEnter your name: ");
        String playerName = input.nextLine();

        player = new Player(playerName);

        System.out.printf("Welcome %s!%n%nYou navigate by pressing 'w', 'e', 'n', 's' %n", player.getName());
        
        Room roomStart = new Room("You have entered the Dungeon. There are two doors in front of you. Choose West or East door ");
        Room room1 = new Room("You are now in room 1, you can still see the entrance. Are you sure you don´t want to turn back? Choose west or east to continue.");
        Room room2 = new Room("room 2 is a very dark and scary place. the room is cluttered with olds tools, something feels abandonned...  Choose your path wisely: west or east");
        Room room3 = new Room("you entered room 3. immediately you hear a mechanical click. Uh-oh. The door locks behind you, and the room is completely empty. This is definitely a dead end. Choose south to go back to entrance");
        Room room4 = new Room("You have entered room4. A warm glow fills the room from lanterns hanging on the walls. THere is only one door ahead of you now. Choose North to enter.");
        Room room5 = new Room("The walls are lined with strange markings that almost look like arrows pointing in different directions. Two doors stand open, silently inviting you forward. Chose west or east to continue");
        Room room6 = new Room("You are now in room 6. The whole room is dark and there is no doors to be found. Chose south to go back and try again");
        Room roomEnd = new Room("Great job, You have reached the treasure!!! Wanna play again? Choose South to go back to the entrance");
        
        Room[] rooms = {
            roomStart, room1, room2, room3, room4, room5, room6, roomEnd
        };
        
        //sätt dörrar till rummen här
        roomStart.setW(new Door("w", room1));
        roomStart.setE(new Door("e", room2));
        
        room1.setE(new Door("e", room3));
        room1.setW(new Door("w", room4));
       
        room2.setE(new Door("e", room6));
        room2.setW(new Door("w", room5));
        
        room3.setS(new Door("s", roomStart));
        room6.setS(new Door("s", roomStart));
               
        room4.setN(new Door("n", roomEnd));
 
        room5.setE(new Door("e", room4));
        room5.setW(new Door("w", room3));
        
        roomEnd.setS(new Door("s", roomStart));
        
        Dungeon dungeon = new Dungeon(player, roomStart);

        dungeon.playGame();
    }
      
}
