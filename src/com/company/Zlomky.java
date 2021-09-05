package com.company;

import java.util.Scanner;

public class Zlomky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        float priklad = 0;
        double sumasumarum = 0;
        for (int i = 0; i < input; i++) {
            priklad = (float) 1 / (i + 1);
            sumasumarum += priklad;
            System.out.println("1/" + (i + 1) + " => " + priklad);
        }
        System.out.println(sumasumarum);
    }
}
