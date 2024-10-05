import java.util.Scanner;
class Opendoor {
    public static void main(String[] args){
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int doorCode  =Scanner.nextInt();

        if(doorCode==1234){
            System.out.println("the code is correct.te door will open");
        }
        else{
            System.out.println("the code is incorrect.te door remains closed");
        }
        Scanner.close();
          
    }
}
