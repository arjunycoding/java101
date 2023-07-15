import java.util.Arrays;
/**********
 * NOTES *
 **********/
// String.format("hello, %s", "arjun"); --> hello arjun
// %d  --> integers(think decimals)
// %s --> STRINGS :)
// System.out.print("h"); --> h
// System.out.print("h"); --> hh
// System.out.println("h"); --> hh \n h
public class Main {
    public static void main(String[] args) {
        try {
            Person arjun = new Person("Arjun", "Yuvaraj", 12, "                                                       ");
            Person adhithya = new Person("Adhithya", "Yuvaraj", 14, "monkey");


            arjun.printDetails();
            adhithya.printDetails();
            Person nullPerson = new Person(null, null, 0, "nothing");
            nullPerson.printDetails();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}