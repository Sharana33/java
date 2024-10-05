abstract class Animal { 
    public abstract void sound();
public void sleep(){
    System.out.println("the animal is sleeping");
}
    
}
class Dog extends Animal{
    public void sound(){
        System.out.println("the dog barks");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("cat meow");
    }
}
public class Abstract{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal mycat = new Cat();

        myDog.sound();
        mycat.sound();

        myDog.sleep();
        mycat.sleep();
    }
} 
