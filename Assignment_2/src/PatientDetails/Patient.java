/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientDetails;
import PatientDetails.VitalSigns;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Patient {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    ArrayList<VitalSigns> vitalSignHistory = new ArrayList<VitalSigns>();
    
    public static boolean isPatientNormal(VitalSigns vitalSigns){     
        
        if((vitalSigns.getAgeGroup()>=0 && vitalSigns.getAgeGroup()<0.12) && 
           (vitalSigns.getRespRate()>=30 && vitalSigns.getRespRate()<=50) &&
           (vitalSigns.getHeartRate()>=120 && vitalSigns.getHeartRate()<=160)  &&
           (vitalSigns.getBloodPressure()>=50 && vitalSigns.getBloodPressure()<=70) &&
            (vitalSigns.getWeightInKgs()>=2 && vitalSigns.getWeightInKgs()<=3) &&
            (vitalSigns.getWeightInPounds()>=4.5 && vitalSigns.getWeightInPounds()<=7)
          ){
            return true;
        }
        
        else if((vitalSigns.getAgeGroup()>=0.12 && vitalSigns.getAgeGroup() < 1) && 
           (vitalSigns.getRespRate()>=20 && vitalSigns.getRespRate()<=30) &&
           (vitalSigns.getHeartRate()>=80 && vitalSigns.getHeartRate()<=140)  &&
           (vitalSigns.getBloodPressure()>=70 && vitalSigns.getBloodPressure()<=100) &&
            (vitalSigns.getWeightInKgs()>=4 && vitalSigns.getWeightInKgs()<=10) &&
            (vitalSigns.getWeightInPounds()>=9 && vitalSigns.getWeightInPounds()<=22)
          ){
            return true;
        }
        
        else if((vitalSigns.getAgeGroup()>=1 && vitalSigns.getAgeGroup() < 3) && 
           (vitalSigns.getRespRate()>=20 && vitalSigns.getRespRate()<=30) &&
           (vitalSigns.getHeartRate()>=80 && vitalSigns.getHeartRate()<=130)  &&
           (vitalSigns.getBloodPressure()>=80 && vitalSigns.getBloodPressure()<=110) &&
            (vitalSigns.getWeightInKgs()>=10 && vitalSigns.getWeightInKgs()<=14) &&
            (vitalSigns.getWeightInPounds()>=22 && vitalSigns.getWeightInPounds()<=31)
          ){
            return true;
        }
        
        else if((vitalSigns.getAgeGroup()>=3 && vitalSigns.getAgeGroup() <= 5) && 
           (vitalSigns.getRespRate()>=20 && vitalSigns.getRespRate()<=30) &&
           (vitalSigns.getHeartRate()>=80 && vitalSigns.getHeartRate()<=120)  &&
           (vitalSigns.getBloodPressure()>=80 && vitalSigns.getBloodPressure()<=110) &&
            (vitalSigns.getWeightInKgs()>=14 && vitalSigns.getWeightInKgs()<=18) &&
            (vitalSigns.getWeightInPounds()>=31 && vitalSigns.getWeightInPounds()<=40)
          ){
            return true;
        }
        
        else if((vitalSigns.getAgeGroup()>=6 && vitalSigns.getAgeGroup() <=12) && 
           (vitalSigns.getRespRate()>=20 && vitalSigns.getRespRate()<=30) &&
           (vitalSigns.getHeartRate()>=70 && vitalSigns.getHeartRate()<=110)  &&
           (vitalSigns.getBloodPressure()>=80 && vitalSigns.getBloodPressure()<=120) &&
            (vitalSigns.getWeightInKgs()>=20 && vitalSigns.getWeightInKgs()<=42) &&
            (vitalSigns.getWeightInPounds()>=41 && vitalSigns.getWeightInPounds()<=92)
          ){
            return true;
        }
        
        else if((vitalSigns.getAgeGroup()>=13) && 
           (vitalSigns.getRespRate()>=12 && vitalSigns.getRespRate()<=20) &&
           (vitalSigns.getHeartRate()>=55 && vitalSigns.getHeartRate()<=105)  &&
           (vitalSigns.getBloodPressure()>=110 && vitalSigns.getBloodPressure()<=120) &&
            (vitalSigns.getWeightInKgs()>50) &&
            (vitalSigns.getWeightInPounds()>110)
          ){
            return true;
        }
        
        else {
            return false;
        }
    }
    
    public static boolean isThisVitalSignNormal(VitalSigns vitalsigns, String s) {
        switch (s) {
            case "respiratory rate":
                if ((vitalsigns.getAgeGroup() == 0) && ((vitalsigns.getRespRate() >= 30) && (vitalsigns.getRespRate() <= 50)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 0.1) && (vitalsigns.getAgeGroup() <= 0.12)) && ((vitalsigns.getRespRate() >= 20) && (vitalsigns.getRespRate() <= 30)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 1) && (vitalsigns.getAgeGroup() <= 3)) && ((vitalsigns.getRespRate() >= 20) && (vitalsigns.getRespRate() <= 30)))
                    return true;
                else if (((vitalsigns.getAgeGroup() > 3) && (vitalsigns.getAgeGroup() <= 5)) && (((vitalsigns.getRespRate() >= 20) && (vitalsigns.getRespRate() <= 30))))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 6) && (vitalsigns.getAgeGroup() <= 12)) && ((vitalsigns.getRespRate() >= 20) && (vitalsigns.getRespRate() <= 30)))
                    return true;
                else if ((vitalsigns.getAgeGroup() >= 13) && ((vitalsigns.getRespRate() >= 12) && (vitalsigns.getRespRate() <= 20)))
                    return true;
                break;
            case "heart rate":
                if ((vitalsigns.getAgeGroup() == 0) && ((vitalsigns.getHeartRate() >= 120) && (vitalsigns.getHeartRate() <= 160)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 0.1) && (vitalsigns.getAgeGroup() <= 0.12)) && ((vitalsigns.getHeartRate() >= 80) && (vitalsigns.getHeartRate() <= 140)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 1) && (vitalsigns.getAgeGroup() <= 3)) && ((vitalsigns.getHeartRate() >= 80) && (vitalsigns.getHeartRate() <= 130)))
                    return true;
                else if (((vitalsigns.getAgeGroup() > 3) && (vitalsigns.getAgeGroup() <= 5)) && ((vitalsigns.getBloodPressure() >= 80) && (vitalsigns.getBloodPressure() <= 110)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 6) && (vitalsigns.getAgeGroup() <= 12)) && ((vitalsigns.getHeartRate() >= 70) && (vitalsigns.getHeartRate() <= 110)))
                    return true;
                else if ((vitalsigns.getAgeGroup() >= 13) && ((vitalsigns.getHeartRate() >= 55) && (vitalsigns.getHeartRate() <= 105)))
                    return true;
                break;
            case "blood pressure":
                if ((vitalsigns.getAgeGroup() == 0) && ((vitalsigns.getBloodPressure() >= 50) && (vitalsigns.getBloodPressure() <= 70)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 0.1) && (vitalsigns.getAgeGroup() <= 0.12)) && ((vitalsigns.getBloodPressure() >= 70) && (vitalsigns.getBloodPressure() <= 100)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 1) && (vitalsigns.getAgeGroup() <= 3)) && ((vitalsigns.getBloodPressure() >= 80) && (vitalsigns.getBloodPressure() <= 110)))
                    return true;
                else if (((vitalsigns.getAgeGroup() > 3) && (vitalsigns.getAgeGroup() <= 5)) && ((vitalsigns.getBloodPressure() >= 80) && (vitalsigns.getBloodPressure() <= 110)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 6) && (vitalsigns.getAgeGroup() <= 12)) && ((vitalsigns.getBloodPressure() >= 80) && (vitalsigns.getBloodPressure() <= 120)))
                    return true;
                else if ((vitalsigns.getAgeGroup() >= 13) && ((vitalsigns.getBloodPressure() >= 110) && (vitalsigns.getBloodPressure() <= 120)))
                    return true;
                break;
            case "weight in kilos":
                if ((vitalsigns.getAgeGroup() == 0) && ((vitalsigns.getWeightInKgs() >= 2) && (vitalsigns.getWeightInKgs() <= 3)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 0.1) && (vitalsigns.getAgeGroup() <= 0.12)) && ((vitalsigns.getWeightInKgs() >= 4) && (vitalsigns.getWeightInKgs() <= 10)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 1) && (vitalsigns.getAgeGroup() <= 3)) && ((vitalsigns.getWeightInKgs() >= 10) && (vitalsigns.getWeightInKgs() <= 14)))
                    return true;
                else if (((vitalsigns.getAgeGroup() > 3) && (vitalsigns.getAgeGroup() <= 5)) && ((vitalsigns.getWeightInKgs() >= 14) && (vitalsigns.getWeightInKgs() <= 18)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 6) && (vitalsigns.getAgeGroup() <= 12)) && ((vitalsigns.getWeightInKgs() >= 20) && (vitalsigns.getWeightInKgs() <= 42)))
                    return true;
                else if ((vitalsigns.getAgeGroup() >= 13) && (vitalsigns.getWeightInKgs() > 50))
                    return true;
                break;
            case "weight in pounds":
                if ((vitalsigns.getAgeGroup() == 0) && ((vitalsigns.getWeightInPounds() >= 4.5) && (vitalsigns.getWeightInPounds() <= 7)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 0.1) && (vitalsigns.getAgeGroup() <= 0.12)) && ((vitalsigns.getWeightInPounds() >= 9) && (vitalsigns.getWeightInPounds() <= 22)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 1) && (vitalsigns.getAgeGroup() <= 3)) && ((vitalsigns.getWeightInPounds() >= 22) && (vitalsigns.getWeightInPounds() <= 31)))
                    return true;
                else if (((vitalsigns.getAgeGroup() > 3) && (vitalsigns.getAgeGroup() <= 5)) && ((vitalsigns.getWeightInPounds() >= 31) && (vitalsigns.getWeightInPounds() <= 40)))
                    return true;
                else if (((vitalsigns.getAgeGroup() >= 6) && (vitalsigns.getAgeGroup() <= 12)) && ((vitalsigns.getWeightInPounds() >= 41) && (vitalsigns.getWeightInPounds() <= 92)))
                    return true;
                else if ((vitalsigns.getAgeGroup() >= 13) && (vitalsigns.getWeightInPounds() > 110))
                    return true;
                break;
            default:
                return false;
        }
        return false;
    }
}
