// Single inheritance
public class Father{
    void write(){
        System.out.println("Hi, I'm interested to write my daily diary.");
    }
}
class Children extends Father{
    void watch(){
        System.out.println("Hi, I'm interested to watch youtube.");
    }
}
class FA{
    public static void main(String[] args){
        Children c= new Children();
        c.write();
        c.watch();
    }
    
}
