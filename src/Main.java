import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random r = new Random();


    public static String Name;
    public static String Name2;
    public static String RandomName;

    public Main(final String name1, final String name2) {
        super();
        Name = name1;
        Name2 = name2;
    }

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            Main m = null;

            List<String> names = new ArrayList<String>();
            names.add(Name);
            names.add(Name2);

            System.out.println("Enter Name 1: ");
            Name = scan.nextLine();
            System.out.println("Enter Name 2: ");
            Name2 = scan.nextLine();

            Main main = new Main(Name, Name2);
            System.out.println("Name 1: " + Main.Name);
            System.out.println("Name 2: " + Main.Name2);

            int randomNamePicker = r.nextInt(names.size());
            String n = names.get(randomNamePicker);

            System.out.println("Random Name Picked is: " + n);
        } catch(Exception ce) {
            System.out.println(ce.getMessage());
        }
    }


}

