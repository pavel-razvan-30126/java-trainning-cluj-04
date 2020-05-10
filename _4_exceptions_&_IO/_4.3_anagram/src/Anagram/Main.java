package Anagram;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        System.out.println("Enter word: ");
        String stringWord = scanner.next();
        char[] word1 = main.stringToChar(stringWord);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:\\UTCN\\Google\\java-trainning-cluj-04\\_4_exceptions_&_IO\\_4.3_anagram\\src\\Anagram\\words.txt"))));
        String word2 = bufferedReader.readLine();
        while (word2 != null) {
            if (main.isAnagram(word1, main.stringToChar(word2))) {
                System.out.println(word2 + " is anagram for " + stringWord);
            }
            word2 = bufferedReader.readLine();
        }
    }

    public boolean isAnagram(char[] word1, char[] word2) {
        if (word1.length != word2.length) return false;

        Arrays.sort(word1);
        Arrays.sort(word2);

        for (int i = 0; i < word1.length; i++) {
            if (word1[i] != word2[i]) return false;
        }

        return true;
    }

    public char[] stringToChar(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        return chars;
    }

}
