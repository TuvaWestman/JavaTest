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
    private String Image;


   
    public Treasure(int goldValue, String Image) {
        super("""
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
        this.goldValue = goldValue;
        this.Image = Image;
    }


    public String getImage(){
        return Image;
    }

    @Override
    
        public void use(Player player){
        player.addGold(goldValue);
    }
        
        @Override
    public String toString(){
        return "Treasure";
    }

        public void setGoldValue() {
        this.goldValue = goldValue;
        }
        public int getGoldValue() {
        return goldValue;





    } 
        
}
