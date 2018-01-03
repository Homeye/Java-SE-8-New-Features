package section4;

import section3.Person;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

    public static void main(String[] args) {

        Person[] people = {
                new Person("Joe", 48),
                new Person("Mary", 30),
                new Person("Mike", 73)
        };
//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i].getPersonInfo());
//        }

        Stream<Person> peopleStream1 = Stream.of(people);
        peopleStream1.forEach(person -> System.out.println(person.getPersonInfo()));

        Stream<Person> peopleStream2 = Arrays.stream(people);
        peopleStream2.forEach(person -> System.out.println(person.getPersonInfo()));
    }
}
