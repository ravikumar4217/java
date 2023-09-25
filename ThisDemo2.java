import java.io.*;
class Student {
    int Rollno;
    String Name;
    float Fee;
    Student(int Rollno,String Name,float Fee)
    {
        this.Rollno=Rollno;
        this.Name=Name;
        this.Fee=Fee;
    }
    void display(){
    System.out.println("Student details are");
    System.out.println(Rollno+" "+Name+" "+Fee);
    }
}
public class ThisDemo2{
    public static void main(String args[]) {
        Student s1=new Student(4217,"Ravi",45700);
        Student s2=new Student(4218,"Pavan",45700);
        s1.display();
        s2.display();
    }
}
