package OOPs;


class Student {
    String name;
    int age;

    // No-argument constructor
    public Student() {
    }

    public void PrintInfo(String name) {
        System.out.println(name);
    }

    public void PrintInfo(int age) {
        System.out.println(age);
    }

    public void PrintInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student S1=new Student();
        S1.name="Ram";
        S1.age=19;

        S1.PrintInfo(S1.name);
        
    }
    
}

