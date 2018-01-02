package section3;

public class Person implements PersonInterface {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.age + ")";
    }

    public static int compareAges(Person person1, Person person2) {
        Integer age1 = person1.getAge();
        return age1.compareTo(person2.getAge());
    }
}
