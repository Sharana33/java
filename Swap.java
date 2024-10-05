import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the first nubmber:");
        int p =Scanner.nextInt();
        System.out.println("Enter the second number:");
        int t =Scanner.nextInt();
        int temp=p;
        p=t;
        t=temp;
        System.err.println("after swapping the result is "+p+" and "+t);

    }
}