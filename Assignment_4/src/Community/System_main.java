

package Community;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class System_main {
    
    static PatientDir PatientDir = new PatientDir();
    static PersonDir PersonDir = new PersonDir();
    static int patientID = 1000;
    
    
    public static void main(String args[]) throws Throwable{
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            mainMenu();
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    Person person = PersonDir.newPerson();
                    System.out.println("\n\u001B[1m Person  " + person.getFullName() + " has been created successfully!!");
                    break;
                case 2:
                    showFullList();
                    break;
                
                case 3:
                    Patient patient = PatientDir.newPatient();
                    
                    patient.newEncounter();
                    System.out.println("\n\u001B[1m Patient  " + patient.getFullName() + " has been created successfully!!");
                    patient.setId(patientID + 1);
                    System.out.println("The Patient ID is:  "+ patient.getId());
                    break;   
                case 4:
                    showAllPatients();
                    break;
                case 5:
                    checkEachCommunity();
                    break;
              
                
                case 6:
                    return;
            }
        }while(choice != 6);
        
    }
    
    
    
    private static void mainMenu(){
        System.out.println("\nPick an option from Below:");
        System.out.println(" 1 - Add Person");
        System.out.println(" 2 - View All Person");
        System.out.println(" 3 - Add Patient");
        System.out.println(" 4 - View all Patients");
        System.out.println(" 5 - Abnormal BP in Each Community");
        
        System.out.println(" 6 - Exit");
        System.out.println("\n");
    }
    
    private static void checkEachCommunity(){
        
        HashMap<String, Integer> commVal = new HashMap<String, Integer>();
         for(Patient patient: PatientDir.getDirectory()) {
            if(!(commVal.containsKey(patient.getCommunityName()))){
                commVal.put(patient.getCommunityName(), 0);
            }
         }
         
         for(Patient patient: PatientDir.getDirectory()) {
             Integer abNormCount = commVal.get(patient.getCommunityName());
            if(commVal.containsKey(patient.getCommunityName()) && !patient.isPatientBpNormal()){
                abNormCount++;
                commVal.put(patient.getCommunityName(), abNormCount);
            }
         }
         
         System.out.println("\nCommunity: " + commVal.keySet().toString());
                System.out.println("\nAbnormal Count: " + commVal.values());
        
    
    }
    
    
      
    private static ArrayList<City> viewAllCities(Boolean getFullList){
        Set<City> distCity = new HashSet<>();
        for(Person p: PersonDir.getDirectory()) {
            if(distCity.isEmpty()) {
                distCity.add((City)p);
            }
            else {
                for(City city: distCity) {
                    if(p.getCityName().equals(city.getCityName()))
                        continue;
                    else
                        distCity.add((City)p);
                }
            }
        }
        int i = 1;
        ArrayList<City> distCityRecords = new ArrayList<>();
        for(City city: distCity) {
            if(getFullList)
                System.out.printf("%3d. %s\n",i,city.getCityName());
            distCityRecords.add(city);
            i++;
        }
        return distCityRecords;
    }
    
    private static void showAllCityDetails(){
        int i = 1;
        int choice;
        String selectedCity;
        Scanner scanner = new Scanner(System.in);
        ArrayList<City> allCities = viewAllCities(true);
        System.out.println("\nSelect a City to get the complete details for that City !!");
        try {
            choice = scanner.nextInt();
            selectedCity = PersonDir.perDirectory.get(choice - 1).getCityName();
            showSelectedCity(selectedCity);
        }
        catch(Exception e){
            System.out.println("\u001B[1m  Navigating Back to Previous Menu\n");
        }
    }
    
    private static ArrayList<Community> showAllCommunities(Boolean print){
        Set<Community> distinctCommunities = new HashSet<>();
        for(Patient p: PatientDir.getDirectory()) {
            if(distinctCommunities.isEmpty()) {
                distinctCommunities.add((Community)p);
            }
            else {
                for(Community community: distinctCommunities) {
                    if(p.getCommunityName().equals(community.getCommunityName()) && 
                            p.getCityName().equals(community.getCityName()))
                        continue;
                    else
                        distinctCommunities.add((Community)p);
                }
            }
        }
        
        
        int i = 1;
        ArrayList<Community> distinctCommunitiesList = new ArrayList<>();
        for(Community community: distinctCommunities) {
            if(print)
                System.out.printf("%3d. %s, %s\n",i,community.getCommunityName(), community.getCityName());
            distinctCommunitiesList.add(community);
            i++;
        }
        return distinctCommunitiesList;
    }
    
    private static void showAllCommunityDetails(){
        int i = 1;
        int choice;
        String selectedCommunity;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Community> allCommunities = showAllCommunities(true);
        System.out.println("\nChoose a community to get it's details: ");
        try {
            choice = scanner.nextInt();
            selectedCommunity = allCommunities.get(choice - 1).getCommunityName();
            showSelectedCommunity(selectedCommunity, PersonDir.perDirectory.get(choice - 1).getCityName());
        }
        catch(Exception e){
            System.out.println("\u001B[1m  Navigating Back to Previous Menu\n");
        }
        
    }
    
    private static void showFullList(){
        
        int i = 1;
        int choice;
        if(PersonDir.getDirectory().isEmpty()) {
            String text = "No Person/Patient is created yet!!";
            System.out.println("\n\u001B[1m" + text);
            return;
        }
            
        Person selectedPerson;
        Scanner scanner = new Scanner(System.in);
        for(Person person: PersonDir.getDirectory()){
            System.out.printf("%3d. %s\n",i,person.getFullName());
            i++;
        }
        System.out.println("\n Choose a person to get their complete details: ");
        try {
            choice = scanner.nextInt();
            selectedPerson = PersonDir.perDirectory.get(choice - 1);
            showSelectedPerson(selectedPerson);
        }
        catch(Exception e){
            System.out.println("\n Navigating Back to Previous Menu\n");
        }
    }
    
    private static void showSelectedPerson(Person person){
        System.out.println(person);
        int choice;
        Scanner scanner = new Scanner(System.in);
        if(person instanceof Patient){
            System.out.println( "\n\u001B[1m" + person.getFullName() + " has visited the Hospital");
            patientMenu((Patient)person);
        }
        else {
            System.out.println("\n\nNote :");
            System.out.println(person.getFullName() + " has never visited the Hospital");
           
        }
    }
    
    private static void patientMenu(Patient patient) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Choose one option from below for "+patient.getName());
            System.out.println("   1. Get the Date Basic Details of: "+ patient.getName());
            System.out.println("   2. Get Hospital Visits (Date and time)");
            System.out.println("   3. Get Vital Signs from recent Hospital Visit");
            System.out.println("   4. Get Vital Signs from all Hospital Visits");
            System.out.println("   5. Check if all Vital Signs are Normal");
            System.out.println("   6. Check if the given Vital Sign is Normal");
            System.out.println("   7. Add new visit to Hospital");
            System.out.println("   9. Back to Previous Menu");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println((Person)patient);
                    break;
                case 2:
                    int i = 1;
                    if(patient.getEncounterHistory().getHistory().size() == 0)
                        System.out.println("Patient has only 1 visit\n");
                    else 
                        for(Encounter encounter: patient.getEncounterHistory().getHistory()) {
                            System.out.printf("%3d. %s\n",i,encounter.getEncounterDatetime());
                            i++;
                        }
                    System.out.printf("%3d. %s\n",i,patient.getEncounter().getEncounterDatetime());
                    break;
                case 3:
                    System.out.println(patient.getEncounter());
                    break;
                case 4:
                    patient.getEncounterHistory().printHistory();
                    System.out.println("Latest Visit: ");
                    System.out.println(patient.getEncounter());
                    break;
                case 5:
                    if(patient.isPatientNormal())
                        System.out.println("Patient Vital Signs are in Normal Condition");
                    else
                        System.out.println("Patient Vital Signs are Abnormal");
                    break;
                case 6:
                    System.out.print("\nChoose one of the Vital Signs from Below:\n"
                                + "\tRespiratory Rate\n"
                                + "\tHeart Rate\n"
                                + "\tSystolicBP\n"
                                + "\tWeight\n"
                                + "\nEnter the VitalSign Name: ");
                    scanner = new Scanner(System.in);
                    String condition = scanner.nextLine();
                    if(patient.isThisVitalSignNormal(condition)) 
                        System.out.println(condition+" for "+patient.getName()+" is Normal");
                    else if(!patient.isThisVitalSignNormal(condition))
                        System.out.println(condition+" for "+patient.getName()+" is Abnormal");
                    break;
                case 7:
                    patient.newEncounter();
                    break;
                case 9:
                    return;
            }
        }
    }
    
    private static void showAllPatients(){
        
        if(PatientDir.getDirectory().isEmpty()) {
            System.out.println("\u001B[1m There are no patients created !! ");
            return;
        }
        
        int i = 1;
        int choice;
        Scanner scanner = new Scanner(System.in);
        Patient selectedPatient;
        for(Patient patient: PatientDir.getDirectory()){
            System.out.printf("%3d. %s\n",i,patient.getFullName());
            i++;
        }
        System.out.println("\nChoose a patient to get their details: ");
        try {
            choice = scanner.nextInt();
            selectedPatient = PatientDir.getDirectory().get(choice - 1);
            patientMenu(selectedPatient);
        }
        catch(Exception e) {
            System.out.println("\u001B[1m  Navigating to Main Menu\n");
        }
    }

    private static void printPatient(Patient patient) {
        System.out.println("Encounter History of "+patient.getName()+":");
        patient.getEncounterHistory().printHistory();
        System.out.println("\nLatest Encounter Details: ");
        System.out.println("\u001B[1m " + patient.getEncounter());
    }

    private static Patient addVisit(Person person) {
        Patient patient = null;
        if (person instanceof Patient) {
            patient = (Patient)person;
            patient.newEncounter();
        }
        else {
            patient = new Patient(person);
            PatientDir.getDirectory().add(patient);
            PatientDir.getDirectory().remove(person);
            PatientDir.getDirectory().add(patient);
            patient.newEncounter();
        }
        return patient;
    } 

    private static void showSelectedCommunity(String selectedCommunity, String selectedCity) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int good = 0;
            int bad = 0;
            System.out.println("\nChoose one of the following:\n");
            System.out.println(" 1. Show count of patients with good and bad overall Vital Signs");
            System.out.println(" 2. Show count of normal and abnormal patients with given vitalSign");
            System.out.println(" 3. Go to previous menu");
            int choice = scanner.nextInt();
            scanner = new Scanner(System.in);
            switch(choice){
                case 1:
                    for(Patient patient: PatientDir.getDirectory()) {
                        if(patient.isPatientNormal() && patient.getCommunityName().equals(selectedCommunity)
                                && patient.getCityName().equals(selectedCity))
                            good++;
                        else
                            bad++;
                    }
                    System.out.println("\u001B[1m Patients with Normal Condition: "+good);
                    System.out.println("\u001B[1m  Patients with abormal Condition: "+bad);
                    break;
                case 2:
                    System.out.println("\nEnter the Vital Sign Name to check: ");
                    scanner = new Scanner(System.in);
                    String condition = scanner.nextLine();
                    for(Patient patient: PatientDir.getDirectory()) {
                        if(patient.isThisVitalSignNormal(condition))
                            good++;
                        else
                            bad++;
                    }
                    System.out.println("\u001B[1m  Patients with Normal "+condition + " :"+good);
                    System.out.println("\u001B[1m  Patients with abormal "+condition + " :"+bad);
                    break;
                case 3:
                    return;
            }
        }
    }
    
    private static void showSelectedCity(String selectedCity) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int good = 0;
            int bad = 0;
            System.out.println("\nChoose one of the following:\n");
            System.out.println(" 1. Show count of patients with good and bad overall Vital Signs");
            System.out.println(" 2. Show count of normal and abnormal patients with given vitalSign");
            System.out.println(" 3. Go to previous menu");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    for(Patient patient: PatientDir.getDirectory()) {
                        if(patient.isPatientNormal() && patient.getCityName().equals(selectedCity))
                            good++;
                        else
                            bad++;
                    }
                    System.out.println("\u001B[1m  Patients with Normal Condition: "+good);
                    System.out.println("\u001B[1m  Patients with abormal Condition: "+bad);
                    break;
                case 2:
                    System.out.println("\nEnter the Vital Sign Name to check: ");
                    scanner = new Scanner(System.in);
                    String condition = scanner.nextLine();
                    for(Patient patient: PatientDir.getDirectory()) {
                        if(patient.isThisVitalSignNormal(condition))
                            good++;
                        else
                            bad++;
                    }
                    System.out.println("\u001B[1m  Patients with Normal "+condition + " :"+good);
                    System.out.println("\u001B[1m  Patients with abormal "+condition + " :"+bad);
                    break;
                case 3:
                    return;
            }
        }
    }
    

}
