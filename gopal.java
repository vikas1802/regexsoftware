import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.*;
//
////file creating.....
//public class gopal {
//    public static void main(String[] args) {
//        try {
//            File obj = new File("hiiii.txt");
//            if (obj.createNewFile()) {
//                System.out.println("file created:" + obj.getName());
//            } else {
//                System.out.println("file already exist");
//            }
//        } catch (IOException e) {
//            System.out.println("an occured file");
//            e.printStackTrace();
//        }
//    }
//}

//file writing....

public class gopal {
    public static void main(String[] args) {
        try{
            FileWriter Mmywrite = new FileWriter("ghhgh");
            Mmywrite.write("file in java");
            Mmywrite.close();
            System.out.println("succesfully add");

        }
        catch (IOException e){
            System.out.println("an occured file");
            e.printStackTrace();
        }
    }
}

