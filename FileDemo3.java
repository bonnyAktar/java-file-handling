package FileHandlingUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo3 {

        public static void main(String[] args) {

            try {
                File file=new File("C:/Users/88017/OneDrive/Desktop/Bonny/Student.txt");
                Scanner sc=new Scanner(file);
                while (sc.hasNext()){
                    String ID= sc.next();
                    String NAME= sc.next();
                    String CITY= sc.next();
                    System.out.println("Id:"+ID+" "+"Name:"+NAME+" "+"City:"+CITY);
                }
                sc.close();

            } catch (FileNotFoundException e) {
                System.out.println(e);
            }

        }
    }


