class Student {

    String name;
    int age;


    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}


public class ClassObjectExample {

    public static void main(String[] args) {


        Student student1 = new Student();


        student1.name = "Mishkat";
        student1.age = 22;


        student1.display();

    }
}