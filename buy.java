/*
 Problem
One day Alice visited Byteland to purchase jewels for her upcoming wedding anniversary.

In Byteland, every Jewelry shop has their own discount methods to attract the customers. One discount method called Buy1-Get1 caught Alice's attention. That is, Alice buys one jewel, then she can get one additional jewel with the same color without charge by Buy1-Get1.

Alice lists the needed jewels as a string S, each letter denotes one jewel, and the same letters denote the same colors of jewels, and the different letters denote the different colors of jewels. The cost of each jewel is 1. Your task is to calculate the minimum cost for getting all the jewels Alice listed.
 */

import java.util.*;
import java.lang.Math;

class buy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int[] res = new int[tests];


        for (int t = 0; t < tests; t++)  {
            String str = sc.next();

            HashMap<Character, Float> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++)  {
                if (map.containsKey(str.charAt(i)))  {
                    float val = map.get(str.charAt(i));
                    map.put(str.charAt(i), val+1);
                }else{
                    map.put(str.charAt(i), (float) 1.0);
                }
            }
            int count = 0;
            for (float i : map.values())  {
                if (i > 1)  {
                    float temp = i/2;
                    count += (Math.ceil(temp));
                }else if (i == 1) {
                    count += 1;
                }
            }

            res[t] = count;
        }


        for (int i : res)  {
            System.out.println(i);
        }
    }
}