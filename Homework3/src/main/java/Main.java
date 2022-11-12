import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
//        String data = "kanakaev oleg vladislavovich 20.07.1997 9997930130 m";
        String[] date = data.split(" ");
        for (String s: date)
            System.out.println(s);
        ParseString parse = new ParseString();
        try {
            parse.parse(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
