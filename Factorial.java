import java.util.Scanner;

class Factorial {
    
  public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =Scanner.nextInt();
        double Sum=1;
        for( int i=1;i<=n;i++)
        {
             Sum=i*Sum;
        }
        System.out.println(Sum); 
    }
}


