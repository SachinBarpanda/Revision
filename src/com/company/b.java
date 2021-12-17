package com.company;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float s = (a+b+c)/2f;
        double area2 = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area2);

        float area1 = (1f/2f)*(a*b);
        System.out.println(area1);
    }
}
