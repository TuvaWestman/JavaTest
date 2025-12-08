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

    private String roomDescription ="";
    private Door n;  
    private Door s;
    private Door e;
    private Door w;

    // konstruktor
    public Room (String roomDescription){
        this.roomDescription = roomDescription;
    }
    
    public void setN(Door door) {this.n = door;}
    public void setS(Door door) {this.s = door;}
    public void setW(Door door) {this.w = door; }
    public void setE(Door door) {this.e = door;}

    public Door getN() {
        return n;
    }
    public Door getS() {
        return s;
    }
    public Door getE() {
        return e;
    }
    public Door getW() {
        return w;
    }
    
     //skriver ut beskrivningen utan att behöva ändra värden här
    public void doNarrative() {
        System.out.printf("%s%n%n", roomDescription);
        System.out.printf("There are doors leading to: ");
        




        //if (n != null)
        /*for (Door door: doors) {
          System.out.printf("%c", door.position);
        }*/
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
