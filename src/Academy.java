import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Academy {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        char c = (char) in.read();
     boolean z =IsDigit(c);
     if(z){
         System.out.println("yes");
     }else{System.out.println("no");}


    }
       public static boolean IsDigit(int c){
             return Character.isDigit(c);
         }


}
