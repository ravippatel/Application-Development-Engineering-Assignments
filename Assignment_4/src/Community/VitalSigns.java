
package Community;

import java.util.Scanner;


public class VitalSigns {

    double respRate;
    double heartRate;
    double bp;
    double wtKilo;
    double wtPound;
    Boolean areVsNormal;
    
    public VitalSigns(){
        Boolean good = false;
        Scanner scanner = new Scanner(System.in);
        while(!good) {
            try {
                scanner = new Scanner(System.in);
                System.out.println("\nRespiratory Rate: \n");
                this.respRate = scanner.nextDouble();
                System.out.println("\nHeart Rate: \n");
                this.heartRate = scanner.nextDouble();
                System.out.println("\nBlood Pressure: \n");
                this.bp = scanner.nextDouble();
                System.out.println("\nWeight(in Kgs): \n");
                this.wtKilo = scanner.nextDouble();
                this.wtPound = this.wtKilo * 2.20462262;
                good = true;
            }
            catch(Exception e){
                System.out.println("\n");
            }
        }
    }
    
    public VitalSigns(double respiratoryRate, double heartRate, double systolicBP, double weightInKilos) { //, double wtPound){
        this.respRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bp = systolicBP;
        this.wtKilo = weightInKilos;
        this.wtPound = weightInKilos * 2.20462262;
        
    }
    
    public void updateVitalSigns(double respiratoryRate, double heartRate, double systolicBP, double weightInKilos) { //, double wtPound){
        this.respRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bp = systolicBP;
        this.wtKilo = weightInKilos;
        this.wtPound = weightInKilos * 2.20462262;
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
        return bp;
    }

    public void setSystolicBP(double systolicBP) {
        this.bp = systolicBP;
    }

    public double getWtKilo() {
        return wtKilo;
    }

    public void setWtKilo(double wtKilo) {
        this.wtKilo = wtKilo;
    }

    public double getWtPound() {
        return wtPound;
    }

    public void setWtPound(double wtPound) {
        this.wtPound = wtPound;
    }

    public Boolean getAreVsNormal() {
        return areVsNormal;
    }

    public void setAreVsNormal(Boolean areVsNormal) {
        this.areVsNormal = areVsNormal;
    }

    
    Boolean isRespiratoryRateNormal(Patient patient){
        
        VitalSignsNormal vitalSignsNormal = new VitalSignsNormal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        return vitalSigns.respRate >= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("to")[0]) && 
                vitalSigns.respRate <= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("to")[1]);
    }
    
    Boolean isHeartRateNormal(Patient patient){
        
        VitalSignsNormal vitalSignsNormal = new VitalSignsNormal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        return vitalSigns.heartRate >= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("to")[0]) && 
                vitalSigns.heartRate <= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("to")[1]);
    }
    
    Boolean isSystolicBPNormal(Patient patient){
        
        VitalSignsNormal vitalSignsNormal = new VitalSignsNormal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        return vitalSigns.bp >= Double.parseDouble(vitalSignsNormal.BloodPressure.get(ageGroup).split("to")[0]) && 
                vitalSigns.bp <= Double.parseDouble(vitalSignsNormal.BloodPressure.get(ageGroup).split("to")[1]);
    }
    
    Boolean isWeightNormal(Patient patient){
        
        VitalSignsNormal vitalSignsNormal = new VitalSignsNormal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        return vitalSigns.wtKilo >= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("to")[0]) && 
                vitalSigns.wtKilo <= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("to")[1]);
    }

    Boolean areVitalSignsNormal(Patient patient) {
        return isRespiratoryRateNormal(patient) && isHeartRateNormal(patient) && isSystolicBPNormal(patient) && isWeightNormal(patient);
    }
     Boolean isBpNormal(Patient patient) {
        return isSystolicBPNormal(patient);
    }

    private int compareVitalSigns(VitalSigns vitalSigns, String ageGroup) {
        int result = 0;
        
        VitalSignsNormal vitalSignsNormal = new VitalSignsNormal();
        
       if(vitalSigns.respRate >= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("to")[0]) && 
                vitalSigns.respRate <= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("to")[1]))
            result = 0;
        
        else 
            return 1;
        
        if(vitalSigns.heartRate >= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("to")[0]) && 
                vitalSigns.heartRate <= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("to")[1]))
            result = 0;
        else 
            return 2;
        
        if(vitalSigns.bp >= Double.parseDouble(vitalSignsNormal.BloodPressure.get(ageGroup).split("to")[0]) && 
                vitalSigns.bp <= Double.parseDouble(vitalSignsNormal.BloodPressure.get(ageGroup).split("to")[1]))
            result = 0;
        else 
            return 3;
        
        if(vitalSigns.wtKilo >= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("to")[0]) && 
                vitalSigns.wtKilo <= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("to")[1]))
            result = 0;
        else 
            return 4;
        
        if(vitalSigns.wtPound >= Double.parseDouble(vitalSignsNormal.weightInPounds.get(ageGroup).split("to")[0]) && 
                vitalSigns.wtPound <= Double.parseDouble(vitalSignsNormal.weightInPounds.get(ageGroup).split("to")[1]))
            result = 0;
        else 
            return 5;
        if(vitalSigns.bp >= Double.parseDouble(vitalSignsNormal.BloodPressure.get(ageGroup).split("to")[0]) && 
                vitalSigns.bp <= Double.parseDouble(vitalSignsNormal.BloodPressure.get(ageGroup).split("to")[1]))
            result = 0;
        else 
            return 3;
        
        return result;
    }
    
    private int compareVitalSigns(Patient patient) {
        int result = 0;
        
        if(!isRespiratoryRateNormal(patient))
            return 1;
        
        if(!isHeartRateNormal(patient))
            return 2;
        
        if(!isSystolicBPNormal(patient))
            return 3;
        
       if(!isWeightNormal(patient))
            return 4;
        
        return result;
    }
    
    @Override
    public String toString(){
        return //"  DateTime: " + this.vitalSignDatetime + 
                "\n  Respiratory Rate: "+ this.respRate + "\n  Heart Rate: "+this.heartRate
                + "\n  Systolic Blood Pressure: "+this.bp+"\n  Weight(KG): "+this.wtKilo
                + String.format("\n  Weight(lbs): %6.2f", this.wtPound);
    }

    Boolean isThisVitalSignNormal(Patient patient, String vitalSign) {
      
       if(vitalSign.toLowerCase().equals("Respiratory Rate".toLowerCase()))
            return isRespiratoryRateNormal(patient);
        else if (vitalSign.toLowerCase().equals("Heart Rate".toLowerCase()))
            return isHeartRateNormal(patient);
        else if (vitalSign.toLowerCase().equals("Blood Pressure".toLowerCase()))
            return isSystolicBPNormal(patient);
        else if (vitalSign.toLowerCase().equals("Weight".toLowerCase()))
            return isWeightNormal(patient);
        if (vitalSign.toLowerCase().equals("Blood Pressure".toLowerCase()))
            return isSystolicBPNormal(patient);
        else
            System.out.println("Vital Sign details not found.\n");
        
        return null;
    }
    
}
