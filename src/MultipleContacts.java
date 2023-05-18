//Java program to add multiple contacts

package demo;

import java.util.*;

public class MultipleContacts {
    //Defining an ArrayList to store multiple contacts
    private ArrayList<AddContact> contacts;

    /**
     * Constructs a new instance of the MultipleContacts class with an empty ArrayList.
     */
    public MultipleContacts() {
        contacts = new ArrayList<AddContact>();
    }

    /**
     * Prompts the user to input contact details and adds a new contact to the ArrayList.
     */
    public void addContact() {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input contact details
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

        // Create a new contact object with the user-provided values and add it to the ArrayList
        AddContact contact = new AddContact(firstName, lastName, address, city, state, zip, phone, email);
        contacts.add(contact);

        // Print a success message
        System.out.println("\nContact added successfully!");
    }

    /**
     * Displays all the contacts stored in the ArrayList.
     */
    public void displayContacts() {
        // Check if there are any contacts in the ArrayList
        if (contacts.size() == 0) {
            System.out.println("\nNo contacts found in the address book!");
            return;
        }

        // Display all the contacts stored in the ArrayList
        System.out.println("\nContacts:");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("\nContact " + (i + 1) + ":");
            System.out.println("Name: " + contacts.get(i).getFirstName() + " " + contacts.get(i).getLastName());
            System.out.println("Address: " + contacts.get(i).getAddress());
            System.out.println("City: " + contacts.get(i).getCity());
            System.out.println("State: " + contacts.get(i).getState());
            System.out.println("Zip Code: " + contacts.get(i).getZip());
            System.out.println("Phone Number: " + contacts.get(i).getPhone());
            System.out.println("Email Address: " + contacts.get(i).getEmail());
        }
    }

    /**
     * The main method to manage the address book.
     */
    public static void main(String[] args) {
        // Create an instance of the MultipleContacts class
        MultipleContacts multipleContacts = new MultipleContacts();

        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Display the address book menu and handle user input
        while (true) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    multipleContacts.addContact();
                    break;
                case 2:
                    multipleContacts.displayContacts();
                    break;
                case 3:
                    // Exit
                    System.out.println("\nExited");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice! Please try again.");
                
                    
            }
        }
        
    }
}

