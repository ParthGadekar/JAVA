import java.io.*;
import java.util.*;
public class Race {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int speed[] = new int[6];
        for (int i=1;i<6;i++){
            System.out.println("\nEnter the speed of Racers: "+i);
            speed[i]=s.nextInt();
        }
        int sum = 0;
        for (int i=1;i<6;i++)
            sum+=speed[i];
        double avg = sum/5;
        System.out.println("\nThe speed for qualifying is:");
        for (int i=1;i<6;i++){
            if (speed[i]>=avg)
                System.out.println("\nRacer "+i+": "+speed[i]);
        }
    }
}
