import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n =Scanner.nextInt();
 
        switch (n) {
            case 1:
            System.out.println("Monay:ah 'i need coffe..");
            break;
            case 2:
            System.out.println("Tuesday:still not froday,but we are getting there...");
            break;
            case 3: 
            System.out.println("Wednesday:hump half of the week..");
            break;
            case 4:
            System.out.println("Thursday:Almost friday !hold the celebration....for now");
            break;
            case 5:
            System.out.println("Friday:party time!....");
            break;
            case 6:
            System.out.println("Saturday:universal day:do nothing day");
            break;
            case 7:
            System.out.println("sunday:panic day");
            break;
            default:
            System.out.println("error:you entered a day that does not present");
        }

    }

    
}
