import java.util.ArrayList;
import java.util.List;

public class Lambda{
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Gautam");
        str.add("Santosh");
        str.add("Reddy");
        str.sort((s1,s2)->s1.length()-s2.length());
        System.out.println(str);
    }
}