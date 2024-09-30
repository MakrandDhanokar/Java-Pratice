import java.util.Arrays;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

//    51. Write a Java program to convert a string to an integer.

//    String num1 = "1234";
//    int num2 = Integer.parseInt(num1);
//    System.out.println(num2);

//    52. Write a Java program to calculate the sum of two
//    integers and return true if the sum is equal to a third integer.

//    int num1 = 12;
//    int num2 = 13;
//    int res = 25;
//    if (num1 + num2 == res){
//        System.out.println("True");
//    }
//    else System.out.println("False");

//    53. Write a Java program that accepts three integers from the user.
//    It returns true if the second number is higher than the first number
//    and the third number is larger than the second number. If "abc" is true,
//    the second number does not need to be larger than the first number.

//    int num1 = 13;
//    int num2 = 15;
//    int num3 = 20;
//    if (num1 < num2 && num3 > num2){
//        System.out.println("True");
//    }

//    54. Write a Java program that accepts three integers from the user and
//    returns true if two or more of them (integers) have the same rightmost
//    digit. The integers are non-negative.

//    int first = 5;
//    int second = 10;
//    int third =  15;
//
//    if (first%10 == second%10 || second%10 == third%10 || third%10 == first%10){
//        System.out.println("True");
//    }

//    55. Write a Java program to convert seconds to hours, minutes and seconds.

//    int seconds = 86399;
//    int S = seconds%60;
//    int H = seconds/60;
//    int M = H % 60;
//    H = H/60;
//    System.out.print(H + ":" + M + ":" + S);

//    56. Write a Java program to find the number of values in a
//    given range divisible by a given value.

//    int x = 5;
//    int y = 20;
//    int p = 3;
//    int res = 0;
//    for (int i = x; i < y; i++)
//        if (i%3==0) res++;
//    System.out.println(res);

//    57. Write a Java program to accept an integer
//    and count the factors of the number.

//    int num = 25;
//    int ctr = 0;
//    for (int i = 1; i <= (int) Math.sqrt(num); i++) {
//        // Check if 'i' is a divisor, and if it's not a perfect square
//        if (num % i == 0 && i * i != num) {
//            ctr += 2;  // Increase the count by 2
//        } else if (i * i == num) {
//            ctr++;  // If 'i' is a perfect square, increase the count by 1
//        }
//    }
//    System.out.println(ctr);

//    58. Write a Java program to capitalize the first letter of each word
//    in a sentence.

//        String line = "the quick brown fox jumps over the lazy dog.";
//        Scanner in = new Scanner(System.in);
//        Scanner lineScan = new Scanner(line);
//        StringBuilder upper_case_line = new StringBuilder();
//        while (lineScan.hasNext()) {
//            String word = lineScan.next();
//            upper_case_line.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
//        }
//        System.out.println(upper_case_line);

//        59. Write a Java program to convert a string into lowercase.

//    String line = "HE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
//    StringBuilder res = new StringBuilder(line.toLowerCase());
//    System.out.println(res);

//        60. Write a Java program to find the penultimate (next to the last) word in a sentence.


//        String line = "the quick brown fox jumps over the lazy dog.";
//        String[] words = line.split(" ");
//        System.out.println("Penultimate word: " + words[words.length - 2]);

//       61. Write a Java program to reverse a word.

//        String word = "dsaf";
//        StringBuilder result = new StringBuilder();
//        for (int i = word.length() - 1; i >= 0; i--) {
//            result.append(word.charAt(i));
//        }
//        System.out.println(result);

//      62. Write a Java program that accepts three integer values and
//      returns true if one is 20 or more less than the others' subtractions.

//        int x = 15;
//        int y = 20;
//        int z = 25;
//        if (Math.abs(x-y) >= 20 || Math.abs(y-z) >= 20 || Math.abs(z-x) >= 20)
//            System.out.println("True");
//        else System.out.println("False");

//        63. Write a Java program that accepts two integer values from the
//        user and returns the largest value. However if the two values are
//        the same, return 0 and find the smallest value if the two values
//        have the same remainder when divided by 6.

//        int x = 12;
//        int y = 13;
//
//        if (x == y) {
//            System.out.println(0);
//        }
//
//        if (x % 6 == y % 6) {
//            System.out.println((x < y) ? x : y);
//        }
//
//        System.out.println((x > y) ? x : y);

//        64. Write a Java program that accepts two integer values between
//        25 and 75 and returns true if there is a common digit in both
//        numbers.

//        int p = 35;
//        int q = 45;
//        int x = p % 10;
//        int y = q % 10;
//
//        p /= 10;
//        q /= 10;
//
//        System.out.println( (p == q || p == y || x == q || x == y));

//      65. Write a Java program to calculate the modules of two numbers
//      without using any inbuilt modulus operator.

//        int x = 10;
//        int y = 15;
//        double res = (double) y/x;
//        System.out.println((res - (int)res) * x);


//      66. Write a Java program to compute the sum of the first
//      100 prime numbers.

//        int sum = 1;
//        int ctr = 0;
//        int n = 0;
//
//        while (ctr < 100) {
//            n++;
//
//            if (n % 2 != 0) {
//                boolean isPrime = true;
//                for (int i = 3; i * i <= n; i += 2) {
//                    if (n % i == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//
//                if (isPrime) {
//                    sum += n;
//                }
//            }
//
//            ctr++;
//        }
//
//        // Print the sum of prime numbers up to 100
//        System.out.println("\nSum of the prime numbers till 100: " + sum);

