package Number_To_Lcd;

import java.io.*;

public class Main {
    private String line1 = "";
    private String line2 = "";
    private String line3 = "";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:\\UTCN\\Google\\java-trainning-cluj-04\\_4_exceptions_&_IO\\_4.4_number_to_lcd\\src\\Number_To_Lcd\\input.txt"))));

        Main main = new Main();

        String stringNumber = bufferedReader.readLine();
        for (int i = 0; i < stringNumber.length(); i++) {
            main.toLcd(stringNumber.charAt(i));
        }
        System.out.println(main.line1);
        System.out.println(main.line2);
        System.out.println(main.line3);
    }

    public void toLcd(char digit) {
        switch (digit) {
            case '1': {
                addToLine(line1, " ");
                addToLine(line2, "|");
                addToLine(line3, "|");
                space(2,2,2);
                break;
            }
            case '2': {
                addToLine(line1, " _");
                addToLine(line2, " _|");
                addToLine(line3, "|_");
                space(2,1,2);
                break;
            }
            case '3': {
                addToLine(line1, "_");
                addToLine(line2, "_|");
                addToLine(line3, "_|");
                space(2,1,1);
                break;
            }
        }
    }

    public void addToLine(String line, String sign) {
        if (line.equals(line1)) {
            line1 += sign;
        } else if (line.equals(line2)) {
            line2 += sign;
        } else {
            line3 += sign;
        }
    }

    public void space(int a, int b, int c) {
        for(int i = 0; i < a; i++){
            line1 += " ";
        }
        for(int i = 0; i < b; i++){
            line2 += " ";
        }
        for(int i = 0; i < c; i++){
            line3 += " ";
        }
    }
}
