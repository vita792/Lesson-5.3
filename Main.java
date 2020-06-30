package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String text = word.next();
        char []abc = text.toCharArray();

            for (int j = abc.length-1; j >= 0; j--)
                System.out.print(abc[j]);

        }
    }
