import java.io.*;
import java.util.*;

public class Java_End_of_file {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int i=1;
        do{
            String s;
            s=in.nextLine();
            System.out.println(i+" "+s);
            i++;

        }while(in.hasNext());
        in.close();

    }
}
