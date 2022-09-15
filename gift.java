/*
 * Today is Chef's birthday and he is looking forward to his gift. As usual,
 *  the gift is hidden and Chef has to follow a sequence of NN instructions to reach it.

Initially, Chef is standing in the cell (0, 0)(0,0) of a two-dimensional grid.
 The sequence of instructions is given as a string SS. If we denote Chef's current cell by (x, y)(x,y), 
 each character of SS corresponds to an instruction as follows:

'L' means to go left, i.e. to the cell (x-1, y)(x−1,y)
'R' means to go right, i.e. to the cell (x+1, y)(x+1,y)
'U' means to go up, i.e. to the cell (x, y+1)(x,y+1)
'D' means to go down, i.e. to the cell (x, y-1)(x,y−1)
In addition, Chef should never perform multiple consecutive moves along the same axis of the grid. If there are multiple consecutive instructions to move along the same axis (left/right or up/down), he should perform only the first of these moves.

Find the cell (x_g, y_g) which contains the hidden gift.
​
 */

import java.util.*;

public class gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0)  {
            int n = sc.nextInt();
            String str = sc.next();

            int[] pos = {0, 0};
            char[] chars = str.toCharArray();

            char last = '0';

            for (int i = 0; i < n; i++)  {
                switch (chars[i])  {
                    case 'L':
                    if (last != 'L' && last != 'R')  {
                        pos[0] -= 1;
                        last = 'L';
                    }
                    break;

                    case 'R':
                    if (last != 'R' && last != 'L')  {
                        pos[0] += 1;
                        last = 'R';
                    }
                    break;

                    case 'U':
                    if (last != 'U' && last != 'D')  {
                        pos[1] += 1;
                        last = 'U';
                    }
                    break;

                    case 'D':
                    if (last != 'D' && last != 'U')  {
                        pos[1] -= 1;
                        last = 'D';
                    }
                    break;
                }
            }

            System.out.println(Arrays.toString(pos));
        }
    }
}
