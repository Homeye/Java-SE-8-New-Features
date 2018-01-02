package section3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInnerClass {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        Predicate<Person> predicate = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 65;
            }
        };

        for (Person person: people) {
            if (predicate.test(person)) {
                System.out.println(person.toString());
            }
        }
    }
}
