import java.io.*;

public class Question2 {

    public static void main(String[] args) {

        int count = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader("feedback.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                if (line.toLowerCase().contains("good")) {
                    count++;
                }
            }

            br.close();

            System.out.println("Good Feedback Count = " + count);

        } catch (IOException e) {

            System.out.println("Unable to read file.");
        }
    }
}