//Java program to search a person in a city or state across multiple AddressBooks

// Package declaration
package demo;

// Import statement
import java.util.*;

// Class definition
public class SearchPerson {

    // Private instance variable to store list of address books
    private List<AddressBook> addressBooks;

    // Constructor to initialize the list of address books
    public SearchPerson() {
        addressBooks = new ArrayList<>();
    }

    // Method to add a new address book
    public void addAddressBook() {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter the name of the new address book
        System.out.print("Enter the name of the new address book: ");
        // Read the user input and store it in a variable
        String name = sc.nextLine();
        // Create a new AddressBook object
        AddressBook addressBook = new AddressBook(name);
        // Add the new address book to the list of address books
        addressBooks.add(addressBook);
        // Print a success message to the user
        System.out.println("Address book '" + name + "' created successfully!");
    }

    // Method to add a contact to an existing address book
    public void addContactToAddressBook() {
        // Create a new Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter the name of the address book
        System.out.print("Enter the name of the address book to add the contact: ");
        // Read the user input and store it in a variable
        String addressBookName = sc.nextLine();
        // Find the address book by name
        AddressBook addressBook = findAddressBookByName(addressBookName);
        if (addressBook != null) {
            // Prompt the user to enter the contact details
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
            // Create a new Contact object with the entered details
            Contact contact = new Contact();
            // Add the contact to the address book
            addressBook.addContact(contact);
            // Print a success message to the user
            System.out.println("Contact added to address book '" + addressBookName + "' successfully!");
        } else {
            System.out.println("Address book not found. Contact not added.");
        }
    }

    // Method to print all contacts in all address books
    public void printAllContacts() {
        // Loop through each address book in the list of address books
        for (AddressBook addressBook : addressBooks) {
            // Print the name of the address book
            System.out.println("Address book: " + addressBook.getFirstName());
            // Get the list of contacts in the address book
            List<Contact> contacts = addressBook.getContacts();
            // Loop through each contact in the list of contacts
            for (Contact contact : contacts) {
                // Print the contact details
                System.out.println(contact);
            }
            // Print a separator after each address book
            System.out.println("------------");
        }
    }

    // Method to find an address book by name
    public AddressBook findAddressBookByName(String name) {
        // Loop through each address book in the list of address books
        for (AddressBook addressBook : addressBooks) {
            // Check if the name of the address book matches the given name
            if (addressBook.getFirstName().equals(name)) {
                return addressBook;
            }
        }
        return null; // Address book not found
    }

    // Method to search for a person in a city or state across multiple address books
    public void searchPerson(String city, String state) {
        // Flag to track if any person is found
        boolean personFound = false;
        // Loop through each address book in the list of address books
        for (AddressBook addressBook : addressBooks) {
            // Get the list of contacts in the address book
            List<Contact> contacts = addressBook.getContacts();
            // Loop through each contact in the list of contacts
            for (Contact contact : contacts) {
                // Check if the contact's city or state matches the specified city or state
                if (contact.getClass().equals(city) || contact.getState().equals(state)) {
                    // Print the contact details
                    System.out.println(contact);
                    // Set the flag to true since a person is found
                    personFound = true;
                }
            }
        }
        // Check if no person is found
        if (!personFound) {
            System.out.println("No person found in the specified city or state.");
        }
    }

    public static void main(String[] args) {
        MultipleAddressBooks multipleAddressBooks = new MultipleAddressBooks();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to add a new address book");
            System.out.println("Enter 2 to add a contact to an existing address book");
            System.out.println("Enter 3 to print all contacts");
            System.out.println("Enter 4 to search for a person in a city or state");
            System.out.println("Enter 5 to exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    multipleAddressBooks.addAddressBook();
                    break;
                case 2:
                    multipleAddressBooks.addContactToAddressBook();
                    break;
                case 3:
                    multipleAddressBooks.printAllContacts();
                    break;
                case 4:
                    System.out.print("Enter the city to search: ");
                    String city = sc.nextLine();
                    System.out.print("Enter the state to search: ");
                    String state = sc.nextLine();
                    multipleAddressBooks.searchPerson(city, state);
                    break;
                case 5:
                    System.out.println("Exited");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
