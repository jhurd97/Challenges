package org.example;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println( "Enter your question:" );

        Scanner scan = new Scanner( System.in );
        scan.next();
        scan.close();

        Random random = new Random();
        int r = random.nextInt( 8 );
        //The number is 8 because there are 8 prints,
        //however, it will generate from 0-7 for the responses

        if (r == 0) {
            System.out.println( "Of course" );
        } else if (r == 1) {
            System.out.println( "No" );
        } else if (r == 2) {
            System.out.println( "If you say so" );
        } else if (r == 3) {
            System.out.println( "It shall be" );
        } else if (r == 4) {
            System.out.println( "Yes" );
        } else if (r == 5) {
            System.out.println( "Not on this lifetime" );
        } else if (r == 6) {
            System.out.println( "I'm sorry, boo, but it ain't in the cards" );
        } else if (r == 7) {
            System.out.println( "Sike!" );
        }
    }
}