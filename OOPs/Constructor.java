package OOPs;

class Student{
    String name;
    int age;

    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
// Constructor call 
    // Student(){
    //     System.out.println("Constructor Called");
    // }

    // Parametraise constructor
    
    Student(String name,int age){
        this.name=name;
        this.age =age;

    }
}

public class Constructor {
    public static void main(String[] args) {
       Student S1=new Student("Ram",24);
        // S1.name="Ram";
        // S1.age=19;

        S1.PrintInfo();
    }
    
    
}
