package com.metanit;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name?\nName: ");
        String name = scan.next();
        System.out.print("Hello " + name + "! My name is SYSTEM-5353.\nDo you want to listen music?\nWrite Yes or No.\nAnswer: ");
        CheckAnswer(scan);
    }

    public static void ShowMusic(Scanner scan) {
        System.out.print("Choose type of music that you're prefer:\n1) K-pop\n2) Rock\n3) Rap\n4) Hip-hop\n5) Jazz\nInput: ");


        int a = scan.nextInt();
        if (a == 1)
            System.out.println("BTS - Sea");
        if (a == 2)
            System.out.println("Nirvana - teen spirit");
        if (a == 3)
            System.out.println("Eminem - lose yourself");
        if (a == 4)
            System.out.println("Noize MC - Chasing the Horizon");
        if (a == 5)
            System.out.println("Louis Armstrong - What a Wonderful World");
        System.out.print("Do you want to exit or continue?\nPlease, choose Yes or No.\nAnswer: ");
        CheckAnswer(scan);
    }

    public static void CheckAnswer(Scanner scan)
    {
        String answer = scan.next().toLowerCase();
        if (answer.equals("yes"))
            ShowMusic(scan);
        else if(answer.equals("no"));

        else {
            System.out.print("Please, choose Yes or No.\nAnswer: ");
            CheckAnswer(scan);
        }
    }
}