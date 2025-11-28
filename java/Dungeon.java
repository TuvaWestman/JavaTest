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

public class Dungeon {

    private Player player;
    private Room currentRoom;
    private String welcomeMessage;



    public Dungeon(Player player, Room currentRoom, Door[] doors){
        this.player = player;
        this.currentRoom = currentRoom;
        this.doors = doors;
    }


    public void playGame(){
        System.out.printf("Welcome " + Player.getName() + "! %n");

        System.out.printf("To move, press n for north, s for south, w for west, e for east %n");

        while(!gameOver) {

            String command = input.nextLine();

            switch (command) {

                case "n":
                case "s":
                case "w":
                case "e":
                    movePlayer(command);
                    break;
                case "q":
                    gameOver = true;
                    System.out.println("Your exited the game");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }

        private void movePlayer{



        }



    }



}
