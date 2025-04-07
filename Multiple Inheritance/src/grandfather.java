// Multiple Inheritance
// WAP in java use to show multiple inheritances through implementong interfaces in a class.
interface Father{
    void write();
            }
interface Mother{
    void read();
}

class Child implements Father,Mother{
 
    @Override
    public void write(){
        System.out.println("Good Morning, My name is Pratiksha Tamang.");
    }
   
    @Override
    public void read(){
        System.out.println("Iam pursuing my further study from NAMI.");
            }
    void play(){
        System.out.println("Iam pursuing my degree in BSC (hons) Computer SCience.");
    }
}
class multiple{
    public static void main(String[] args){
        Child c = new Child();
        c.write();
        c.read();
        c.play();
    }
    
}
