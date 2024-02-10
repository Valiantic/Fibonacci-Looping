import java.util.Scanner;

public class Fibonacci_Looping {
    public static void main(String[] args) {

        Scanner intscan = new Scanner(System.in); // scanner to get the user input

        boolean posnum = false; // create a boolean variable for looping
        boolean fposnum = false; // create a boolean variable for positive number checking in for loop
        boolean wposnum = false; // create a boolean variable for positive number checking in while loop
        boolean dposnum = false; // create a boolean variable for positive number checking in do while loop

        while (!posnum) { // while loop for repeating the execution
            while (!fposnum) { // while loop for repeating the execution if the input is not positive
                // FOR LOOP
                System.out.println("Enter limiter for Fibonacci Sequence:");
                int limit = intscan.nextInt();
                System.out.println("Fibonacci Sequence Using For Loop");
                int num1 = 0; // declare first value in fibonacci
                int num2 = 1; // declare second value in fibonacci

                if (limit > 0) {
                    fposnum = true; // variable to call out positive number checking

                    // FOR LOOP FOR PROCESSING THE FIBONACCI SEQUENCE
                    for (int i = 1; i <= limit; i++) {
                        System.out.print(num1 + " ");
                        int sum = num1 + num2; // adding the term
                        num1 = num2; // printing the sequence
                        num2 = sum;
                    }

                } else { // if negative number is input system will repeat the sequence using while loop
                    System.out.println("Unable to print Fibonacci sequence. Please enter a positive number!.");
                    for (int i = 1; i <= limit; i++) {
                        System.out.print(num1 + " ");
                        int sum = num1 + num2; // adding the term
                        num1 = num2; // printing the sequence
                        num2 = sum;
                    }
                }

            }

            while (!wposnum) { // while loop for repeating the execution if the input is not positive
                // WHILE LOOP
                System.out.println("");
                System.out.println("Enter limiter for Fibonacci Sequence:");
                int wlimit = intscan.nextInt();
                System.out.println("Fibonacci Sequence using While Loop");
                int num3 = 0; // declare first value in fibonacci
                int num4 = 1; // declare second value in fibonacci
                int w = 1; // Initialization outside because of while loop ruless with the variable w for
                           // while looping

                if (wlimit > 0) {
                    wposnum = true; // variable to call out positive number checking

                    // WHILE LOOP FOR PROCESSING THE FIBONACCI SEQUENCE
                    while (w <= wlimit) { // user input to limit the fibonacci sequence
                        System.out.print(num3 + " ");
                        int wsum = num3 + num4; // adding the term
                        num3 = num4; // printing the sequence
                        num4 = wsum;
                        w++; // iteration
                    }
                } else { // if negative number is input system will repeat the sequence using while loop
                    System.out.println("Unable to print Fibonacci sequence. Please enter a positive number!.");

                    while (w <= wlimit) { // user input to limit the fibonacci sequence
                        System.out.print(num3 + " ");
                        int wsum = num3 + num4; // adding the term
                        num3 = num4; // printing the sequence
                        num4 = wsum;
                        w++; // iteration
                    }

                }

            }

            while (!dposnum) { // while loop for repeating the execution if the input is not positive
                // DO WHILE
                System.out.println("");
                System.out.println("Enter limiter for Fibonacci Sequence:");
                int dlimit = intscan.nextInt();
                System.out.println("Fibonacci Sequence using Do While Loop");
                int num5 = 0; // declare first value in fibonacci
                int num6 = 1; // declare second value in fibonacci
                int d = 1; // Initialization outside because of while loop ruless

                if (dlimit > 0) { // user input to limit the fibonacci sequence
                    dposnum = true; // variable to call out positive number checking
                    do {
                        System.out.print(num5 + " "); // statement first because its do while
                        int dsum = num5 + num6; // adding the term
                        num5 = num6; // printing the sequence
                        num6 = dsum;
                        d++; // incrementation
                    } while (d <= dlimit); // condition last

                } else { // if negative number is input system will repeat the sequence using while loop
                    System.out.println("Unable to print Fibonacci sequence. Please enter a positive number!.");

                    if (dlimit > 0) { // user input to limit the fibonacci sequence
                        posnum = true; // variable to call out positive number checking
                        do {
                            System.out.print(num5 + " "); // statement first because its do while
                            int dsum = num5 + num6; // adding the term
                            num5 = num6; // printing the sequence
                            num5 = dsum;
                            d++; // incrementation
                        } while (d <= dlimit); // condition last
                    }
                }

            }
            intscan.close(); // close the scanner
        }

    }

}
