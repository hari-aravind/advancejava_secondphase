// Problem 1

package tasksfive;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StringUpperCase {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        List<String> list = names.map((x) -> x.toUpperCase()).collect(Collectors.toList());
        for (String i : list) {
            System.out.println(i);
        }

    }
}
