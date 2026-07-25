class Person {


    public String name = "Mishkat";

    private int age = 22;

    protected String city = "Dhaka";


    void display() {

        System.out.println(name);
        System.out.println(age);
        System.out.println(city);

    }

}


public class AccessModifierExample {


    public static void main(String[] args) {


        Person p = new Person();


        p.display();

    }
}