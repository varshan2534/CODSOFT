import java.util.*;
import java.util.Random;
public class numbergame{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        Random rand=new Random();
        int randomnumber=rand.nextInt(100)+1;
        while(true){
            System.out.println("Enter your guess :");
            int userguess=n.nextInt();
            if(userguess>randomnumber){
                System.out.println("Too high, Try again!");
            }
            else if(userguess<randomnumber){
                System.out.println("Too low, Try again!");
            }
            else if(userguess==randomnumber){
                System.out.println("Correct!");
                break;
            }
        }
        n.close();
    }
}