package FileHandlingUtility;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File dr=new File("C:/Users/88017/OneDrive/Desktop/Bonny");
        dr.mkdir();
        String path=dr.getAbsolutePath();

        File file1=new File(path+"/student.txt");
        File file2=new File(path+"/teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("files are created");

        }catch (Exception e){
            System.out.println(e);
        }

    }
}


