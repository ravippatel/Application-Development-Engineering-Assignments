
package Community;


public class Patient extends Person{

    Boolean isPatientNorm;
    Encounter encounter;
    EncounterH encHistory;

    // Constructor for adding new person
    public Patient() {
       this.encHistory = new EncounterH(); 
    }
    
       // Constructor for getting Existing Person
    Patient(Person person) {
        this.fname = person.getFname();
        this.lname = person.getLname();
        this.ageGroup = person.getAgeGroup();
        this.dob = person.getDOB();
        this.houseNo = person.getHouseNum();
        this.commName = person.getCommunityName();
        this.cityName = person.getCityName();
        this.encHistory = new EncounterH();
    }
    
    public Boolean isPatientNormal(){
        return encounter.getVs().areVitalSignsNormal(this);
    }
    public Boolean isPatientBpNormal(){
        return encounter.getVs().isBpNormal(this);
    }
    
    public Boolean isThisVitalSignNormal(String vitalSign){
        return encounter.getVs().isThisVitalSignNormal(this, vitalSign);
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
        return encHistory;
    }

    public void setEncounterHistory(EncounterH encounterHistory) {
        this.encHistory = encounterHistory;
    }
    
    public Encounter newEncounter(){
        if (this.encounter != null){
            this.encHistory.getHistory().add(this.encounter);
        }
        this.encounter = new Encounter();
        this.isPatientNorm = this.isPatientNormal();
        encounter.vs.setAreVsNormal(this.isPatientNorm);
       
        return this.encounter;
    }

    VitalSigns getVitalSigns() {
        return this.getRecentEncounter().getVs();
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public Boolean getIsPatientNormal() {
        return isPatientNorm;
    }

    void setVitalSigns(VitalSigns vitalSigns) {
        this.newEncounter();
        this.encounter.setVs(vitalSigns);
    }
    
}
