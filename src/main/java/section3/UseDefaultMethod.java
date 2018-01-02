package section3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UseDefaultMethod {

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
        people.forEach(person -> {
            if (predicate.test(person)) {
//                String info = person.getName() + " (" + person.getAge() + ")";
//                System.out.println(info);
                System.out.println(person.getPersonInfo());
            }
        });
    }
}
