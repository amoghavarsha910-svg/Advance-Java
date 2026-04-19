/*Develop a java program for performing various string operations with different string handling
functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/
package basic;

import java.util.Scanner;

public class StringOperationsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("\nstr1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));

        // 4. String Searching
        String sentence = "Java is powerful and Java is popular";
        System.out.println("\nIndex of 'Java': " + sentence.indexOf("Java"));
        System.out.println("Last index of 'Java': " + sentence.lastIndexOf("Java"));
        System.out.println("Contains 'powerful': " + sentence.contains("powerful"));

        // 5. Substring Operations
        System.out.println("\nSubstring (0 to 4): " + sentence.substring(0, 4));
        System.out.println("Substring from index 5: " + sentence.substring(5));

        // 6. String Modification
        String modified = sentence.replace("Java", "Python");
        System.out.println("\nModified string: " + modified);
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        // 7. Whitespace Handling
        String spaced = "   Hello Java   ";
        System.out.println("\nBefore trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenated string: " + concat);
        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

        // 9. String Splitting
        String fruits = "Apple,Banana,Mango";
        String[] arr = fruits.split(",");
        System.out.println("\nSplitting string:");
        for (String fruit : arr) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 7);
        System.out.println("\nStringBuilder result: " + sb);

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted string: " + formatted);

        // 12. Validate Email using contains(), startsWith(), endsWith()
        System.out.print("\nEnter email to validate: ");
        String email = sc.nextLine();

        if (email.contains("@") &&
            email.endsWith(".com") &&
            !email.startsWith("@")) {
            System.out.println("Valid Email (basic validation)");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}
