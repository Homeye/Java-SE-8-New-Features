package section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodReference {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        Collections.sort(people, Person::compareAges);
        people.forEach(person -> System.out.println(person));
    }
}
