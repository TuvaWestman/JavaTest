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

    private String description;
    private Door [] doors;   // skapar arrays för olika dörrar som går olika riktningar

    // konstruktor
    public Room (String description, Door[] doors){
        this.description = description;
        this.doors = doors;
    }

    //skriver ut beskrivningen utan att behöva ändra värden här
    public void displayDescription() {
        System.out.println(description);
    }
    
    public Door[] getDoors() {
        return doors;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }
}

/*
    public void displayDoor() {
        for(Door d : doors){
            System.out.println("You can choose direction" + d.getDirection());
        } //metod. Kopplar till Riktning i Doors för att hämta n, s, ö, v
        // d är alias från klassen Door där getRiktning kommer ifrån
    } 


    public String getDescription(){
        return Description;
    }

    public void setDescirption(String Description){
        this.description = description;
    }


    public void setDoorDirection(Door[] doors){
        this.doors = doors;
    }

    public Door[] getDoorDirection(){
        return doors;
    }
} */
