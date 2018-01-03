package section6;

public class JoiningStrings {

    public static void main(String[] args) {

        String stooges = String.join(" and ", "Larry", "Curly", "Moe");
        System.out.println(stooges);

        String[] states = {"California", "Oregon", "Washington"};
        String stateList = String.join(",", states);
        System.out.println(stateList);
    }
}
