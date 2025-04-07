//Runtime polymorphism(Method overriding/Dynamic BUilding
abstract class calc{
    abstract void area();
}
class circle extends calc{
    @Override
    void area(){
        double r=10; double a=(3.14*r*r);
        System.out.println("The area of circle is :"+a);
    }   
   }
class triangle extends calc{
    @Override
    void area(){
        double b=10, h=15; double a=0.5*b*h;
        System.out.println("The area of traingle is :"+a);
    }
}
class rectangle extends calc{
    @Override
    void area(){
        double b=10, l=11; double a=l*b;
        System.out.println("The area of rectangle is :"+a);
    }   

    public static void main(String[] args) {
        calc c;
        rectangle rt = new rectangle();
        c=rt;
        c.area();
        
        triangle t = new triangle();
        c=t;
        c.area();
        circle m = new circle();
        c=m;
        c.area();
    }
    
}
