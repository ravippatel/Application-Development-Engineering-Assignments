/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*
 * @author  dell
 */
package PersonModel;

import java.util.ArrayList;


class EncounterH {
    
    ArrayList<Encounter> history;
    
    public EncounterH() {
        history = new ArrayList<Encounter>();
    } 

    public ArrayList<Encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Encounter> history) {
        this.history = history;
    }
    
    public void printHistory() {
        System.out.println(this);
    }
    
    public String toString() {
        String returnString = new String();
        returnString += "";
        int i = 1;
        for (Encounter visit: getHistory()) {
            returnString+="\nVisit "+i+": \n";
            returnString += visit;
            i++;
        }
        return returnString;
    }
    
}
