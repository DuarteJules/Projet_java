package com.company;
import java.util.Scanner;
public class Main {
    public static void display_menu() {
        System.out.println ( "1) Option 1\n2) Option 2\n3) Option 3" );
        System.out.print ( "Selection: " );
    }
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );

        display_menu();
        switch ( in.nextInt() ) {
            case 1:
                System.out.println ( "You picked option 1" );
                break;
            case 2:
                System.out.println ( "You picked option 2" );
                break;
            case 3:
                System.out.println ( "You picked option 3" );
                break;
            default:
                System.err.println ( "Unrecognized option" );
                break;
        }
    }
}
