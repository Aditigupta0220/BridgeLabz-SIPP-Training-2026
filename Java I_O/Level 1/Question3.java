import java.io.*;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("expenses.txt", true));

            System.out.print("Enter Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            bw.write(category + " - " + amount);
            bw.newLine();

            bw.close();

            System.out.println("Expense Saved Successfully.");

        } catch (IOException e) {

            System.out.println("Unable to write file.");
        }

        sc.close();
    }
}