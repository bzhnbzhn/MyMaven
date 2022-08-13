package hometaskstream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void getPersonFirstNames() {
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
        assertEquals(Set.of("AARON", "ARNOLD", "PETER", "PAUL"), Person.getPersonFirstNames(personList));
    }
}