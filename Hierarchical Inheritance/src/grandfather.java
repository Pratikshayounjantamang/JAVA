// Hierarchical Inheritance
public class grandfather{
    void watch(){
        System.out.println("Hello, How are you?");
    }
    }
class uncle extends grandfather{
    void write(){
        System.out.println("How may I help you?");
    }
    }
class father extends grandfather{
    void read(){
        System.out.println("Is there any problem?");
    }
    }
class grandson extends uncle{
    void play(){
        System.out.println("Hello, I'm fine!!.");
    }
    }
class granddaughter extends father{
    void go(){
        System.out.println("No Problem.");
    }
}

class hierarchical{

    public static void main(String[] args) {
        grandson gs = new grandson();
        gs.watch();
        gs.write();
        gs.play();
        
        
        granddaughter gd = new granddaughter();
        gd.watch();
        gd.read();
        gd.go();
    }
   
    
}

