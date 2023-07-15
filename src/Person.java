public class Person {
//    instance vars
//    INSTANCE VARIABLES AT THE TOP :)
    String firstName;
    String lastName;
    int age;

//    Constructor: "public <name>(){}"
//    CONSTRUCTORS AFTER THE INSTANCE VARIABLES
//"this" is not required but PLEASE USE IT
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printDetails(){
        System.out.println(String.format("%s %s is %d years old", this.firstName, this.lastName, this.age));
    }
}
