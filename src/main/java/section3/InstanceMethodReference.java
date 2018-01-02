package section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethodReference {

    public static void main(String[] args) {

        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        instanceMethodReference.sortData();
    }

    public void sortData() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        Collections.sort(people, this::compareAges);
        people.forEach(person -> System.out.println(person));
    }

    public int compareAges(Person person1, Person person2) {
        Integer age1 = person1.getAge();
        return age1.compareTo(person2.getAge());
    }
}
