import com.sun.jdi.ClassNotLoadedException;
//CLASSES
// - instance Variable
// - methods
// - consrtuctors
// - class level varibles


public class Person {
//    Class Level Variable
    static String SPECIES = "Ramen";

//    Instance Variable
    String firstName;
    String lastName;
    int age;

//    Constructor
    /*Constructor signiture*/public Person(String firstName, String lastName, int age, String species) throws Exception {
        if(firstName == null || lastName == null || age <=0 ){
            Exception e = generateException();
            throw e;

        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        Person.SPECIES = species;
    }

    private Exception generateException(){
        String message = "The required arguments are missing or null";
        return new ClassNotLoadedException("Person", message);
    }

    //INSTANCE METHODS
    public void printDetails(){
        System.out.println(String.format("%s %s is %d years old and is of type: %s", this.firstName, this.lastName, this.age, Person.SPECIES));
    }
}
