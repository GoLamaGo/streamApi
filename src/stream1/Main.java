package stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultCollection = new ArrayList<>();

        for (Integer item : intList) {
            if (item > 0 && item % 2 == 0) resultCollection.add(item);
        }
//        resultCollection.forEach(System.out::println);

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;

            for (int i = 1; i < resultCollection.size(); i++) {
                if (resultCollection.get(i) < resultCollection.get(i - 1)) {
                    int tmp = resultCollection.get(i);
                    resultCollection.set(i, resultCollection.get(i - 1));
                    resultCollection.set(i - 1, tmp);
                    needIteration = true;
                }
            }
        }
        for (Integer item : resultCollection) {
            System.out.println(item);
        }

    }
}
