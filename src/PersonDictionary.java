//Java program to view person by city or state

package demo;

import java.util.*;

public class PersonDictionary {
    private Map<String, List<String>> cityPersonDictionary;
    private Map<String, List<String>> statePersonDictionary;

    public PersonDictionary() {
        // Initialize the city-person and state-person dictionaries
        cityPersonDictionary = new HashMap<>();
        statePersonDictionary = new HashMap<>();
    }

    public void addPerson(String name, String city, String state) {
        // Add the person to the city-person dictionary
        List<String> cityPersons = cityPersonDictionary.getOrDefault(city, new ArrayList<>());
        cityPersons.add(name);
        cityPersonDictionary.put(city, cityPersons);

        // Add the person to the state-person dictionary
        List<String> statePersons = statePersonDictionary.getOrDefault(state, new ArrayList<>());
        statePersons.add(name);
        statePersonDictionary.put(state, statePersons);
    }

    public List<String> getPersonsByCity(String city) {
        // Retrieve the list of persons associated with the given city, or an empty list if not found
        return cityPersonDictionary.getOrDefault(city, Collections.emptyList());
    }

    public List<String> getPersonsByState(String state) {
        // Retrieve the list of persons associated with the given state, or an empty list if not found
        return statePersonDictionary.getOrDefault(state, Collections.emptyList());
    }

    public static void main(String[] args) {
        // Create an instance of PersonDictionary
        PersonDictionary personDictionary = new PersonDictionary();

        // Adding persons to the dictionary
        personDictionary.addPerson("ABC", "New York", "New York");
        personDictionary.addPerson("DEF", "San Francisco", "California");
        personDictionary.addPerson("XYZ", "New York", "New York");
        personDictionary.addPerson("PQR", "Los Angeles", "California");

        // Retrieving persons by city
        System.out.println("Persons in New York:");
        List<String> personsInNY = personDictionary.getPersonsByCity("New York");
        for (String person : personsInNY) {
            System.out.println(person);
        }

        System.out.println();

        // Retrieving persons by state
        System.out.println("Persons in California:");
        List<String> personsInCA = personDictionary.getPersonsByState("California");
        for (String person : personsInCA) {
            System.out.println(person);
        }
    }
}
