import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputValues = sc.nextLine();

        // extracting values
        List<Integer> values = Arrays.stream(inputValues.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        // finding coin change
        System.out.println(CoinChange.findChange(values.get(0), values.get(1), values.get(2)));
    
        // closing resource
        sc.close();
    }
}
