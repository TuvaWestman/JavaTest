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
    private Door isLeadingTo;


    // konstuktor (skapar objekt av klassen & sätter startvärde)
    public Door(String direction, Door isLeadingTo) {
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


    public void setIsLeadingTo(Door isLeadingTo){
        this.isLeadingTo = isLeadingTo;
    }

    public Door getIsLeadingTo(){
        return isLeadingTo;
    }

}
