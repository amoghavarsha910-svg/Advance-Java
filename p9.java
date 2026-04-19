/*Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
package basic;

import java.util.Scanner;
import java.util.Random;

public class p9{

    // User-defined function
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter desired length: ");
        int length = sc.nextInt();

        if (length <= 0) {
            System.out.println("Length must be greater than 0.");
        } else {
            String randomString = generateRandomString(length);
            System.out.println("Generated Random String: " + randomString);
        }

        sc.close();
    }
}
