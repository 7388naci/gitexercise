package org.example;

import java.util.Arrays;

public class Rotasjon {
    public static void main(String[] args) {
        char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        rotasjon(a);
      //Result:  [J, A, B, C, D, E, F, G, H, I]
    }

    public static void rotasjon(char[] a) {
        if (a.length > 1) {
            for (int j = a.length - 1; j > 0; j--) {
                char temp = a[j-1];
                a[j-1] = a[j ];
                a[j] = temp;
            }
            System.out.println(Arrays.toString(a));
        }
    }
}