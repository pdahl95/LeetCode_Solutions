package Easy;

import java.util.Arrays;

public class ShuffleArray {

    private static int[] shuffle(int[] nums, int n){
        int[] res = new int[2*n];
        for(int i = 0; i < 2*n; i++){
            if(i % 2 == 0){
                res[i] = nums[i/2];
            }else{
                res[i] = nums[i/2 + n];
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println( String.format( "Original Array: %s ", Arrays.toString( nums ) ) );
        System.out.println( String.format( "Running sum of Array: %s ", Arrays.toString(shuffle( nums, n )) ) );
    }
}
