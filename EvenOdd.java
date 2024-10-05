import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =Scanner.nextInt();

        if(n % 2 == 0){
            System.out.println("given number is even");
        }
        else{
            System.out.println("given number is odd");
        }
        Scanner.close();
    }
}
