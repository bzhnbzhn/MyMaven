package hometaskstream;

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

    public static Set<String> getPersonFirstNames(List<Person> personList) {
        return personList
                .stream()
                .filter(Objects::nonNull)
                .filter(person -> !person.firstName.isBlank())
                .filter(person -> person.age >= 18)
                .map(person -> (person.getFirstName().toUpperCase().trim()))
                .collect(Collectors.toSet());
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}