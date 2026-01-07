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
    
    private Room room;
    
    private Player player;
    
    private Door door;

    private Dungeon dungeon;
    
    private Monster monster;
    
    private Item item; //ska vi inte ha de icke abstrakta items ist?
    
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
//skapar vi icke abstrakta här? alltså key, potion osv
//Borde vi inte definiera healthpoints och startItems här (ArrayList?) som läggs till på om nya Items dyker upp i rummen. 

        
        System.out.printf("Welcome %s!%n%n You navigate by pressing 'w', 'e', 'n', 's' %n%n To check inventory press 'i'. %n%n You have entered the Dungeon. There are two doors in front of you. %n%n Choose West or East door. If you want to quit game choose 'q' ", player.getName());
        
        Room roomStart = new Room(null);
                //Lägga till om nytt Item/Monster ses eller som en ny set. Detta för alla rummen. ex. You´ve encountered a, kalla på monster goblin/dragon....Pick up item..
                //Method för Battle against monster?...Algoritm för Healthpoints, set.healthPoints, get.healthPoints.
        Room room1 = new Room("You are now in room 1, and there is something on the floor..");
        Room room2 = new Room("room 2 is a very dark and scary place. the room is cluttered with olds tools, something feels abandonned...Oh there s something on the floor. Looks like a key in silver. Goldkey is added to your inventory. Continue the adventure, choose your path wisely: west or east");
        Room room3 = new Room("you entered room 3. immediately you hear a mechanical click. Uh-oh. The door locks behind you, and the room is completely empty. This is definitely a dead end. Choose south to go back to entrance");
        Room room4 = new Room("You have entered room4. A warm glow fills the room from lanterns hanging on the walls. There is only one door ahead of you now. Choose North to enter.");
        Room room5 = new Room("The walls are lined with strange markings that almost look like arrows pointing in different directions. Two doors stand open, silently inviting you forward. Chose west or east to continue");
        Room room6 = new Room("You are now in room 6. The whole room is dark and there is no doors to be found. Chose south to go back and try again");
        Room roomEnd = new Room("Great job, You have reached the treasure!!! Wanna play again? Choose South to go back to the entrance");
        Room roomStop = new Room("You've exited the game, thank you for playing");   //kopplat till "q"

        //room1.setItem(new Key()); //en key i room1





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
        
       
        
        
        //vi ska lägga in room2.getMonster tex. 
        // Även lägga in room2.getItem eller som en ArrayList<String>Items: Items.add(sword), Items.add(bow)
        //Battle against monster. You´ve encountered a goblin/dragon. Check your props for a weapon (display(Items). Choose weapon. 
        //Congratulation, you defeated the goblin/dragon but lost 2 healtpoints. You're current healtpoint is set to... get.healtPoints. 
        
        
        //sätt dörrar till rummen här
        roomStart.setW(new Door("w", room1, false));
        roomStart.setE(new Door("e", room2, false));
        
        room1.setE(new Door("e", room3, false));
        room1.setW(new Door("w", room4, false));
       
        room2.setE(new Door("e", room6, false));
        room2.setW(new Door("w", room5, false));
        
        room3.setS(new Door("s", roomStart, false));
        room6.setS(new Door("s", roomStart, false));
               
        room4.setN(new Door("n", roomEnd, true));
 
        room5.setE(new Door("e", room4, false));
        room5.setW(new Door("w", room3, false));
        
        roomEnd.setS(new Door("s", roomStart, false));
        
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

        /*
        Key goldKey = new Key("GoldKey");
        Key silverKey = new Key("SilverKey");
        door.openLockedDoor();
        door.unlock(goldKey);
        door.unlock(silverKey);
        door.lock();

         */

    }
      
}
