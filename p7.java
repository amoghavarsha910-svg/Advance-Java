/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
package basic;

import java.util.Scanner;

public class p7 {

    // User-defined function
    public static String truncate(String str, int maxLength) {
        if (str == null) {
            return null;
        }

        // If string length is within limit, return as is
        if (str.length() <= maxLength) {
            return str;
        }

        // If maxLength is too small to include "...", just cut the string
        if (maxLength <= 3) {
            return str.substring(0, maxLength);
        }

        // Otherwise, truncate and add ellipsis
        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter maximum length: ");
        int length = sc.nextInt();

        String result = truncate(input, length);

        System.out.println("Truncated string: " + result);

        sc.close();
    }
}
