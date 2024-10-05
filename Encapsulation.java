 class Person {
    private String name;
    private int Age;
    
    public String getName(){
       return name;
    }
    public void setName(String name){
        if(name != null || name.isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("invalid name:"+name);
        }

    }
    public int getAge(){
        return Age;
    }
    public void setAge(int age){
        if (Age > 0) {
            System.out.println("Invalid age:"+age);
            //this.Age=age;
            
        }
        else{
            this.Age=age;
            //System.out.println("Invalid age:"+age);
        }
    }
 }
 public class Encapsulation{
    public static void main(String[] args) {
        Person person=new Person();

        person.setName("sahil");
        person.setAge(20);

        System.out.println("Name:"+person.getName());
        System.out.println("Age:"+person.getAge());

        //person.setAge(-5);

    }
 }