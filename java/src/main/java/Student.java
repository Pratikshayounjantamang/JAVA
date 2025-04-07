/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Student {
    int rollno;
    int phoneno;
    void setdata(int a, int b){
        rollno = a;
        phoneno = b;
    }
    void display(){
        System.out.println("The roll number and phone number of a student is: "+rollno+"\t"+phoneno);
    }
   
}
