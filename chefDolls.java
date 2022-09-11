/*
Problem
 

Chef is fan of pairs and he likes all things that come in pairs. He even has a doll collection in which the dolls come in pairs. One day while going through his collection he found that there are odd number of dolls. Someone had stolen a doll!!!

Help chef find which type of doll is missing..
*/

import java.util.*; 

class chefDolls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();
        
        for (int t = 0; t < tests; t++)  {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int ans = 0;
            for (int i = 0; i < n; i++)  {
                int count = 0;
                for (int j = 0; j < n; j++)  {
                    if (arr[i] == arr[j]) count++;
                }
                if (count % 2 != 0) ans = arr[i];   
            }
            
            System.out.println(ans);
        }
    }
}