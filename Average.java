import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Average {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        OptionalDouble res = num.stream()
                                    .mapToDouble(Integer::doubleValue)
                                    .average();
        System.out.println(res.getAsDouble());
    }
}