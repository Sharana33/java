import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int p =Scanner.nextInt();
        int sum=0;
        int temp=p;
        while(p>0){
            int r=p%10;
            sum=(sum*10)+r;
            p= p/10;
        }
        if(temp==sum){
            System.out.println("It is a palindrome");

        }
        else
        System.out.println("It is not a palindrome");
    }
}
