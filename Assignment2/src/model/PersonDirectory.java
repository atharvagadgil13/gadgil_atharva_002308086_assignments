/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Atharva
 */
public class PersonDirectory {
    private ArrayList<Person> persons;
    
    public PersonDirectory(){
        this.persons = new ArrayList<Person>();
    }
    
     public ArrayList<Person> getPersons(){
        return persons;
    }
    
    public void setPersons(ArrayList<Person> persons){
        this.persons = persons;
    }
    
    public Person addPerson(){
        Person p = new Person();
        persons.add(p);
        return p;
    }
    
    public void deletePerson(Person person){
        persons.remove(person);
    }
    
    public Person searchPerson(String searchParameter){
        for(Person p : persons){
            if(p.getFirstName().contains(searchParameter) || p.getLastName().contains(searchParameter) || p.getHomeStreet().contains(searchParameter) || p.getOfficeStreet().contains(searchParameter) ){
                return p;
            }
        }
            return null;
}

    
}
