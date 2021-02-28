

package Community;

import java.util.ArrayList;


public class PatientDir {

    ArrayList<Patient> directory;
    
    public PatientDir() {
        this.directory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getDirectory() {
        return directory;
    }
    
    
    public Patient newPatient() {
        Patient patient = new Patient();
        directory.add(patient);
        patient.initializePerson();
        return patient;
    }
    
    @Override
    public String toString(){
        String returnString = new String();
        int i = 0;
        for (Patient patient: directory){
            returnString += "Patient "+i+":\n";
            returnString += patient;
        }
        
        return returnString;
    }
    
}
