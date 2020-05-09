package Secret_Message;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\UTCN\\Google\\java-trainning-cluj-04\\_4_exceptions_&_IO\\_4.2_secret_message\\src\\Secret_Message\\message.txt");
        FileReader fileReader = new FileReader(file);
        int c = fileReader.read();
        while(c!=-1){
            if(c>64 && c<91 && c!=88) //Between A and Z & !=X
            {
                System.out.print(String.valueOf((char)c));
            }
            if(c == 88){
                System.out.print(" ");
            }
            c = fileReader.read();
        }



    }
}
