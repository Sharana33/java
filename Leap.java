import java.util.Scanner;

class Leap {
    
  public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the year:");
        int n =Scanner.nextInt();
        if(((n%4==0)&&(n%100!=0)||(n%400==0))){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is a not leap year");
        }
        }
  } 

