/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

/**
 *
 * @author Mjoha
 */
//Class attribute private gold value.Int
public class Treasure extends Item {
   
    private int goldValue;

    public Treasure(int goldValue) {
        this.name = "Treasure";
        this.goldValue = goldValue;
    }

       public void display() {
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
        System.out.println("Gold value: " + goldValue);
    }

    public int getGoldValue() {
        return goldValue;
    } 
}

