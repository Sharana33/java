import java.util.Scanner;
public class Voting {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter your age:");
        int n =Scanner.nextInt();

        if(n >18){
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you are not eligible to vote");
        }
        Scanner.close();
    }
}
 