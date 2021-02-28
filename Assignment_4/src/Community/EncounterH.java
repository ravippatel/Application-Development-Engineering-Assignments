
package Community;

import java.util.ArrayList;


class EncounterH {
    
    ArrayList<Encounter> encHistory;
    
    public EncounterH() {
        encHistory = new ArrayList<Encounter>();
    } 

    public ArrayList<Encounter> getHistory() {
        return encHistory;
    }

    public void setHistory(ArrayList<Encounter> history) {
        this.encHistory = history;
    }
    
    public void printHistory() {
        System.out.println(this);
    }
    
    public String toString() {
        String returnString = new String();
        returnString += "";
        int i = 1;
        for (Encounter visit: getHistory()) {
            returnString+="\n Encounter History - "+i+": \n";
            returnString += visit;
            i++;
        }
        return returnString;
    }
    
}
