package com.frisco.basic;

import java.util.Scanner;


public class Ex3DivideNumbers {


    public void divideNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x: ");
        int x = sc.nextInt();
        System.out.print("enter y: ");
        int y = sc.nextInt();
        System.out.println(x + " / " + y + " = " + (x/y));
    }
}
