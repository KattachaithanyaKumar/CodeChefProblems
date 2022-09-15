/*
 * Chef is teaching a cooking course. There are NN students attending the course, 
 * numbered 11 through NN.

Before each lesson, Chef has to take attendance, i.e. call out the names of students 
one by one and mark which students are present. Each student has a first name and a last name. 
In order to save time, Chef wants to call out only the first names of students. However, 
whenever there are multiple students with the same first name, Chef has to call out the full names 
(both first and last names) of all these students. For each student that does not share the first name 
with any other student, Chef may still call out only this student's first name.

Help Chef decide, for each student, whether he will call out this student's full name or only the first name.
 */

import java.util.*;

public class attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();

        while (tests-- > 0)  {
            int n = sc.nextInt();
            String[] first = new String[n];
            String[] last = new String[n];

            for (int i = 0; i < n; i++)  {
                first[i] = sc.next();
                last[i] = sc.next();
            }

            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++)  {
                if (map.containsKey(first[i]))  {
                    map.put(first[i], map.get(first[i]) + 1);
                }else{
                    map.put(first[i], 1);
                }
            }

            for (int i =0; i < n; i++)  {
                if (map.get(first[i]) == 1)  {
                    System.out.println(first[i]);
                }else{
                    System.out.println(first[i] + " " + last[i]);
                }
            }
        }
    }
}
