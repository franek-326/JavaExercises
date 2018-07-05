package com.frisco.basic;

import java.util.Scanner;

public class Ex17AddBinaryNumbers {

    public void addBinaryNumbers() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter binary value-1: ");
        String s1 = sc.next();

        System.out.print("enter binary value-2: ");
        String s2 = sc.next();


        int b1 = Integer.parseInt(s1, 2);
        int b2 = Integer.parseInt(s2, 2);

        byte y = (byte) (b1 + b2);

        System.out.print("binary sum of value-1, value-2 = ");
        showBits(y);

    }

    private void showBits(byte param) {

        byte mask = (byte) (1 << 7);

        for (int i = 1; i <= 8; i++,
                param <<= 1) {
            System.out.print((param & mask) ==
                    0 ? "0" : "1");
        }
    }
}
