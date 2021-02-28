/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author  dell
 */
package PersonModel;

import java.util.Scanner;

public class VitalSigns {

    double respRate;
    double heartRate;
    double BloodPressure;
    double weightInKilos;
    double weightInPounds;
    Boolean areVitalSignsNormal;
    
    public VitalSigns(){
        Boolean good = false;
        Scanner scanner = new Scanner(System.in);
        while(!good) {
            try {
                scanner = new Scanner(System.in);
                System.out.println("\nEnter following Vital Sign Details: \n");
                System.out.println("Respiratory Rate\n");
                this.respRate = scanner.nextDouble();
                 System.out.println("HeartRate\n");
                this.heartRate = scanner.nextDouble();
                 System.out.println("Blood Pressure\n");
                this.BloodPressure = scanner.nextDouble();
                 System.out.println("Weight In Kilos\n");
                this.weightInKilos = scanner.nextDouble();
                this.weightInPounds = this.weightInKilos * 2.20462262;
                good = true;
            }
            catch(Exception e){
                System.out.println("Enter values in correct format.\n");
            }
        }
    }
    
    public VitalSigns(double respiratoryRate, double heartRate, double systolicBP, double weightInKilos) { //, double weightInPounds){
        this.respRate = respiratoryRate;
        this.heartRate = heartRate;
        this.BloodPressure = systolicBP;
        this.weightInKilos = weightInKilos;
        this.weightInPounds = weightInKilos * 2.20462262;
        
    }
    
    public void updateVitalSigns(double respiratoryRate, double heartRate, double systolicBP, double weightInKilos) { //, double weightInPounds){
        this.respRate = respiratoryRate;
        this.heartRate = heartRate;
        this.BloodPressure = systolicBP;
        this.weightInKilos = weightInKilos;
        this.weightInPounds = weightInKilos * 2.20462262;
    }

    public double getRespiratoryRate() {
        return respRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getSystolicBP() {
        return BloodPressure;
    }

    public void setSystolicBP(double systolicBP) {
        this.BloodPressure = systolicBP;
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public Boolean getAreVitalSignsNormal() {
        return areVitalSignsNormal;
    }

    public void setAreVitalSignsNormal(Boolean areVitalSignsNormal) {
        this.areVitalSignsNormal = areVitalSignsNormal;
    }

    Boolean isRespiratoryRateNormal(Patient patient){
        
        Signs_Normal vitalSignsNormal = new Signs_Normal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        return vitalSigns.respRate >= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("-")[0]) && 
                vitalSigns.respRate <= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("-")[1]);
    }
    
    Boolean isHeartRateNormal(Patient patient){
        
        Signs_Normal vitalSignsNormal = new Signs_Normal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        return vitalSigns.heartRate >= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("-")[0]) && 
                vitalSigns.heartRate <= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("-")[1]);
    }
    
    Boolean BloodPressureNormal(Patient patient){
        
        Signs_Normal vitalSignsNormal = new Signs_Normal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        return vitalSigns.BloodPressure >= Double.parseDouble(vitalSignsNormal.systolicBP.get(ageGroup).split("-")[0]) && 
                vitalSigns.BloodPressure <= Double.parseDouble(vitalSignsNormal.systolicBP.get(ageGroup).split("-")[1]);
    }
    
    Boolean isWeightNormal(Patient patient){
        
        Signs_Normal vitalSignsNormal = new Signs_Normal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        return vitalSigns.weightInKilos >= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("-")[0]) && 
                vitalSigns.weightInKilos <= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("-")[1]);
    }

    Boolean areVitalSignsNormal(Patient patient) {
        return isRespiratoryRateNormal(patient) && isHeartRateNormal(patient) && BloodPressureNormal(patient) && isWeightNormal(patient);
    }    
    @Override
    public String toString(){
        return   "\n  Respiratory Rate: "+ this.respRate + "\n  Heart Rate: "+this.heartRate
                + "\n  Systolic Blood Pressure: "+this.BloodPressure+"\n  Weight(KG): "+this.weightInKilos
                + String.format("\n  Weight(lbs): %6.2f", this.weightInPounds);
    }

    Boolean isThisVitalSignNormal(Patient patient, String vitalSign) {      
        if(vitalSign.toLowerCase().equals("Respiratory Rate".toLowerCase()))
            return isRespiratoryRateNormal(patient);
        else if (vitalSign.toLowerCase().equals("Heart Rate".toLowerCase()))
            return isHeartRateNormal(patient);
        else if (vitalSign.toLowerCase().equals("Blood Pressure".toLowerCase()))
            return BloodPressureNormal(patient);
        else if (vitalSign.toLowerCase().equals("Weight".toLowerCase()))
            return isWeightNormal(patient);
        else
            System.out.println("Vital Sign not found.\n");
        return null;
    }
    
}
