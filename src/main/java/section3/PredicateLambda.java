package section3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLambda {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        Predicate<Person> predOlder = (person) -> person.getAge() >= 65;
        Predicate<Person> predYounger = (person) -> person.getAge() <= 40;

        displayPeople(people, predOlder);
        displayPeople(people, predYounger);
    }

    private static void displayPeople(List<Person> people, Predicate<Person> predicate) {
        people.forEach(person -> {
            if (predicate.test(person)) {
                System.out.println(person);
            }
        });
    }
}
