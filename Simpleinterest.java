import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the amount:");
        int p =Scanner.nextInt();
        System.out.println("Enter the duration time:");
        int t =Scanner.nextInt();
        System.out.println("Enter the Inerst:");
        int r =Scanner.nextInt();
        float s=(p*t*r)/100;
        System.out.println("Simple interest is+"+s);
    }
}

    

