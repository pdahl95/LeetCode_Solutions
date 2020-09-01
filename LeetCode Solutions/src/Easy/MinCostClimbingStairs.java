package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinCostClimbingStairs {

    public static int minCost(int[] cost){
        int s1 = 0, s2 = 0;
        for(int i = cost.length-1; i >= 0; i--){
            int minCost = cost[i] + Math.min(s1, s2);
            s2 = s1;
            s1 = minCost;
        }
        return Math.min(s1, s2);
    }


    public static void main(String[] args){
        int[] cost = new int[]{10,15,20};
        System.out.println( String.format( "Cheapest cost of climbing %s is: %s", Arrays.toString( cost ) , minCost( cost ) ) );

        int[] cost1 = new int[]{1,100,1,1,1,100,1,1,100,1};
        System.out.println( String.format( "Cheapest cost of climbing %s is: %s", Arrays.toString( cost1 ), minCost( cost1 ) ) );
    }
}
