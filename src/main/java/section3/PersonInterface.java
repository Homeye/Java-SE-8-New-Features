package section3;

public interface PersonInterface {

    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    default String getPersonInfo() {
        return getName() + " (" + getAge() + ")";
    }

    static String getPersonInfoStatic(Person person) {
        return person.getName() + " (" + person.getAge() + ")";
    }
}
