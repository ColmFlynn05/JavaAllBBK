import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] name = {"Java", "C", "PHP", "JavaScript", "Python", "Rust", "Haskell", "Go", "Prolog"};
        HashSet<String> test = new HashSet<>(Arrays.asList(name));
        LinkedHashSet<String> test2 = new LinkedHashSet<>(Arrays.asList(name));
        TreeSet<String> test3 = new TreeSet<>(Arrays.asList(name));
        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);



    }
}