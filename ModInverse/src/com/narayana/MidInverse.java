package com.narayana;

public class MidInverse {
    public static int findValue(int x, int m) {
        for (int n = 1; n < m; n++) {
            if ((x * n) % m == 1) {
                return n;  
            }
        }
        return -1;  
    }
}
