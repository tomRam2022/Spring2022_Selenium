package Test_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class testing {


    public static void main(String[] args) {

        int facVal2 = Test2_.returnFactorialVal(4);
        System.out.println(facVal2);

        String[] arr1 = {"happY", "king", "peace", "living standard"};
        String[] arr2 = {"king kong", "Happy", "PEACE"};

        List<String> commonValues = Test2_.commonString(arr1, arr2);

        System.out.println(commonValues);

        int[] nums = {1,2,3,5,6,4};
        int missingNum = Test2_.missingPosInt(nums);
        System.out.println(missingNum);

    }


}


























