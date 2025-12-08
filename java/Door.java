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

    private String direction;
    private Room isLeadingTo;


    // konstuktor (skapar objekt av klassen & sätter startvärde)
    public Door(String direction, Room isLeadingTo) {
        this.direction = direction;
        this.isLeadingTo = isLeadingTo;
    }


    //kan finnas setters här, lägg till// setters.. (anteckning ta bort sen)
    public void setDirection(String Direction){
        this.direction = direction;
    }

    // getters för Door (attribut)
    public String getDirection(){
        return direction;
    }


    public void setIsLeadingTo(Room isLeadingTo){
        this.isLeadingTo = isLeadingTo;
    }

    public Room getIsLeadingTo(){
        return isLeadingTo;
    }

}
