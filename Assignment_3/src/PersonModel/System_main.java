/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author  dell
 */
package PersonModel;

import java.util.Scanner;

public class System_main {

    static PersonDir personD = new PersonDir();
    static PatientDir patientD = new PatientDir();

    private static void showMenu() {
        System.out.println("\nChoose one of the following options:");
        System.out.println(" 1. Add a new Person.");
        System.out.println(" 2. Add a new Patient.");
        System.out.println(" 3. View Person.");
        System.out.println(" 4. View Patients.");
        System.out.println(" 5. Exit.");
    }

    private static void showpersonsMenu() {
        int i = 1;
        int choice;
        if (personD.getDirectory().isEmpty()) {
            System.out.println("\nNot created yet.");
            return;
        }
        Person select;
        Scanner scanner = new Scanner(System.in);
        for (Person person : personD.getDirectory()) {
            System.out.printf("%3d. %s\n", i, person.getFullName());
            i++;
        }
        System.out.println("\nChoose the person to get into details\nOR go back to previous menu: ");
        try {
            choice = scanner.nextInt();
            select = personD.directory.get(choice - 1);
            showSelectedPerson(select);
        } catch (Exception e) {
            System.out.println("\n");
        }
    }

    private static void patientMenu(Patient patient) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose one option from below for " + patient.getName());
            System.out.println("   1. Get Date of Birth and Age Group");
            System.out.println("   2. Hospital visits");
            System.out.println("   3. Vital Signs from RECENT hospital visit");
            System.out.println("   4. Vital Signs from ALL hospital visits");
            System.out.println("   5. Check if ALL vital signs are normal");
            System.out.println("   6. Check if the GIVEN vital sign is normal");
            System.out.println("   7. Add new visit to hospital");
            System.out.println("   8. Go to Menu");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println((Person) patient);
                    break;
                case 2:
                    int i = 1;
                    if (patient.getEncounterHistory().getHistory().size() == 0) {
                        System.out.println("Patient has only 1 visit\n");
                    } else {
                        for (Encounter encounter : patient.getEncounterHistory().getHistory()) {
                            System.out.printf("%3d. %s\n", i, encounter.getEncounterDatetime());
                            i++;
                        }
                    }
                    System.out.printf("%3d. %s\n", i, patient.getEncounter().getEncounterDatetime());
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
                    if (patient.isPatientNormal()) {
                        System.out.println("Patients vital signs are NORMAL");
                    } else {
                        System.out.println("Patients vital signs are ABNORMAL");
                    }
                    break;
                case 6:
                    System.out.print("\nEnter vital sign name.");
                    scanner = new Scanner(System.in);
                    String condition = scanner.nextLine();
                    if (patient.isThisVitalSignNormal(condition)) {
                        System.out.println(condition + " for " + patient.getName() + " is NORMAL");
                    } else if (!patient.isThisVitalSignNormal(condition)) {
                        System.out.println(condition + " for " + patient.getName() + " is ABNORMAL");
                    }
                    break;
                case 7:
                    patient.newEncounter();
                    break;
                case 9:
                    return;
            }
        }
    }

    private static void showpatientsMenu() {

        if (patientD.getDirectory().isEmpty()) {
            System.out.println("There are no patients created.");
            return;
        }

        int i = 1;
        int ch;
        Scanner scanner = new Scanner(System.in);
        Patient selectedPatient;
        for (Patient patient : patientD.getDirectory()) {
            System.out.printf("%3d. %s\n", i, patient.getFullName());
            i++;
        }
        System.out.println("\nChoose the patient to get into details\nOR go back to previous menu: : ");
        try {
            ch = scanner.nextInt();
            selectedPatient = patientD.getDirectory().get(ch - 1);
            patientMenu(selectedPatient);
        } catch (Exception e) {
            System.out.println("Going to main menu\n");
        }
    }

    private static void showSelectedPerson(Person p) {
        System.out.println(p);
        int choice;
        Scanner scanner = new Scanner(System.in);
        if (p instanceof Patient) {
            System.out.println("\nThe person has visited the hospital ");
            patientMenu((Patient) p);

        } else {
            System.out.println("\nThis person has not visited a hospital ");
            System.out.println("Would you like to add a visit ?");
            System.out.println(" 1. Yes\n 2. No ");
            choice = scanner.nextInt();
            if (choice == 1) {
                p = addVisit(p);
            }
        }
    }
    private static Patient addVisit(Person person) {
        Patient patient = null;
        if (person instanceof Patient) {
            patient = (Patient) person;
            patient.newEncounter();
        } else {
            patient = new Patient(person);
            patientD.getDirectory().add(patient);
            personD.getDirectory().remove(person);
            personD.getDirectory().add(patient);
            patient.newEncounter();
        }
        return patient;
    }

    public static void main(String args[]) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Person person = personD.newPerson();
                    System.out.println("\nPerson " + person.getFullName() + " created successfully");
                    break;
                case 2:
                    Patient patient = patientD.newPatient();
                    personD.getDirectory().add(patient);
                    patient.newEncounter();
                    System.out.println("\nPatient " + patient.getFullName() + " created successfully");
                    break;
                case 3:
                    showpersonsMenu();
                    break;
                case 4:
                    showpatientsMenu();
                    break;
                case 5:
                    return;
            }
        } 
        while (choice != 5);
    }
}
