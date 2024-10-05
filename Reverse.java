import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String p =Scanner.nextLine();  
        int len=p.length();
        String rev="";
        for(int i=0;i<len;i++){
            rev=p.charAt(i)+rev;
        }
        System.out.println("the rev string is "+rev);
    }
}
   