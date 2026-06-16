Cyclic Sort:
 1. Range of Numbers will be given either from 1 to N or 0 to N.
	1. when 0 to N is given
	Number at correct position will be eqaul to index number
	2. when 1 to N is given
	Number at correct position will be eqaul to index number+1
	
package com.cycleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSortAlgoFor1toN {
    public static void main(String[] args) {
        // array
        int[] ar = {5,4,3,2,1};
        // sort the array using cyclic sort
        sortCyclic(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void sortCyclic(int[] ar) {
        // run loop n-1 times
        int index = 0; 
        // if n-1 element is sorted ,nth will be automatically sorted.
        while(index < ar.length-1 )
        {
            // get the correct position of element
            // element = index +1, so index = element-1;
            int correctPosition = ar[index] -1;

            //check if current element is equal to element at correct position
            if(ar[index] != ar[correctPosition])
            {
                //not equal ,swap
                int temp = ar[correctPosition];
                ar[correctPosition] = ar[index];
                ar[index]= temp;
            }
            else
            {
                // equal, go to next element
                index++;
            }

        }
    }
}
Time Complexity : Maximum Comparision will N times and swaping N-1 times ,so
O(N+N-1) => O(N).

