/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tuvaw
 */

/*
position- char - private (class attribute/instance variable)

locked(bool) - private (class attribute/instance variable)

isLocked()bool  - public (this is a method)
*/

public class Door {

    private String Riktning;
    private Room lederTill;


    // konstuktor (skapar objekt av klassen & sätter startvärde)
    public Door(String Riktning, Room lederTill) {
        this.Riktning = Riktning;
        this.lederTill = lederTill;
    }


    //kan finnas setters här, lägg till// setters.. (anteckning ta bort sen)
    public void setRiktning(String Riktning){
        this.Riktning = Riktning;
    }

    // getters för Door (attribut)
    public String getRiktning(){
        return Riktning;
    }


    public void setLederTill(Room lederTill){
        this.lederTill = lederTill;
    }

    public Room getLederTill(){
        return lederTill;
    }

}
