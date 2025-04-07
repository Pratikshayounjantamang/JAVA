//Write a program in java to show the implementation of constructor overloading.
public class Const {
    int rollno;
    int phoneno;
    String name;
    Const(){
        rollno=101;
        phoneno=2222;
        name="Pratiksha Tamang";
    }
    Const(int a){
        rollno=a;
        phoneno=3333;
        name="Riya Baral";
    }
    Const(int a, int b){
        rollno=a;
        phoneno=b;
        name="Debu Bohara";
    }
    Const(int a, int b, String c){
        rollno=a;
        phoneno=b;
        name=c;
    }
    void display(){
        System.out.println("The roll number and phone number of a student is:"+rollno+"\t"+phoneno+"\t"+name);
}



