package section4;

import section3.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SequentialStream {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        Predicate<Person> predicate = (person) -> person.getAge() > 65;

        displayPeople(people, predicate);
    }

    private static void displayPeople(List<Person> people, Predicate<Person> predicate) {
        System.out.println("Selected:");
//        people.forEach(person -> {
//            if (predicate.test(person)) {
//                System.out.println(person.getName());
//            }
//        });
        people.stream()
                .filter(predicate)
                .forEach(person -> System.out.println(person.getName()));
    }
}
