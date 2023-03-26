package Exam1;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//        ArrayList<Character> array =new ArrayList<>();
        char[] array = new char[100];
        try {
            //Tạo một FileReader
            File files = new File("D:\\output.txt");
            FileWriter fileWriter = new FileWriter(files);
            FileReader file = new FileReader("D:\\input.txt");
            //Tạo một BufferedReader
            BufferedReader input = new BufferedReader(file);
            //Đọc các ký tự và lưu vào array
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
            //ghi vao file
            BufferedWriter writer = new BufferedWriter(fileWriter);
            System.out.println(fileWriter);

            String data = "This is BufferedWriter.";
            writer.write(array);
            writer.flush(); //ghi thang vao file ma khong can thong qua bo nho dem
            System.out.println("File written successfully.");
            //Đóng reader
            input.close();
        }
        catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
