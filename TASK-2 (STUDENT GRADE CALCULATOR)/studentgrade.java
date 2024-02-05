import java.util.*;
public class studentgrade{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.println("Enter number of subjects : ");
        int a=n.nextInt();
        int arr[]=new int[a+1];
        int total=0;
        for(int i=1;i<=a;i++){
            System.out.println("Enter mark of subject "+i+" : ");
            arr[i]=n.nextInt();
            total+=arr[i];
        }
        int average=total/a;
        System.out.println("Total : "+total);
        System.out.println("Average : "+average);
        if(average>85){
            System.out.println("Grade : A");
        }
        else if(average>75 && average<85){
            System.out.println("Grade : B");
        }
        else if(average>60 && average<75){
            System.out.println("Grade : C");
        }
        else if(average>45 && average<60){
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Grade : F");
        }
        n.close();
    }
}