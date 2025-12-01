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

    private String Beskrivning;
    private Door [] DoorRiktning;   // skapar arrays för olika dörrar som går olika riktningar

    // konstruktor
    public Room (String Beskrivning, Door[] DoorRiktning){
        this.Beskrivning = Beskrivning;
        this.DoorRiktning = DoorRiktning;
    }

    //skriver ut beskrivningen utan att behöva ändra värden här
    public void visaBeskrivning() {
        System.out.println(Beskrivning);
    }


    public void visaDoor() {
        for(Door d : DoorRiktning){
            System.out.println("Du kan gå " + d.getRiktning());
        } //metod. Kopplar till Riktning i Doors för att hämta n, s, ö, v
        // d är alias från klassen Door där getRiktning kommer ifrån
    }


    public String getBeskrivning(){
        return Beskrivning;
    }

    public void setBeskrivning(String Beskrivning){
        this.Beskrivning = Beskrivning;
    }


    public void setDoorRiktning(Door[] DoorRiktning){
        this.DoorRiktning = DoorRiktning;
    }

    public Door[] getDoorRiktning(){
        return DoorRiktning;
    }

}
