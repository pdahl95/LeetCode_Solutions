package Easy;

import java.util.Arrays;

public class RunningSum1DArray {

    private static int[] runningSum(int[] nums){
        int[] res = new int[nums.length];
        int tmp;
        res[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            tmp = res[i-1];
            res[i] = tmp + nums[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        System.out.println( String.format( "Original Array: %s ", Arrays.toString( nums ) ) );
        System.out.println( String.format( "Running sum of Array: %s ", Arrays.toString(runningSum( nums )) ) );
    }
}
