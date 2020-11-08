import java.util.*;

public class VectorFreq{
    static Scanner input = new Scanner(System.in);

    public static void initialize() {
        Vector<String> v = new Vector<String>();
        System.out.print("To Initialize a String vector type I: ");
        if ((input.next()).equalsIgnoreCase("I")) {
            String QuickInitialize[] = {"Parth", "Goku", "Yash", "Vegeta", "Ted", "Mark", "Drew", "Hannah", "Clay",
                    "Cedric", "Bruce", "Tony", "Scarlett", "Light", "Naruto", "Sasuke", "Saitama", "Ash",
                    "Clark", "Abhishek", "Bucky", "Steve", "Bob", "Mark", "Parth", "Harsh", "Yash", "Logan", "Naruto",
                    "Bruce", "Cedric"};
            v.addAll(Arrays.asList(QuickInitialize));
            System.out.println("Initialized successfully");
            stats(v);
        }
        System.out.print("Do you want to enter elements manually?: (Y/N) ");
        if ((input.next().equalsIgnoreCase("Y"))) {
            String flag1 = "";
            do {
                System.out.print("Enter the element in vector array: ");
                String in = input.next();
                v.addElement(in);
                System.out.print("Do you want to add another element?: (Y/N) ");
                flag1 = input.next();
            } while (flag1.equalsIgnoreCase("Y"));
        }
        if (v.isEmpty()) {
            System.out.println("Empty Vector!");
            initialize();
        } else {
            System.out.print("Enter an element you want to search: ");
            String searchStr = input.next();
            search(v, searchStr);
        }
    }

    static void search(Vector<String> vs, String s) {

        int counter = 0;
        Vector<Integer> location = new Vector<Integer>();
        for (int j = 0; j < vs.size(); j++) {
            if (s.equalsIgnoreCase(vs.get(j))) {
                counter++;
                location.addElement(j);
            }
        }
        if (counter > 0) {
            System.out.println("Element " + s + " found " + counter + " times at location " + location);
            System.out.print("Do you want to remove them? (Y/N) ");
            String flag2 = input.next();
            if (flag2.equalsIgnoreCase("Y")) {
                for (int i = 0; i < location.size(); i++) {
                    int x = location.get(i);
                    vs.remove(x - i);
                    System.out.println("Element removed from " + x + " successfully");
                }
                stats(vs);
            } else {
                System.out.println("Ignored Elements");
            }
        }
        else if (counter == 0) {
            System.out.println("Element not found. Do you want to add " + s + " to the vector? (Y/N)");
            String flag2 = input.next();
            if (flag2.equalsIgnoreCase("Y")) {
                vs.add(s);
                System.out.println("Element added successfully");
                stats(vs);

            }
        }
    }

    static void stats(Vector<String> v) {
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("Elements of Vector are: " + v);
    }

    public static void main(String[] args) {
        initialize();
        String flag0 = "";
        do {
            System.out.print("To Restart press R: ");
            flag0 = input.next();
            if (flag0.equalsIgnoreCase("R"))
                initialize();
        } while (flag0.equalsIgnoreCase("R"));
    }

}
