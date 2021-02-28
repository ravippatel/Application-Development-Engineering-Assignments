
package Community;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Encounter {

    VitalSigns vs;
    String encDate;

    public Encounter() {
        this.vs = new VitalSigns();
        this.encDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD hh:mm:ss"));
    }

    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }

    public String getEncounterDatetime() {
        return encDate;
    }

    public void setEncounterDatetime(String encounterDatetime) {
        this.encDate = encounterDatetime;
    }
    
    @Override
    public String toString(){
        return "\n The Encounter Datetime is : "+this.encDate +this.vs;
    }
    
}
