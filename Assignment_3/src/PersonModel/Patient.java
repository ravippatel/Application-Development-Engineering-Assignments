/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*
 * @author  dell
 */
package PersonModel;


public class Patient extends Person{
    
    Encounter encounter;
    EncounterH h;
    Boolean isPatientNormal;
    
    Patient(){
        this.h = new EncounterH();
    }
    
    Patient(Person person) {
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.ageGroup = person.getAgeGroup();
        this.dob = person.getDOB();
       
    }
    
    public Boolean isPatientNormal(){
        return encounter.getVitalSigns().areVitalSignsNormal(this);
    }
    
    public Boolean isThisVitalSignNormal(String vitalSign){
        return encounter.getVitalSigns().isThisVitalSignNormal(this, vitalSign);
    }

    public Encounter getRecentEncounter() {
        return encounter;
    }
    
    public String getName() {
        return getFullName();
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public EncounterH getEncounterHistory() {
        return h;
    }

    public void setEncounterHistory(EncounterH encounterHistory) {
        this.h = encounterHistory;
    }
    
    public Encounter newEncounter(){
        if (this.encounter != null)
            this.h.getHistory().add(this.encounter);
        this.encounter = new Encounter();
        this.isPatientNormal = this.isPatientNormal();
        encounter.vitalSigns.setAreVitalSignsNormal(this.isPatientNormal);
        return this.encounter;
    }

    VitalSigns getVitalSigns() {
        return this.getRecentEncounter().getVitalSigns();
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public Boolean getIsPatientNormal() {
        return isPatientNormal;
    }

    void setVitalSigns(VitalSigns vitalSigns) {
        this.newEncounter();
        this.encounter.setVitalSigns(vitalSigns);
    }
    
}
