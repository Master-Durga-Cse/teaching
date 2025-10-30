package com.narayana;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = Dots.find(n);

        if (result == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