//        67. Write a Java program to insert a word in the middle of another
//        string.

//        String main_string = "Python 3.0";
//        String word = "Tutorial";
//
//        String result = main_string.substring(0, 7) + word + main_string.substring(6);
//
//        System.out.println(result);

//        68. Write a Java program to create another string of 4 copies of the last 3
//        characters of the original string. The original string length must
//        be 3 and above.

//        String main_string = "Python 3.0";
//        String last_three_chars = main_string.substring(main_string.length() - 3);
//        System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);

//        69. Write a Java program to extract the first half of a even string.

//        String main_string = "Python";
//        String substring = main_string.substring(0, main_string.length() / 2);
//        System.out.println(substring);

//        70. Write a Java program to create a string in the form of
//        short_string + long_string + short_string from two strings.
//        The strings must not have the same length.

//        String str1 = "Python";
//        String str2 = "Tutorial";
//
//        if (str1.length() >= str2.length()) {
//            System.out.println(str2 + str1 + str2);
//        } else {
//            System.out.println(str1 + str2 + str1);
//        }

//        71. Write a Java program to create the concatenation of the two
//        strings except removing the first character of each string.
//        The length of the strings must be 1 and above.

//        String str1 = "Python";
//        String str2 = "Tutorial";
//
//        StringBuilder res = new StringBuilder(str1.substring(1));
//        res.append(str2.substring(1));
//        System.out.println(res);

//        72. Write a Java program to create a string taking the first three
//        characters from a given string. If the string length is less than 3
//        use "#" as substitute characters.

//        String str1 = "";
//
//        // Get the length of the string
//        int len = str1.length();
//
//        // Check the length of the string and take different actions based on its length
//        if (len >= 3) {
//            // If the string has three or more characters, print the first three characters
//            System.out.println(str1.substring(0, 3));
//        } else if (len == 1) {
//            // If the string has only one character, add "##" to it and print
//            System.out.println(str1.charAt(0) + "##");
//        } else {
//            // If the string is empty or has two characters, print "###"
//            System.out.println("###");
//        }

//        73. Write a Java program to create a string taking the first and
//        last characters from two given strings. If the length of each string
//        is 0 use "#" for missing characters.

//        String str1 = "Python";
//        String str2 = "";
//
//        int length2 = str2.length();
//
//        String result = "";
//
//        result += (str1.length() >= 1) ? str1.charAt(0) : '#';
//
//        result += (length2 >= 1) ? str2.charAt(length2 - 1) : '#';
//
//        System.out.println(result);

//        74. Write a Java program to test if 10 appears as the first or
//        last element of an array of integers. The array length must be
//        broader than or equal to 2.

//        int[] num_array = {10, -20, 0, 30, 40, 60, 10};
//        boolean result = (num_array[0] == 10 || num_array[num_array.length - 1] == 10);
//        System.out.println(result);

//        75. Write a Java program to test if the first and last elements
//        of an array of integers are the same. The array length must be
//        broader than or equal to 2.

//        int[] num_array = {50, -20, 0, 30, 40, 60, 10};
//        boolean result = (num_array.length >= 2 && num_array[0] == num_array[num_array.length - 1]);
//        System.out.println(result);

//        76. Write a Java program to test if the first and last element of
//        two integer arrays are the same. The array length must be greater
//        than or equal to 2.

//        int[] num_array1 = {50, -20, 0, 30, 40, 60, 12};
//        int[] num_array2 = {45, 20, 10, 20, 30, 50, 11};
//        if (num_array1.length >= 2 && num_array2.length >= 2) {
//            System.out.println(num_array1[0] == num_array2[0] || num_array1[num_array1.length - 1] == num_array2[num_array2.length - 1]);
//        } else {
//            System.out.println("Array lengths less than 2.");
//        }

//        77. Write a Java program to create an array of length 2 from two
//        integer arrays with three elements. The newly created array will
//        contain the first and last elements from the two arrays.

//        int[] array1 = {50, -20, 0};
//        int[] array2 = {5, -50, 10};
//        System.out.println("Array1: " + Arrays.toString(array1));
//        System.out.println("Array2: " + Arrays.toString(array2));
//        int[] array_new = {array1[0], array2[2]};
//        System.out.println("New Array: " + Arrays.toString(array_new));

//        78. Write a Java program to test that a given array of integers of
//        length 2 contains a 4 or a 7.

//        int[] array_nums = {5, 7};
//
//        System.out.println("Original Array: " + Arrays.toString(array_nums));
//
//        if (array_nums[0] == 4 || array_nums[0] == 7) {
//            System.out.println("True");
//        } else {
//            System.out.println(array_nums[1] == 4 || array_nums[1] == 7);
//        }

//        79. Write a Java program to rotate an array (length 3) of integers
//        in the left direction.

//        int[] array_nums = {20, 30, 40};
//        System.out.println("Original Array: " + Arrays.toString(array_nums));
//        int[] new_array_nums = {array_nums[1], array_nums[2], array_nums[0]};
//        System.out.println("Rotated Array: " + Arrays.toString(new_array_nums));

//        80. Write a Java program to get the largest value between the first
//        and last elements of an array (length 3) of integers.

//        int[] array_nums = {20, 30, 40};
//        System.out.println("Original Array: " + Arrays.toString(array_nums));
//        int max_val = array_nums[0];
//        if (array_nums[2] >= max_val)
//            max_val = array_nums[2];
//        System.out.println("Larger value between first and last element: " + max_val);

    }
}
