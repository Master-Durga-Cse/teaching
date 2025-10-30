package com.narayana;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int m = sc.nextInt();

        int result = MidInverse.findValue(x, m);

        System.out.println(result);
    }
}

