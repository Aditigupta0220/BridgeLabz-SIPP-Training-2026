import java.util.Scanner;

public class Question3 {

    static int seats[] = {101, 102, 103, 104, 105};

    public static int getSeat(int index) {

        try {

            return seats[index];

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid Seat Position");

            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seat position: ");
        int index = sc.nextInt();

        int seat = getSeat(index);

        if (seat != -1) {
            System.out.println("Seat Number: " + seat);
        }

        sc.close();
    }
}