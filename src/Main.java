import java.util.*;

class Node {
    String title;
    HashMap<String, String> data;
    Node left;
    Node right;

    Node(String title) {
        this.title = title;
        this.data = new HashMap<>();
        this.left = null;
        this.right = null;
    }
}
public class Main {

    static Node root;

    static void buildTree() {
        root = new Node("University FAQs");

        root.left = new Node("Departments");
        root.right = new Node("Student Services");

        root.left.left = new Node("Fee Structure");
        root.left.right = new Node("Timetable");

        root.data.put("university", "ABC University was established in 2005 and offers undergraduate and postgraduate programs.");
        root.data.put("location", "The university is located in Lahore.");
        root.data.put("vice chancellor", "Dr. Ahmed Khan is the Vice Chancellor.");

        root.left.data.put("computer science", "BS Computer Science is a 4-year degree program.");
        root.left.data.put("software engineering", "BS Software Engineering focuses on software design and development.");
        root.left.data.put("business administration", "BBA is an 8-semester business degree.");

        root.left.left.data.put("bscs fee", "BSCS fee is 120000 PKR per semester.");
        root.left.left.data.put("bba fee", "BBA fee is 100000 PKR per semester.");
        root.left.left.data.put("hostel fee", "Hostel fee is 35000 PKR per semester.");

        root.left.right.data.put("monday", "Classes start at 8:30 AM and end at 3:30 PM.");
        root.left.right.data.put("tuesday", "Classes start at 9:00 AM and end at 4:00 PM.");
        root.left.right.data.put("friday", "Classes end at 1:00 PM.");

        root.right.data.put("library", "Library timing is 8:00 AM to 8:00 PM.");
        root.right.data.put("transport", "Transport service is available in major city areas.");
        root.right.data.put("scholarship", "Merit scholarships are available for high-achieving students.");
    }
}