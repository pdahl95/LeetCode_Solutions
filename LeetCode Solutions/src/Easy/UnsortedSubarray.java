package Easy;

import java.util.Arrays;

public class UnsortedSubarray {

    public static int findUnsortedSubarray(int[] A){
        int n = A.length;
        int min = A[n-1], max = A[0];
        int start = -1, end = -2;

        for(int i = 1; i < n; i++){
            max = Math.max(max, A[i]);
            min = Math.min(min, A[n-i-1]);
            if(A[i] < max) end = i;
            if(A[n-i-1] > min) start = n-i-1;
        }
        return end - start + 1;
    }

    public static void main(String[] args){
        int[] A = new int[]{2,6,4,8,10,9,15};
        System.out.println( String.format( "Length of the shortest subarray is : %s" , findUnsortedSubarray(A) ));
    }
}
