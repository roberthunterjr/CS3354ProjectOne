import java.util.Scanner;

public class MyUtil {

    public static String getInput(String msg) {
        Scanner reader = new Scanner(System.in);
        System.out.println(msg);
        String output = reader.next();
        reader.close();
        return output;
    }
}

