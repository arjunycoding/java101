public class Main {
    public static void main(String[] args) {
        Person arjun = new Person("Arjun", "Yuvaraj", 12);
        arjun.printDetails();

        Person dad = new Person("Dad", "", 100);
        dad.printDetails();

        Person adhithya = new Person("Adhithya", "Yuvaraj", 14);
        adhithya.printDetails();



//        %d  --> integers(think decimals)
//        %s --> STRINGS :)
        arjun.printDetails();
        dad.printDetails();
        adhithya.printDetails();
        System.out.println("Hello World!");

        Person[] family = new Person[4];

        for (int i = 0; i < family.length; i++){
            family[i] = new Person(Integer.toString(i), Integer.toString(i), i);
        }
        for (int i = 0; i < family.length; i++) {
            family[i].printDetails();
        }

    }
}