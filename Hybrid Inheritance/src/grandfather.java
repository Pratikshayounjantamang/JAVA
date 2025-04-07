
public class grandfather{
    void read(){
        System.out.println("Hi, I belong to top Superclass called grandfather.");
    }
}
class Father extends grandfather{
    void write(){
        System.out.println("Hi, I belong to next super class called father.");
    }
}
class Uncle extends grandfather{
    void watch(){
        System.out.println("Hi, I belong to next super class called uncle.");}
    
}
class grandchild extends Father{
    void play(){
        System.out.println("Hi, I belong to subclass called grandchild.");
    }
}
class hybrid{
    public static void main(String args[]){
        grandchild gc = new grandchild();
        gc.read();
        gc.write();
        gc.play();
    }
    }
    
