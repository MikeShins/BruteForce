
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String a = new Scanner(in).nextLine();
        File file = new File(System.getProperty("user.dir") + "\\src\\words");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String pass = "";
        String temp = null;
        while (true) {

            temp = reader.readLine();
            if (temp == null) {
                reader.reset();
            }
            if (temp.equalsIgnoreCase(a)) {
                pass = temp;
                break;
            }
        }
        System.out.println(pass);

    }
}
