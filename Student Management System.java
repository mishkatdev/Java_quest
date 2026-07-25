public class Student {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa)   //Constructor
{       this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", CGPA: " + cgpa);
    }
}

public class StudentManagement 
{
    public static void main(String[] args) 
    {
        Student student1 = new Student("Mishkat", 30, 3.75);
        Student student2 = new Student("Tushar", 23, 3.90);

        student1.displayInfo();
        student2.displayInfo();
    }
}
