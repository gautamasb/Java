import java.util.List;
import java.util.Optional;

public class MaxValue{
    public static void main(String[] args) {
        List<Integer> num = List.of(1,4,7,8,3,2);
        Optional<Integer> res = num.stream()
                                    .max(Integer::compareTo);
        if(res.isPresent()){
            System.out.println(res.get());
        }
        else{
            System.out.println("List is Empty");
        }
    }
}