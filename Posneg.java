import java.util.Scanner;
public class Posneg {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =Scanner.nextInt();

        if(n >0){
            System.out.println("given number is positive");
        }
        else{
            System.out.println("given number is Negative");
        }
        Scanner.close();
    }
}


