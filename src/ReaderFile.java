import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderFile {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(listsReader()));
    }
    public static String[] listsReader() throws IOException {
        String fileName = "lists";
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        String[] s = new String[2];
        int i = 0;
        while(scanner.hasNext()){
            s[i] = scanner.nextLine();
            i++;
        }
        return s;
    }


}