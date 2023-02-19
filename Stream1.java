import java.util.List;
import java.util.Optional;

public class Stream1{
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> res = num.stream()
                                    .filter(n -> n > 3)
                                    .filter(n -> n % 2== 0)
                                   .findFirst();
        System.out.println(res);
    } 
}