

import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class bruteforce {

    static ArrayList<String> one = new ArrayList<String>();
    static ArrayList<String> two = new ArrayList<String>();
    static ArrayList<String> three = new ArrayList<String>();
    static ArrayList<String> four = new ArrayList<String>();
    static ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
    static ArrayList<String> current = new ArrayList<String>();
    static int listcount = 0;

    public static void main(String[] args) throws Exception{
        String a = new Scanner(in).nextLine();
        File file = new File(System.getProperty("user.dir") + "\\src\\words");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String pass = "";
        String temp = null;
        while (true) {

            temp = reader.readLine();
            if (temp == null)
                reader.reset();
            if (temp.equalsIgnoreCase(a)) {
                pass = temp;
                break;
            }
        }
        System.out.println(pass);

    }
    public static void defineCurrent(){
        current = lists.get(listcount);
    }
    public static void nextArray(){
        for(int x = 0; x<current.size(); x++){
            lists.get(listcount).add(current.get(x));
        }
        listcount++;
        defineCurrent();
    }
}

