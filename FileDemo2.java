package FileHandlingUtility;

import java.util.Formatter;

public class FileDemo2 {

        public static void main(String[] args) {
      /*  String ID,NAME,CITY;
        try{
            Formatter formatter=new Formatter("C:/Users/88017/OneDrive/Desktop/Bonny/Student.txt");
            Scanner sc=new Scanner(System.in);
            System.out.println("How many students: ");
            int num=sc.nextInt();

            for (int i = 0; i <=num ; i++) {
                System.out.println("Enter student ID,NAME and CITY: ");
                ID= sc.next();
                NAME= sc.next();
                CITY= sc.next();
                formatter.format("%s %s %s\r\n",ID,NAME,CITY);
            }
            formatter.close();

        } catch (Exception e) {
            System.out.println(e);
        }

       */

            try {
                Formatter formatter=new Formatter("C:/Users/88017/OneDrive/Desktop/Bonny/Student.txt");
                formatter.format("%s %s %s\r\n","101","roni","kushtia");
                formatter.format("%s %s %s\r\n","102","roi","kushtia");
                formatter.format("%s %s %s\r\n","103","ruba","kushtia");
                formatter.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


