import java.util.Scanner;
public class calsi {
    public static void main(String[] args){
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1 =Scanner.nextInt();
        System.out.println("Enter the second number :");
        int n2 =Scanner.nextInt();
        System.out.println("Enter the choice :");
        System.out.println("1:addition,2:subtraction,3:multiplication,4:division");
        int n =Scanner.nextInt();
        int n3;
        
        switch (n) {
            case 1:
            n3=n1+n2;
            System.out.println("the sum of two number is:"+n3);
            break;
            case 2:
            n3=n1-n2;
            System.out.println("the subtraction of two number is:"+n3);
            break;
            case 3: 
            n3=n1*n2;
            System.out.println("the  multiplication of two number is:"+n3);
            break;
            case 4:
            if (n2>n1){
                System.out.println("first number  must be greater than second number");
            }
            else{
                n3=n1/n2;
            System.out.println("the division of two number is:"+n3);
            }
            break;
            default:
            System.out.println("invalid choice");
        }

    }

    
}