//Java program to create Address Book System

package demo;

import java.util.*;

public class AddressBook {
	//Declaring private instance variables for the address book fields
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    
    //Creating a constructor to initialize the instance variables
    public AddressBook(String firstName, String lastName, String address, String city, String state, String zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public AddressBook(String name) {
		// TODO Auto-generated constructor stub
	}

	//Creating getters and setters for the instance variables
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

   	public String getAddress() {
   		return address;
   	}

   	public void setAddress(String address) {
   		this.address = address;
   	}

   	public String getCity() {
   		return city;
   	}

   	public void setCity(String city) {
   		this.city = city;
   	}

   	public String getState() {
   		return state;
   	}

   	public void setState(String state) {
   		this.state = state;
   	}

   	public String getZip() {
   		return zip;
   	}

   	public void setZip(String zip) {
   		this.zip = zip;
   	}

   	public String getPhone() {
   		return phone;
   	}

   	public void setPhone(String phone) {
   		this.phone = phone;
   	}

   	public String getEmail() {
   		return email;
   	}

   	public void setEmail(String email) {
   		this.email = email;
   	}
   
   	  //Creating a main method for AddressBook class
	  public static void main(String[] args) {
		  
		   //Printing out a message to indicate that the address book system is created
	       System.out.println("Address book system is created");
	       System.out.println();
	       
	       //Printing out some initial contacts
	       System.out.println("These are some initial contacts ");
	       System.out.println();
	        
	       System.out.println("Swapnil, Mane, 123 Main Street, Satara, MH, 12345, 9999999999, swap@gmail.com");
	       System.out.println("MS, Dhoni, 456 Main Street, Ranchi, JH, 6789, 7777777777, dhoni@gmail.com");
	 	
	}

	public List<Contact> getContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

}


		
	

	

  
 