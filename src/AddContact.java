//Java program to add a new contact using console

package demo;

import java.util.Scanner;

public class AddContact {
	//Declaring private member variables to store contact information
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    
    //Defining a constructor to initialize the member variables
    public AddContact(String firstName, String lastName, String address, String city, String state, String zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }
    
    
    //Defining getters and setters for the member variables
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
    
    //Defining the main method to interact with the user and create a new contact
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Telling the user for input and store the values in local variables
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter city: ");
        String city = sc.nextLine();
        System.out.print("Enter state: ");
        String state = sc.nextLine();
        System.out.print("Enter zip code: ");
        String zip = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();
        System.out.print("Enter email address: ");
        String email = sc.nextLine();
        
        //Creating a new contact object with the user-provided values
        AddContact contact = new AddContact(firstName, lastName, address, city, state, zip, phone, email);

        //Displaying the new contact information to the user
        System.out.println("\nContact created:");
        System.out.println();
        System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastName());
        System.out.println("Address: " + contact.getAddress());
        System.out.println("City: " + contact.getCity());
        System.out.println("State: " + contact.getState());
        System.out.println("Zip Code: " + contact.getZip());
        System.out.println("Phone Number: " + contact.getPhone());
        System.out.println("Email Address: " + contact.getEmail());
        

		sc.close();

    }
}

   
