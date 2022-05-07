package Test_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class testing {
    public static void main(String[] args) {


        String[] arr1 = {"happY", "king", "peace", "living standard"};
        String[] arr2 = {"king kong", "Happy", "PEACE"};

        List<String> commonValues = Test2_.commonString(arr1, arr2);

        System.out.println(commonValues);
// * 	input -> : {3, 5, 1, 4, 2, 7}
//     * 	returned value : 6

        int[] nums = {3, 5, 1, 4, 2, 7};
        int smallestMissingInt = 1;
        int dfalt = 1;
        List<Integer> myList = new ArrayList<Integer>(nums.length);
        for (int i : nums) {
            myList.add(i);
        }
        Collections.sort(myList);
        for (int i = 0; i < myList.size(); i++) {
            for (int j = i + 1; j < myList.size(); j++) {
                if (myList.get(j) > 0 && myList.get(j) != myList.get(i + 1)) {
                    smallestMissingInt = myList.get(j + 1);

                }
            }
        }
    }
}