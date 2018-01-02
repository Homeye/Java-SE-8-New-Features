package section3;

public class FunctionalInterface {

    public static void main(String[] args) {

        SimpleInterface simpleInterface = () -> System.out.println("Say Something");
        simpleInterface.doSomething();

        InterfaceWithArgs interfaceWithArgs = (v1, v2) -> {
//            int result = v1 * v2;
            int result = v1 + v2;
            System.out.println("The result is " + result);
        };
        interfaceWithArgs.calculate(10, 15);
    }
}
