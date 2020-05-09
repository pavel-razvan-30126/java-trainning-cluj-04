package PhoneBook;

import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String name1 = "Abbey";
        String name2 = "Abdul";
        File file = new File("D:\\UTCN\\Google\\java-trainning-cluj-04\\_4_exceptions_&_IO\\_4.1_phonebook\\src\\PhoneBook\\phonebook.txt");
        HashMap<String, String> hashMap = new HashMap<>();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file))))
            {
                String line = bufferedReader.readLine();
                while((line  != null)){
                    String[] words = line.split(" ");
                    hashMap.put(words[0],words[1]);
                    line = bufferedReader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        System.out.println(hashMap.get(name1)+", "+hashMap.get(name2));

    }
}
