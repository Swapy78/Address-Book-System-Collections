//Java program to ensure that there is no duplicate entry of same person

// Package declaration
package demo;

// Import statements
import java.util.*;

// Class definition for AddressBookList
class AddressBookList {
    private List<Person> contacts;

    // Constructor to initialize the contacts list
    public AddressBookList() {
        contacts = new ArrayList<>();
    }

    // Method to add a new person to the address book
    public void addPerson(Person person) {
        if (!contacts.contains(person)) {
            contacts.add(person);
            System.out.println("Person added successfully.");
        } else {
            System.out.println("Duplicate entry found. Person not added.");
        }
    }

    // Method to retrieve all persons in the address book
    public List<Person> getAllPersons() {
        return contacts;
    }
}

// Class definition for Person
class Person {
    private String name;

    // Constructor to initialize the person's name
    public Person(String name) {
        this.name = name;
    }

    // Getter method for the person's name
    public String getName() {
        return name;
    }

    // Override equals method to check for duplicate persons based on name
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return name.equals(other.name);
    }

    // Override hashCode method for consistency with equals
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

// Class definition for NoDuplicateEntry
public class NoDuplicateEntry {
    private Map<String, AddressBookList> addressBooks;

    // Constructor to initialize the map of address books
    public NoDuplicateEntry() {
        addressBooks = new HashMap<>();
    }

    // Method to add a new address book
    public void addAddressBook(String name) {
        addressBooks.put(name, new AddressBookList());
        System.out.println("Address book '" + name + "' created successfully!");
    }

    // Method to add a person to an existing address book
    public void addPersonToAddressBook(String addressBookName, String personName) {
        AddressBookList addressBook = addressBooks.get(addressBookName);
        if (addressBook != null) {
            Person person = new Person(personName);
            addressBook.addPerson(person);
        } else {
            System.out.println("Address book not found. Person not added.");
        }
    }

    // Method to print all persons in all address books
    public void printAllPersons() {
        if (addressBooks.isEmpty()) {
            System.out.println("No address books found!");
            return;
        }

        for (Map.Entry<String, AddressBookList> entry : addressBooks.entrySet()) {
            String addressBookName = entry.getKey();
            AddressBookList addressBook = entry.getValue();

            List<Person> persons = addressBook.getAllPersons();
            if (persons.isEmpty()) {
                System.out.println("No persons found in address book '" + addressBookName + "'.");
            } else {
                System.out.println("Address book '" + addressBookName + "' persons:");
                for (Person person : persons) {
                    System.out.println(person.getName());
                }
            }
            System.out.println("------------");
        }
    }

    // Main method
    public static void main(String[] args) {
        NoDuplicateEntry noDuplicateEntry = new NoDuplicateEntry();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to add a new address book");
            System.out.println("Enter 2 to add a person to an existing address book");
            System.out.println("Enter 3 to print all persons");
            System.out.println("Enter 4 to exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the new address book: ");
                    String addressBookName = sc.nextLine();
                    noDuplicateEntry.addAddressBook(addressBookName);
                    break;
                case 2:
                    System.out.print("Enter the name of the address book to add the person: ");
                    String existingAddressBookName = sc.nextLine();
                    System.out.print("Enter the name of the person: ");
                    String personName = sc.nextLine();
                    noDuplicateEntry.addPersonToAddressBook(existingAddressBookName, personName);
                    break;
                case 3:
                    noDuplicateEntry.printAllPersons();
                    break;
                case 4:
                    System.out.println("Exited");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
