import java.io.*;
import java.io.IOException;
import java.util.*;

public class Word_Counter {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            File obj = new File("myfile.txt");
            if (!obj.createNewFile()) {
                System.out.println("File not Created");
            } else {
                System.out.println("File created");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // writing a file

        try {
            FileWriter writer = new FileWriter("myfile.txt");
            System.out.println("Enter the String --> ");
            String str = "";
            str = sc.nextLine();
            writer.write(str);
            writer.close();
            System.out.println("Data written successfully to the file...");
        } catch (IOException e) {
            System.out.println("An error has Occurred");
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        String data = "";

        // Reading a File
        try {
            File obj = new File("myfile.txt");
            Scanner reader = new Scanner(obj);
            while (reader.hasNextLine()) {
                data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        // Spliting in array and counting the number of words

        int count = 1;
        char arr[] = new char[data.length()];
        for (int i = 0; i < data.length() - 1; i++) {
            arr[i] = data.charAt(i);
            if (data.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println(); 
        
        System.out.println("The number of word in the string is : " + count);
    }
}