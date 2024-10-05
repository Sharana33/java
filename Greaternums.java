import java.util.Scanner;

public class Greaternums {
    
  public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n1 =Scanner.nextInt();
        int n2 =Scanner.nextInt();

        if(n1>n2){
            System.out.println("n1 is greater");
        }
        else{
            System.out.println("n2 is greater");
        }
        Scanner.close();
    }
}
    

