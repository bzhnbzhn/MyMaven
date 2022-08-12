package hometaskStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        {
            personList.add(new Person("Peter", "Patterson", 21));
            personList.add(new Person("Paul", "Walker", 31));
            personList.add(new Person("Steve", "Runner", 17));
            personList.add(new Person("Arnold", "", -1));
            personList.add(new Person(" ", "Stevenson", 19));
            personList.add(new Person("   ", "Stevenson", 19));
            personList.add(new Person("      ", "Stevenson", 19));
            personList.add(new Person(" Arnold", "Stevenson", 19));
            personList.add(null);
            personList.add(new Person("Aaron", "Bortnicker", 18));
        }
        Set<String> personFirstNames = personList
                .stream()
                .filter(Objects::nonNull)
                .filter(person -> !person.firstName.isBlank())
                .filter(person -> person.age >= 18)
                .map(person -> (person.getFirstName().toUpperCase().replaceAll(" ", "")))
                .collect(Collectors.toSet());
        System.out.println(personFirstNames);
    }
}