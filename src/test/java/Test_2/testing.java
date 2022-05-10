package Test_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class testing {


    public static void main(String[] args) {
        //Test2_ fact = new Test2_();
        int facVal2 = Test2_.returnFactorialVal(5);
        System.out.println(facVal2);

        String[] arr1 = {"happY", "king", "peace", "living standard"};
        String[] arr2 = {"king kong", "Happy", "PEACE"};

        List<String> commonValues = Test2_.commonString(arr1, arr2);

        System.out.println(commonValues);
// * 	input -> : {3, 5, 1, 4, 2, 7}
//     * 	returned value : 6

        int[] nums = {3,1};

        //List<Integer> myList = new ArrayList<Integer>();
        //for (int numms : nums) {
          //  myList.add(numms);

        //Collections.sort(myList);
        //System.out.println(myList);
        int n=nums.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
            sum-=nums[i];
        System.out.println(sum);
        }


            }






























