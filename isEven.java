package Methods;
import java.util.Scanner;

public class isEven {
    public static boolean iseven(int number){
        if (number %2 ==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main ( String args[]){
        Scanner sc = new Scanner ( System.in);
        System.out.println("enter a no");
        int no = sc .nextInt();

        if (iseven(no)){
            System.out.println("no is even");
        }else {
            System.out.println("no is odd");
        }
    }
}
