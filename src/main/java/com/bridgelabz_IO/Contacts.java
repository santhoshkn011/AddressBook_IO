package com.bridgelabz_IO;

public class Contacts {
    private String firstName, lastName , address, city, state, zip, contactNo, email;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public  void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getAddress () {
        return address;
    }
    public void setAddress (String address){
        this.address = address;
    }
    public String getCity () {
        return city;
    }
    public void setCity (String city){
        this.city = city;
    }
    public String getState () {
        return state;
    }
    public void setState (String state){
        this.state = state;
    }
    public String getZip () {
        return zip;
    }
    public void setZip (String zip){
        this.zip = zip;
    }
    public String getContactNo () {
        return contactNo;
    }
    public void setContactNo (String contactNo){
        this.contactNo = contactNo;
    }
    public String getEmail () {
        return email;
    }
    public void setEmail (String email){
        this.email = email;
    }

    public String toString(){
        return ("\nFirstName:- " + firstName + "\nLastName:- " + lastName + "\nAddress:- " + address + "\nCity:- " + city + "\nState:- " + state +
                "\nZip code:- " + zip + "\nContact Number:- " + contactNo + "\nEmail Id:-" + email);
    }
}