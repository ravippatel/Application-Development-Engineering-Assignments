/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientDetails;

import PatientDetails.VitalSigns;
import PatientDetails.Patient;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Patient> patientList = new ArrayList<Patient>();
        int patientId = 0;
        
        while (true){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Add patient(1)");
        System.out.println("Check new vital signs(2)");
        System.out.println("Check history(3)");
        System.out.println("Exit(4)");
 
        int option = input.nextInt();
        while (true){
            if (option <0  || option > 4){
                System.out.println("select 1 to 4");
                option = input.nextInt();
            }
            else{
                break;
            }
        }
        
        if ( option == 1){         
            
            Patient patient = new Patient();
            VitalSigns vitalSigns = new VitalSigns();
            System.out.println("Enter Name: ");
            String name = input.next();
            patient.setName(name);            
            patientId = patientId+1;
            patient.setId(patientId);            
            System.out.println("Patient ID is : "+ patientId);
            System.out.println("Enter age in Years: ");        
            float age = input.nextFloat();
            vitalSigns.setAgeGroup(age);
            System.out.println("Enter Respiratory Rate: ");
            vitalSigns.setRespRate(input.nextInt());
            System.out.println("Enter Heart Rate: ");
            vitalSigns.setHeartRate(input.nextInt());
            System.out.println("Enter Blood Pressure: ");
            vitalSigns.setBloodPressure(input.nextInt());
            System.out.println("Enter weight in KG ");
            vitalSigns.setWeightInKgs(input.nextFloat());
            System.out.println("Enter weight in Pound: ");
            vitalSigns.setWeightInPounds(input.nextFloat());       
            patient.vitalSignHistory.add(vitalSigns);
            patientList.add(patient);            
            boolean var = patient.isPatientNormal(vitalSigns);
            if (var == true)
            {

                System.out.println("Vital signs are normal.");
            }
            else{
                System.out.println("Vital signs are not normal");
            }
            System.out.println("Do you want to check perticular vital sign level (Y/N)?");
            char r = input.next().charAt(0);
            while (r != 'y' && r != 'n') {
                System.out.println("Please enter Y/N");
                r = input.next().charAt(0);
            }
            if (r == 'y') {
                
                System.out.println("Please name of vital sign.\n1. Respiratory Rate\n2. Heart Rate\n3. Blood Pressure\n4. Weight in KG\n5. Weight in Pound ");

                String vsign = input.nextLine();
                vsign+=input.nextLine();

                boolean isNormal = Patient.isThisVitalSignNormal(vitalSigns, vsign);
                
                if (isNormal == true){
                    System.out.println("Patient's "+ vsign + " is in normal range.");
                    
                }
                else{
                    System.out.println("Patient's "+ vsign + " is not in normal range.");
                    
                }
                
            } else if (r == 'n') {
                System.out.println("Thank You!");
                continue;
            }
            
            
            
        }

        
        
        else if (option == 2){
            System.out.println("Please enter patient ID:");
            int id = input.nextInt();
            
            Patient patient = patientList.get(id-1);
            System.out.println("Enter patient's new vital signs");
            
            
            VitalSigns vitalSigns = new VitalSigns();
            
            System.out.println("Enter age in Years: ");
        
            float age = input.nextFloat();
            while (true){
                if (age < 0 || age > 100){
                    System.out.println("Enter age between 0 to 100");
                    age = input.nextFloat();
                }
                else{
                    break;
                }
            }

            vitalSigns.setAgeGroup(age);

            System.out.println("------------------------------------------------");
            if((vitalSigns.getAgeGroup()>=0 && vitalSigns.getAgeGroup()<0.12)){
                System.out.println("Patient is a newborn Baby");
            }
            else if((vitalSigns.getAgeGroup()>=0.12 && vitalSigns.getAgeGroup()<1)){
                System.out.println("Patient ia an Infant (1-12 Months)");

            }
            else if((vitalSigns.getAgeGroup()>=1 && vitalSigns.getAgeGroup()<3)){
                System.out.println("Patient ia a Toddler (1-3 Years)");

            }
            else if((vitalSigns.getAgeGroup()>=3 && vitalSigns.getAgeGroup()<=5)){
                System.out.println("Patient is a Preschooler (3-5 Years)");

            }
            else if((vitalSigns.getAgeGroup()>=6 && vitalSigns.getAgeGroup()<=12)){
                System.out.println("Patient is in School Age (6-12 Years)");

            }
            else if(vitalSigns.getAgeGroup()>=13 && (vitalSigns.getAgeGroup()<=100)){
                System.out.println("Patient is an Adolescent (13+ Years)");

            }

            System.out.println("Enter Respiratory Rate: ");
            vitalSigns.setRespRate(input.nextInt());

            System.out.println("Enter Heart Rate: ");
            vitalSigns.setHeartRate(input.nextInt());

            System.out.println("Enter Blood Pressure: ");
            vitalSigns.setBloodPressure(input.nextInt());

            System.out.println("Enter weight in KG ");
            vitalSigns.setWeightInKgs(input.nextFloat());

            System.out.println("Enter weight in Pound: ");
            vitalSigns.setWeightInPounds(input.nextFloat());
            
            patient.vitalSignHistory.add(vitalSigns);
            
       
            
            boolean var = patient.isPatientNormal(vitalSigns);

            if (var == true)
            {

                System.out.println("Patient's vital signs are normal.");
            }
            else{
                System.out.println("Patient's vital signs are not normal.");
            }
            
            System.out.println("Do you want to check perticular vital sign level");
            char resp = input.next().charAt(0);
            while (resp != 'y' && resp != 'n') {
                System.out.println("Please enter Y/N");
                resp = input.next().charAt(0);
            }
            if (resp == 'y') {
                
                System.out.println("Please enter the name of vital sign.\n1. Respiratory Rate\n2. Heart Rate\n3. Blood Pressure\n4. Weight in KG\n5. Weight in Pound");

                String vsign = input.nextLine();
                vsign+=input.nextLine();
                System.out.println(vsign);

                boolean isNormal = Patient.isThisVitalSignNormal(vitalSigns, vsign);
                if (isNormal == true){
                    System.out.println("Patient's"+ vsign + " is in normal range.");
                    
                }
                else{
                    System.out.println("Patient's"+ vsign + " is not in normal range.");
                    
                }
                
                
            } else if (resp == 'n') {
                System.out.println("Thank You!");
                continue;
            }
        
        }
        
        else if (option == 3){
            System.out.println("Enter patient ID:");
            int id = input.nextInt();
            
            Patient patient = patientList.get(id-1);
            
            for (VitalSigns v : patient.vitalSignHistory) {
                System.out.println("Age: "+v.getAgeGroup());
                System.out.println("Respiratory Rate: "+v.getRespRate());
                System.out.println("Heart Rate: "+v.getHeartRate());
                System.out.println("Blood Pressure: "+v.getBloodPressure());
                System.out.println("Weight in KGs: "+v.getWeightInKgs());
                System.out.println("Weight in Pounds: "+v.getWeightInPounds());
                
            }
        }
        
        else if (option == 4){
            break;
        }
        System.out.println("\nDo you want to exit ? (Y/N)");
        
        char response = input.next().charAt(0);
        while (response != 'y' && response != 'n') {
          System.out.println("\nPlease enter Y/N");
          response = input.next().charAt(0);
        }
        
        if (response == 'y') {
          System.out.println("\nThank You!");
          break;
        } else if (response == 'n') {
          continue;
        }
         
    }
    }
}
