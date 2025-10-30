package com.narayana;

public class Dots {
    public static int find(int n) {
        int sum = 0;
        int i = 1;

        while (sum < n) {
            sum += i;  // add next row of dots
            i++;      
        }

        if (sum == n)
            return 1;  // can form triangle
        else
            return 0;  // cannot form triangle
    }
}
