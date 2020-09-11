import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LambdaIndex findIndex;
        findIndex = (x, y) -> Arrays.asList(y).indexOf(x);

        LambdaReverse reverseString;
        reverseString = x -> new StringBuilder(x).reverse().toString();

        LambdaMax findMax;
        findMax = x -> Collections.max(Arrays.asList(x));

        LambdaAverage findAverage;
        findAverage = x -> {
            double sum = 0;
            for (Integer d : x) {
                sum += d;
            }
            return sum / x.size();
        };

        LambdaStrings findStrings;
        findStrings = x -> {
            ArrayList<String> arr = new ArrayList<>();
            for (String s : x) {
                if (s.indexOf('a') == 0) {
                    arr.add(s);
                }
            }
            return arr;
        };

        Integer n = 3;
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(findIndex.search(n, arr));
        System.out.println(findMax.max(arr));

        String str = "gnirtS desreveR";
        System.out.println(reverseString.rvrs(str));

        List<Integer> list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(findAverage.average(list));

        List<String> listStr = new ArrayList(Arrays.asList("abs", "123",
                "fds", "a34", "avf", " af"));
        System.out.println(findStrings.search(listStr));
    }
}
