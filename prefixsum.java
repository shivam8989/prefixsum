package array;
import java.util.*;
public class prefixsum {
    public static void maxSum(int arr[]){
        int currentsum  = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix [] = new int[arr.length];
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];

        }
        for(int i =0; i<arr.length; i++){
            int start = i;
            for(int j = i; j <arr.length; j++){
                int end = j;
                currentsum = start == 0 ? prefix[end] : prefix[end] - prefix [start - 1];
                if(maxsum < currentsum){
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("max sum "+maxsum);
    }
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5};
        maxSum(arr);

    }
}
