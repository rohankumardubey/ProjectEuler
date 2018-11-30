/*
 * The sum of the squares of the first ten natural numbers is,
 *
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */


package org.redquark.euler;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        // using the formula - S^2 = n(n+1)(2n+1)/6
        int sumOfSquares = n * (n + 1) * (2 * n + 1) / 6;
        // using the formula - S = n(n+1)/2
        int squareOfSum = (int) Math.pow(n * (n + 1) >> 1, 2);
        System.out.println(squareOfSum - sumOfSquares);
    }
}
