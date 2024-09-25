//    Assignment 1 Problem2

public class Primes {
    public static void main(String[] args) {
        int nValues = 50;

        outerLoop:
        for (int i = 2; i <= nValues; i++) {
            // Check divisibility up to the square root of i
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    // Not a prime number, skip to the next i
                    continue outerLoop;
                }
            }
            // If no divisors were found, i is prime
            System.out.println(i);
        }
    }
}

/*

>1.   Labeled Continue: The outer loop is labeled outerLoop,
      allowing us to use continue outerLoop to skip directly to
      the next iteration of the outer loop when a divisor is found.

>2.   Removed isPrime Variable: The isPrime variable is no longer needed.
      Instead, we directly print the number if it has no divisors.

>3.   Square Root Check: The inner loop condition is modified to check
      divisibility only up to the square root of i (j * j <= i).
 */