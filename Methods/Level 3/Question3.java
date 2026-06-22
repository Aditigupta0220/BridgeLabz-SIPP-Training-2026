import java.util.Scanner;

public class Question3 {

    public static int countDigits(int number) {

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int[] getDigits(int number) {

        int count = countDigits(number);

        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int sumDigits(int[] digits) {

        int sum = 0;

        for (int digit : digits)
            sum += digit;

        return sum;
    }

    public static double sumSquareDigits(int[] digits) {

        double sum = 0;

        for (int digit : digits)
            sum += Math.pow(digit, 2);

        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {

        int sum = sumDigits(digits);

        return number % sum == 0;
    }

    public static int[][] frequency(int[] digits) {

        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int digit : digits)
            freq[digit][1]++;

        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Sum of Digits = " + sumDigits(digits));

        System.out.println("Sum of Squares = " + sumSquareDigits(digits));

        System.out.println("Harshad Number = " + isHarshad(number, digits));

        int[][] frequency = frequency(digits);

        System.out.println("\nDigit\tFrequency");

        for (int i = 0; i < 10; i++) {

            if (frequency[i][1] != 0)
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
        }

        sc.close();
    }
}