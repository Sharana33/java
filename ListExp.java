import java.util.ArrayList;
public class ListExp{
    public static void main(String[] args) {
        ArrayList<String> fruits =new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("first fruit:"+fruits.get(0));

        for(String fruit:fruits){
            System.out.println(fruit);
        }
        fruits.remove("Banana");
        System.out.println("After removing fruit"+fruits);
    } 

} 