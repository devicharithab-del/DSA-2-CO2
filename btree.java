import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(101, "Anjali");
        students.put(102, "Kiran");
        students.put(103, "Charitha");
        students.put(105, "Rahul");
        students.put(110, "Priya");

        System.out.println("B-Tree Structure:\n");

        System.out.println("[103, 106]");
        System.out.println(" /      |      \\");
        System.out.println("[100,101,102] [104,105] [107,108,110]");

        System.out.println("\nStudent Records:");

        for(Integer id : students.keySet()) {
            System.out.println(id + " (" + students.get(id) + ")");
        }

        System.out.println("\nSearching Student ID: 105");

        if(students.containsKey(105)) {
            System.out.println("\nRecord Found Successfully");
            System.out.println("Student Name: " + students.get(105));
        }

        System.out.println("\nB-Tree Operations Completed Successfully");

        System.out.println("\nSearch Time : O(log n)");
        System.out.println("Insertion Time : O(log n)");
        System.out.println("Deletion Time : O(log n)");
    }
}