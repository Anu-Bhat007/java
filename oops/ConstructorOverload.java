package oops;

class Student1{
    int num;
    String name;
    int age;
    Student1(int i, String n){
        num = i;
        name = n;
    }
    Student1(int i, String n,int a){
        num = i;
        name = n;
        age = a;
    }
    void display(){
        System.out.println(num+" "+name+" "+age);
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        Student1 s1 = new Student1(11, "Drithi",21);
        Student1 s2 = new Student1(47, "Tia");
        s1.display();
        s2.display();
    }
}
