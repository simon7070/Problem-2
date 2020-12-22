package com.company;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.*;

public class Group4_problem2 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        char choice;
        char vote = 0;
        int num = 0;
        int sum = 0;

        do {
            System.out.println("\t\t\t\t\tPRESIDENTIAL ELECTIONS");
            System.out.println("\t\t\t\t\tcandidates:");
            System.out.println("");
            System.out.println("A. ROBREDO \t\t\t\t\t B. MARCOS \t\t\t\t\t C.VILLAR");
            //System.out.println("*****************************************************************");
            System.out.println("[ Type 'V'- vote \t\t 'R'-result \t\t 'Q'-quit ]");
            System.out.print("Enter your Choice: ");
            choice = input.next().charAt(0);

            switch (choice)
            {
                case 'V':
                case 'v':
                    System.out.print("Enter your vote: ");
                    vote = input.next(). charAt(0);
                    // PRINT SCREEN HERE



                    if (vote == 'A')
                    {
                        num = num + 1;
                        System.out.println("ROBREDO");
                    }
                    else if (vote == 'B')
                    {
                        num = num + 1;
                        System.out.println("MARCOS");
                    }
                    else if (vote == 'C')
                    {
                        num = num + 1;
                        System.out.println("VILLAR");
                    }
                    else {
                        System.out.println("Invalid Vote");
                    }

                        break;
                case 'R':
                case 'r':
                    System.out.println("PRESIDENTIAL ELECTIONS");
                    System.out.println("Candidates: ");
                    System.out.print("Results");
                    System.out.println("\t\t\t% Total of Votes: " + num);
                    System.out.println("TOTAL VOTES: " + num);

                    System.out.println("And the winner is: " + vote);

                    break;
            }


            }while (choice != 'Q');
        System.exit(0);
    }

    }



