 class Sinherit {
    void fly(){
        System.out.println("Bird can fly");
       
    }
}
class Parrot extends Sinherit{
    void color(){
        System.out.println("i am green");
    }


}
class singleParrot extends Parrot{
    void sing(){
        System.out.println("i can sing");
    }
}
class cow extends Sinherit{
    void whatcoloriam(){
        System.out.println("i give milk");
    }
}

public class main{
 public static void main(String[] args) {
    Parrot p = new Parrot();
    cow s = new cow(); 
    p.color();
    s.fly();


    s.whatcoloriam();
    p.fly();

                
    }
} 

