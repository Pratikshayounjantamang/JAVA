// Example of method overrinding
public class Vehicle{
    void run(){
        System.out.println("Vehicle is moving.");
    }
}

class Car2 extends Vehicle{
    @Override
    void run(){
        System.out.println("Car is running safely.");
    }
    

    public static void main(String[] args) {
        Car2 obj = new Car2();
    }
    
}
