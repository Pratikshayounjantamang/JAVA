// Multilevel Inheritance
public class grandfather {
    void watch()
    {
        System.out.println("Hi I'm from grandfather class. I'm interested to watch movie in youtube.");
    }
}
class father extends grandfather{
    void read(){
        System.out.println("Hi, I'm from father class and interested to read novel");
    }
}
class children extends father{
    void play(){
        System.out.println("I'm interested to play a video game");
    }
}
class impl{
    public static void main(String[] args){
        children c= new children();
        c.watch();
        c.read();
        c.play();
    }
    
}
