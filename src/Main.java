import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "";
        try(FileReader fr = new FileReader("D:\\Java\\Task2\\untitled\\src\\myInputFile.txt")){
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNextLine()){
                str = str + scanner.nextLine() + '\n';
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Pattern email = Pattern.compile("(\\d|\\w)(\\d|\\w|_|\\.)+@(\\d|\\w)+\\.\\w+");
        Matcher matcher = email.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}