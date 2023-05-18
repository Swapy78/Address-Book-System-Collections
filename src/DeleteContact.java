//Java program to delete existing contact using console

package demo;

import java.util.*;

public class DeleteContact {
	//Creating a private List of AddressBook objects to store the contacts.
    private List<AddressBook> contacts;

    //Constructor to initialize the contacts list.
    public DeleteContact(List<AddressBook> contacts) {
        this.contacts = contacts;
    }
    //Method to delete a contact by first and last name.
    public void deleteContactByName(String firstName, String lastName) {
        boolean isDeleted = false;

        //Iterating through the contacts list to find the contact to delete
        for (int i = 0; i < contacts.size(); i++) {
            AddressBook contact = contacts.get(i);

            //If the contact's first and last name matches the input then removing the contact and setting isDeleted flag to true.
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                contacts.remove(i);
                isDeleted = true;
                break;
            }
        }
        //If the contact gets deleted then printing a success message, otherwise printing a failure message.
        if (isDeleted) {
            System.out.println("Contact deleted successfully.");
            System.out.println();
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void main(String[] args) {
    	//Creating a list of contacts and add some contacts
        List<AddressBook> contacts = new ArrayList<AddressBook>();
        contacts.add(new AddressBook("Swapnil", "Mane", "123 Main Street", "Satara", "MH", "12345", "9999999999", "swap@gmail.com"));
        contacts.add(new AddressBook("MS", "Dhoni", "456 Main Street", "Ranchi", "JH", "6789", "7777777777", "dhoni@gmail.com"));

        //Telling the user to enter the first and last name of the contact to delete.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name of contact to delete: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name of contact to delete: ");
        String lastName = sc.nextLine();
        System.out.println();

        //Creating an instance of DeleteContact and calling the deleteContactByName method to delete the contact.
        DeleteContact deleteContact = new DeleteContact(contacts);
        deleteContact.deleteContactByName(firstName, lastName);

        //Printing the remaining contacts in the address book.
        System.out.println("Remaining contacts:");
        System.out.println();
        for (AddressBook contact : contacts) {
            System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastName());
            System.out.println("Address: " + contact.getAddress());
            System.out.println("City: " + contact.getCity());
            System.out.println("State: " + contact.getState());
            System.out.println("Zip Code: " + contact.getZip());
            System.out.println("Phone Number: " + contact.getPhone());
            System.out.println("Email Address: " + contact.getEmail());
            System.out.println();
        }

        sc.close();
    }
}
