package section4;

import section3.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        int sum = people.stream().mapToInt(person -> person.getAge()).sum();
        System.out.println("Total of Ages: " + sum);

        OptionalDouble avg = people.stream().mapToInt(person -> person.getAge()).average();
        if (avg.isPresent()) {
//            System.out.println("Average: " +avg);
            System.out.println("Average: " + avg.getAsDouble());
        } else {
            System.out.println("Average was't calculated");
        }
    }
}
