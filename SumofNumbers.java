import java.util.Scanner;
public class SumofNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n,sum=0,i;
        System.out.println("Enter the value of n");
        // Here n is the no of digits you want find sum of
        n = s.nextInt();
        for(i=1 ; i<=n ; i++){
            sum = sum + i;
        }
        System.out.println("Sum of first "+n+" integers is "+sum);
    }

}
