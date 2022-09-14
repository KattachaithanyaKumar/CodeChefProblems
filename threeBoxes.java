/*
 * Chef has 33 boxes of sizes AA, BB, and CC respectively. He puts the boxes in 
 * bags of size DD (A \leq B \leq C \leq DA≤B≤C≤D). Find the minimum number of bags Chef
 *  needs so that he can put each box in a bag. A bag can contain more than one box if the sum 
 * of sizes of boxes in the bag does not exceed the size of the bag.
 */

import java.util.*;

public class threeBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0)  {
            Integer[] arr = new Integer[3];
            int cap = 0;

            for (int i = 0; i < 3; i++) arr[i] = sc.nextInt();
            cap = sc.nextInt();

            Arrays.sort(arr, Collections.reverseOrder());

            int bags = 1;
            int tempCap = cap;
            for (int i = 0; i < 3; i++)  {
                if (tempCap >= arr[i])  {
                    tempCap -= arr[i];
                }else{
                    tempCap = cap;
                    tempCap -= arr[i];
                    bags++;
                }
            }

            System.out.println(bags);
        }
    }
}
