//same name same parameter s known as runtime polymorphism
class Animal {
    public void sound(){
        System.out.println("animal make sound");
    }

    
}
class Dog extends Animal{
    public void sound(){
        System.out.println("the Dog can barks");
    }
}
class cat extends Animal{
    public void sound(){
        System.out.println("the cat moves");
    }
}
public class Rpolymorphism{
    public static void main(String[] args) {
        Animal myAnimal=new Animal();
        Animal myDog=new Dog();
        Animal mycat=new cat();


        myAnimal.sound();
        myDog.sound();
        mycat.sound();
    }
}