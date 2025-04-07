//WAP in java to show the implementation of parameterized and default constructor.
public class Student2 {
    int rollno;
    int phoneno;
    Student2(){
        rollno=101;
        phoneno=2222;
    }
    Student2 (int a,int b){
            rollno=a;
            phoneno=b;
    }
    void display(){
        System.out.println("The roll number and phone number of a stident is :"+rollno+"\t"+phoneno);
    }
}
    
    

