// Problem 3

package tasksfive;
import java.util.List;
import java.util.stream.Collectors;

public class StudentListInterface {
    public static void main(String[] args) {
        List<String> list = List.of("Kishore", "Abishek", "Arjun", "Anu", "Prashanth", "Hari");
        List<String> newList = list.stream()        // Stream API
                                .filter(name -> name.startsWith("A")) // lambda expressions
                                .collect(Collectors.toList());

        System.out.println("Name list which is Starts with 'A' : ");
        for (String s : newList) {
            System.out.println(s);
        }
    }
}