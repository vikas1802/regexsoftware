
//read content in a file
//import java.util.Scanner;
//import java.io.File;
//import java.io.FileNotFoundException;
//public class G {
//    public static void main(String[] args) {
//        try{
//            File myobj = new File("by.txt");
//            Scanner myreader = new Scanner(myobj);
//            while (myreader.hasNextLine()){
//                String data = myreader.nextLine();
//                System.out.println(data);
//            }
//            myreader.close();
//        }
//        catch (FileNotFoundException e){
//            System.out.println("an occured ");
//            e.printStackTrace();
//        }
//
//    }
//}
//delete a file
import java.io.File;
public class G{
    public static void main(String[] args) {
        File obj = new File("by.txt");
        if(obj.delete()){
            System.out.println("deleted file:"+obj.getName());
        }
        else {
            System.out.println("failed to deleted the file");
        }
    }
}

