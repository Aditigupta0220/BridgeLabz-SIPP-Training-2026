import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(double balance, double withdrawal) {

        super("Withdrawal Amount = ₹" + withdrawal +
                ", Available Balance = ₹" + balance);
    }
}

public class Question2 {

    public static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance = ₹" + (balance - amount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {

            withdraw(balance, amount);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        }

        sc.close();
    }
}