
package Community;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Person extends House{

    String fname;
    int id;
    String lname;
    LocalDate dob;
    String ageGroup;
 
    public Person(){
        
    }
  
    public void initializePerson() {
        Scanner scanner = new Scanner(System.in);
        updateInfo();
        System.out.println("\nCommunity: ");
        this.commName = scanner.nextLine();
        
        System.out.println("\nHouse No: ");
        this.houseNo = scanner.nextLine();
        
        System.out.println("\nCity: ");
        this.cityName = scanner.nextLine();
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
    public String getFullName() {
        return fname + " " + lname;
    }

    public LocalDate getDOB() {
        return dob;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id =id;
    }

    
    

    public void setDob(LocalDate dob) {
        this.dob = dob;
        Period age = Period.between(dob, LocalDate.now());
        if(age.getYears() == 0 && age.getMonths() == 0){
            this.setAgeGroup("Newborn");
        }
        else if(age.getYears() == 0 && age.getMonths() <= 11 && age.getDays() <= 31){
            this.setAgeGroup("Infant");
        }
        else if(age.getYears() < 3 && age.getMonths() <= 11 && age.getDays() <= 31) {
            this.setAgeGroup("Toddler");
        }
        else if(age.getYears() < 5 && age.getMonths() <= 11 && age.getDays() <= 31) {
            this.setAgeGroup("Preschooler");
        }
        else if(age.getYears() < 12 && age.getMonths() <= 11 && age.getDays() <= 31){
            this.setAgeGroup("SchoolAge");
        }
        else {
            this.setAgeGroup("Adolescent");
        }
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
    
    void updateInfo() {
        System.out.println("\nEnter Person'sFirst Name: ");
        Scanner scanner = new Scanner(System.in);
        this.fname = scanner.nextLine();
        System.out.println("\nEnter Person'sLast Name: ");
        this.lname = scanner.nextLine();
        System.out.println("\nEnter Person'sDOB in (YYYY-MM-DD) format: ");
        Boolean date = false;
        while(!date) {
            try {
                this.setDob(LocalDate.parse(scanner.nextLine()));
                date = true;
                if(Period.between(dob, LocalDate.now()).getDays() < 0 ||
                        Period.between(dob, LocalDate.now()).getMonths() < 0 ||
                        Period.between(dob, LocalDate.now()).getYears() < 0){
                   
                    System.out.print("\nDOB in YYYY-MM-DD Format: ");
                    date = false;
                }
            }
            catch (Exception e) {
                System.out.print("\nDOB in YYYY-MM-DD Format: ");
            }
        }
    }    
        
    public String toString(){
        return "\n Person Name: " + "\u001B[1m" + this.getFullName() + "\n Date Of Birth: " + "\u001B[1m" + this.dob + "\n Person belongs to Age Group : " + "\u001B[1m" +this.ageGroup + super.toString();
    }
    
}
