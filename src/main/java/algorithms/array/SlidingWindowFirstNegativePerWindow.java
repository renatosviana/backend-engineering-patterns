package algorithms.array;

import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class SlidingWindowFirstNegativePerWindow {
    public static void main (String [] args) {
        int [] arr = {12, 1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(Arrays.toString(firstNegativePerWindow(arr,k)));
    }

    public static int[] firstNegativePerWindow(int[] arr, int k){

        Deque<Integer> queue = new ArrayDeque<>();
        int[] result = new int[arr.length - k + 1];
        int resultIndex = 0;

        //1. add index if negative
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < 0) {
                queue.addLast(i);
            }


            //2. remove front if it fell outside the window
            if (!queue.isEmpty() && queue.peekFirst() < i - k + 1) {
                queue.pollFirst();
            }

            //3. record answer once first window is complete
            if (i >= k - 1) {
                result[resultIndex++] = queue.isEmpty() ? 0 : arr[queue.peekFirst()];
            }
        }

        return result;
    }


}
