import java.util.Scanner;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Question1 {

    public static void processPayment(double bill, double paid)
            throws InsufficientFundsException {

        if (paid < bill) {
            throw new InsufficientFundsException("Payment Failed: Insufficient Funds");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter total bill amount: ");
            double bill = sc.nextDouble();

            System.out.print("Enter number of items: ");
            int items = sc.nextInt();

            System.out.println("Cost per item = " + (bill / items));

            int[] patients = {101, 102, 103};

            System.out.print("Enter patient index: ");
            int index = sc.nextInt();

            System.out.println("Patient ID: " + patients[index]);

            sc.nextLine();

            System.out.print("Enter payment amount: ");
            String input = sc.nextLine();

            double paid = Double.parseDouble(input);

            processPayment(bill, paid);

        } catch (ArithmeticException e) {

            System.out.println("Error: Number of items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Invalid patient index.");

        } catch (NumberFormatException e) {

            System.out.println("Error: Invalid payment input.");

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}