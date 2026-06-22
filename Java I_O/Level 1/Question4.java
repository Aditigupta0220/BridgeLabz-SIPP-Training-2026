import java.io.*;

public class Question4 {

    public static void main(String[] args) {

        int lineCount = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader("bill.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
                lineCount++;
            }

            br.close();

            System.out.println("Total Lines = " + lineCount);

        } catch (IOException e) {

            System.out.println("Unable to read bill file.");
        }
    }
}