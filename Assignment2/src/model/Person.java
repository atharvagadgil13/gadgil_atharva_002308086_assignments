/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Atharva
 */
public class Person {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private int age;
    private String dateOfBirth;
    private float bodyWeight;
    private double annualIncome;
    private Address address;
    
    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public float getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(float bodyWeight) {
        this.bodyWeight = bodyWeight;
    }
  

    //getters and setters
    public Person() {
        this.address = new Address();  // Initialize Address object
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
            @Override
            public String toString(){
                return getFirstName();
            }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    // Methods for setting home and office address through Person class
    
    public void setHomeAddress(String streetAddress, String unitNumber, String zipCode, String city, String state, String contactNumber) {
        this.address.setHomeAddress(streetAddress, unitNumber, zipCode, city, state, contactNumber); // Only accessible within Person
    }
    
    public void setOfficeAddress(String streetAddress, String unitNumber, String zipCode, String city, String state, String contactNumber) {
        this.address.setOfficeAddress(streetAddress, unitNumber, zipCode, city, state, contactNumber); // Only accessible within Person
    }
    
      public String getHomeCity() {
        return this.address.homeCity;
    }
      public String getOfficeCity() {
        return this.address.officeCity;
    }
      public String getHomeZip() {
        return this.address.homeZipCode;
    }
      public String getOfficeZip() {
        return this.address.officeZipCode;
    }
      public String getHomeUnit() {
        return this.address.homeUnitNumber;
    }
      public String getOfficeUnit() {
        return this.address.officeUnitNumber;
    }
      public String getHomeState() {
        return this.address.homeState;
    }
      public String getOfficeState() {
        return this.address.officeState;
    }
      public String getHomeStreet() {
        return this.address.homeStreetAddress;
    }
      public String getOfficeStreet() {
        return this.address.officeStreetAddress;
    }
      public String getHomeNumber() {
        return this.address.homeContactNumber;
    }
      public String getOfficeNumber() {
        return this.address.officeContactNumber;
    }

    

    private static class Address {

      //initializing the address class variables
        
        private String homeStreetAddress;
        private String homeUnitNumber;
        private String homeZipCode;
        private String homeCity;
        private String homeState;
        private String homeContactNumber;
        private String officeStreetAddress;
        private String officeUnitNumber;
        private String officeZipCode;
        private String officeCity;
        private String officeState;
        private String officeContactNumber;
        
        
        //making a private constructor for better encapsulation
        
        
        // Methods to set home and office addresses (only accessible within Person)
        private void setHomeAddress(String streetAddress, String unitNumber, String zipCode, String city, String state, String contactNumber) {
            this.homeStreetAddress = streetAddress;
            this.homeUnitNumber = unitNumber;
            this.homeZipCode = zipCode;
            this.homeCity = city;
            this.homeState = state;
            this.homeContactNumber = contactNumber;
        }

        private void setOfficeAddress(String streetAddress, String unitNumber, String zipCode, String city, String state, String contactNumber) {
            this.officeStreetAddress = streetAddress;
            this.officeUnitNumber = unitNumber;
            this.officeZipCode = zipCode;
            this.officeCity = city;
            this.officeState = state;
            this.officeContactNumber = contactNumber;
        }

        // Methods to get home and office addresses (only accessible within Person)
        
        public String getHomeStreetAddress() {
            return homeStreetAddress;
        }

        public String getHomeUnitNumber() {
            return homeUnitNumber;
        }

        public String getHomeZipCode() {
            return homeZipCode;
        }

        public String getHomeCity() {
            return homeCity;
        }

        public String getHomeState() {
            return homeState;
        }

        public String getHomeContactNumber() {
            return homeContactNumber;
        }

        public String getOfficeStreetAddress() {
            return officeStreetAddress;
        }

        public String getOfficeUnitNumber() {
            return officeUnitNumber;
        }

        public String getOfficeZipCode() {
            return officeZipCode;
        }

        public String getOfficeCity() {
            return officeCity;
        }

        public String getOfficeState() {
            return officeState;
        }

        public String getOfficeContactNumber() {
            return officeContactNumber;
        }
        
    }
}
         
        
        
    
