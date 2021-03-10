package Homework6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        try {
            FileOutputStream file1 = new FileOutputStream("file1.txt");
            PrintStream ps = new PrintStream(file1);
            ps.println("Text of file1 Text of file1 Text of file1 Text of file1 Text of file1 Text of file1 Text of file1 Text of file1 Text of file1");
            ps.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            FileOutputStream file2 = new FileOutputStream("file2.txt");
            PrintStream ps = new PrintStream(file2);
            ps.println("Text of file2 Text of file2 Text of file2 Text of file2 Text of file2 Text of file2 Text of file2 Text of file2 Text of file2");
            ps.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("file1.txt");
            int inputByteData;
            while((inputByteData = fileInputStream.read()) != -1) {
                System.out.print((char) inputByteData);
            }
            FileInputStream fileInputStream2 = new FileInputStream("file2.txt");
            int inputByteData2;
            while((inputByteData2 = fileInputStream2.read()) != -1) {
                System.out.print((char) inputByteData2);
                fileInputStream.close();
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }



    }

}


