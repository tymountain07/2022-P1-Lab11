// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst {
    public static void main(String[] args) {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[]) {


        for (int k = 2; k < primes.length; k++) {
            primes[k] = true;

        }

        for (int p = 4; p < primes.length; p+=2){
            primes[p] = false;
        }

        for (int p = 6; p < primes.length; p+=3){
            primes[p] = false;
        }

        for (int p = 10; p < primes.length; p+=5){
            primes[p] = false;
        }

        for (int p = 14; p < primes.length; p+=7){
            primes[p] = false;
        }




        System.out.println("\nCOMPUTING PRIME NUMBERS");

    }

    public static void displayPrimes(boolean primes[]) {
        System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
        System.out.println();

        for (int k = 2; k < primes.length; k++) {
            if (primes[k] == true) {
                System.out.print(k + " ");
            }

        }

    }
}



