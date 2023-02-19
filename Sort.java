import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("hello");
        str.add("world");
        str.add("this");
        str.add("is");
        str.add("a");
        str.add("test");

        str.sort(Comparator.comparing(String::length).reversed());

        System.out.println(str);
    }
}