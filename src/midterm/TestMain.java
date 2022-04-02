package midterm;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        int[] numbers ={1, 1, 2, 2,4,7};
                     // 1 2 3 4 4 3
                     //   2 3 4 4 3 5

        int[] duplicates = Test.getDuplicates(numbers);
        System.out.println(Arrays.toString(duplicates));


        String[] words = {"hello", "red", "hello"};
        String[] duplicates2 = Test.findDuplicates(words);
        System.out.println(Arrays.toString(duplicates2));
        System.out.println(Arrays.toString(Test.getMissingNumbers(numbers)));
    }


}
