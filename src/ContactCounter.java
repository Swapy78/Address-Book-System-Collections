//Java program to get number of count by city or state

package demo1;

import java.util.*;

class Person {
    private String firstName;
    private String lastName;
    private String city;
    private String state;

    public Person(String firstName, String lastName, String city, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}

public class ContactCounter {
    private Map<String, Integer> cityCountMap;
    private Map<String, Integer> stateCountMap;

    public ContactCounter() {
        cityCountMap = new HashMap<>();
        stateCountMap = new HashMap<>();
    }

    public void countContactsByCityAndState(List<Person> persons) {
        // Reset the count maps
        cityCountMap.clear();
        stateCountMap.clear();

        // Count the contacts by city and state
        for (Person person : persons) {
            String city = person.getCity();
            String state = person.getState();

            // Update the count in the city count map
            int cityCount = cityCountMap.getOrDefault(city, 0);
            cityCountMap.put(city, cityCount + 1);

            // Update the count in the state count map
            int stateCount = stateCountMap.getOrDefault(state, 0);
            stateCountMap.put(state, stateCount + 1);
        }
    }

    public int getContactCountByCity(String city) {
        return cityCountMap.getOrDefault(city, 0);
    }

    public int getContactCountByState(String state) {
        return stateCountMap.getOrDefault(state, 0);
    }

    public static void main(String[] args) {
        // Create a list of persons
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("ABC", "A", "New York", "New York"));
        persons.add(new Person("XYZ", "B", "New York", "New York"));
        persons.add(new Person("PQR", "C", "San Francisco", "California"));
        persons.add(new Person("DEF", "D", "San Francisco", "California"));
        persons.add(new Person("RST", "E", "Los Angeles", "California"));

        // Create an instance of ContactCounter
        ContactCounter contactCounter = new ContactCounter();

        // Count the contacts by city and state
        contactCounter.countContactsByCityAndState(persons);

        // Retrieve the contact counts by city and state
        System.out.println("Contact Count by City:");
        for (String city : contactCounter.cityCountMap.keySet()) {
            int count = contactCounter.getContactCountByCity(city);
            System.out.println(city + ": " + count);
        }

        System.out.println();

        System.out.println("Contact Count by State:");
        for (String state : contactCounter.stateCountMap.keySet()) {
            int count = contactCounter.getContactCountByState(state);
            System.out.println(state + ": " + count);
        }
    }
}
