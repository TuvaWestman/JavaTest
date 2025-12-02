/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tuvaw
 */

/* 
roomDesc: Sting - private (class attribute, instance variable)
do Narritive():void - public (method, class operator)
*/



public class Room {

    private String Description;
    private Door [] DoorDirection;   // skapar arrays för olika dörrar som går olika riktningar

    // konstruktor
    public Room (String Description, Door[] DoorDirection){
        this.Description = Description;
        this.DoorDirection = DoorDirection;
    }

    //skriver ut beskrivningen utan att behöva ändra värden här
    public void displayDescription() {
        System.out.println(Description);
    }


    public void displayDoor() {
        for(Door d : DoorDirection){
            System.out.println("You can choose direction" + d.getDirection());
        } //metod. Kopplar till Riktning i Doors för att hämta n, s, ö, v
        // d är alias från klassen Door där getRiktning kommer ifrån
    }


    public String getDescription(){
        return Description;
    }

    public void setDescirption(String Description){
        this.Description = Description;
    }


    public void setDoorDirection(Door[] DoorDirection){
        this.DoorDirection = DoorDirection;
    }

    public Door[] getDoorDirection(){
        return DoorDirection;
    }

}
