//Java program to edit existing contact using console

package demo;

import java.util.*;

public class EditContact {
	//List to store the AddressBook objects
    private List<AddressBook> contacts;
    
    //Constructor to initialize the list
    public EditContact() {
        this.contacts = new ArrayList<>();
    }

    //Method to add a new contact to the list
    public void addContact(AddressBook contact) {
        this.contacts.add(contact);
    }
    
    //Method to edit an existing contact in the list
    public void editContact(String firstName, String lastName) {
        Scanner sc = new Scanner(System.in);
        boolean foundContact = false;
        //Looping through the list to find the contact to edit
        for (AddressBook contact : contacts) {
        	//Checking if the first and last names match the user input
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
            	//Displaying the existing contact information
            	System.out.println("Found contact:");
                System.out.println();
                System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastName());
                System.out.println("Address: " + contact.getAddress());
                System.out.println("City: " + contact.getCity());
                System.out.println("State: " + contact.getState());
                System.out.println("Zip Code: " + contact.getZip());
                System.out.println("Phone Number: " + contact.getPhone());
                System.out.println("Email Address: " + contact.getEmail());

                //Getting new information for the contact
                System.out.println("\nEnter new information for contact:");
                System.out.print("Address: ");
                contact.setAddress(sc.nextLine());
                System.out.print("City: ");
                contact.setCity(sc.nextLine());
                System.out.print("State: ");
                contact.setState(sc.nextLine());
                System.out.print("Zip Code: ");
                contact.setZip(sc.nextLine());
                System.out.print("Phone Number: ");
                contact.setPhone(sc.nextLine());
                System.out.print("Email Address: ");
                contact.setEmail(sc.nextLine());

                //Displaying the updated contact information
                System.out.println("\nContact updated:");
                System.out.println();
                System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastName());
                System.out.println("Address: " + contact.getAddress());
                System.out.println("City: " + contact.getCity());
                System.out.println("State: " + contact.getState());
                System.out.println("Zip Code: " + contact.getZip());
                System.out.println("Phone Number: " + contact.getPhone());
                System.out.println("Email Address: " + contact.getEmail());

                foundContact = true;
                break;
            }
        }
        //If no contact was found then displaying a message
        if (!foundContact) {
            System.out.println("Contact not found.");
        }

        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EditContact editor = new EditContact();

        //Adding some initial contacts to the address book
        AddressBook contact1 = new AddressBook("Swapnil", "Mane", "123 Main Street", "Satara", "MH", "12345", "9999999999", "swap@gmail.com");
        AddressBook contact2 = new AddressBook("MS", "Dhoni", "456 Main Street", "Ranchi", "JH", "6789", "7777777777", "dhoni@gmail.com");
        editor.addContact(contact1);
        editor.addContact(contact2);

        //Editing an existing contact by name
        System.out.print("Enter first name of contact to edit: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name of contact to edit: ");
        String lastName = sc.nextLine();
        System.out.println();
        editor.editContact(firstName, lastName);

        sc.close();
    }
}
