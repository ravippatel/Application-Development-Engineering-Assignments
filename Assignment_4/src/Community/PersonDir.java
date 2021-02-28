

package Community;

import java.util.ArrayList;


public class PersonDir {

    ArrayList<Person> perDirectory;
    
    public PersonDir() {
        perDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getDirectory() {
        return perDirectory;
    }
    
    public Person newPerson(){
        Person person = new Person();
        person.initializePerson();
        perDirectory.add(person);
        return person;
    }
    
        @Override
    public String toString(){
        String returnString = new String();
        int i = 0;
        for (Person person: perDirectory){
            returnString += "Patient "+i+":\n";
            returnString += person + "\n";
            i++;
        }
        return returnString;
    }
    
}
