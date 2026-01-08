/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.java;

//package com.mycompany.firsttestjava;
import java.util.ArrayList;
import java.util.Scanner;
//import projectdungeon.Player;

/**
 *
 * @author tuvaw
 */
public class DragonTreasure {
    
    private Player player;
    private Room room;
    
    private Door door;

    //private Dungeon dungeon;
    
    //private Monster monster;
    
    //private Item item; 
    
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
        
        System.out.printf("%nWelcome %s!%n%n You navigate by pressing 'w', 'e', 'n', 's' %n%n To check inventory press 'i'. %n%n You have entered the Dungeon. There are two doors in front of you. %n%n Choose West or East door. If you want to quit game choose 'q' ", player.getName());
        
        Room roomStart = new Room("");
        Room room1 = new Room("You are now in room 1. Some music is playing and there is two doors ahead. choose your path: west or east. ");
        Room room2 = new Room("You entered room 2. It is a very dark and scary place. the room is cluttered with olds tools. Something feels abandonned... Continue the adventure, choose your path wisely: west or east");
        Room room3 = new Room("you entered room 3. immediately you hear a mechanical click. Uh-oh. The door locks behind you, and the room is completely empty. This is definitely a dead end. Choose south to go back to entrance");
        Room room4 = new Room("You have entered room4. A warm glow fills the room from lanterns hanging on the walls. There is only one door ahead of you now. Choose North to open the door");
        Room room5 = new Room("while the monster is on the floor, hurry up and move! Two doors stand open, silently inviting you forward. Chose west or east to continue");
        Room room6 = new Room("There is only one door out of room 6, Hurry and walk through it while you can. Chose south to go back and try again");
        Room roomEnd = new Room("Great job, You won the Treasure!!! Wanna play again? Choose South to go back to the entrance");
        Room roomStop = new Room("You've exited the game, thank you for playing");   //kopplat till "q"



        room6.setMonster(new Monster(
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
        )); // lägger Goblin i room6
        room5.setMonster(new Monster(
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
        ));

        
        roomEnd.setItem(new Treasure(200, """
                                          
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
                    """));
        room1.setItem(new Key("GoldKey"));
        room2.setItem(new Key("SilverKey"));

       
        Room[] room = {
            roomStart, room1, room2, room3, room4, room5, room6, roomEnd
        };
        
      
        //sätt dörrar till rummen här
        roomStart.setW(new Door("w", room1, false));
        roomStart.setE(new Door("e", room2, false));
        
        room1.setE(new Door("e", room3, false));
        room1.setW(new Door("w", room4, false));
       
        room2.setE(new Door("e", room6, false));
        room2.setW(new Door("w", room5, false));
        
        room3.setS(new Door("s", room1, false));
        room6.setS(new Door("s", room1, false));
               
        room4.setN(new Door("n", roomEnd, true));
 
        room5.setE(new Door("e", room4, false));
        room5.setW(new Door("w", room3, false));
        
        roomEnd.setS(new Door("s", room1, false));
        
        // utifall q behöver definieras som ett rum 
        room1.setQ(new Door ("q", roomStop, false));
        room2.setQ(new Door ("q", roomStop, false));
        room3.setQ(new Door ("q", roomStop, false));
        room4.setQ(new Door ("q", roomStop, false));
        room5.setQ(new Door ("q", roomStop, false));
        room6.setQ(new Door ("q", roomStop, false));
        roomEnd.setQ(new Door ("q", roomStop, false));
        roomStart.setQ(new Door ("q", roomStop, false));
        
        Dungeon dungeon = new Dungeon(player, roomStart);

        dungeon.playGame();

    }
      
}
