import java.util.Scanner;

public class Matrix
{
    public static void main(String args[])
    {
        // initialize here.
        int row, col, i, j;
        int arr[][] = new int[10][10];
        Scanner s= new Scanner(System.in);

        System.out.print("Enter row for the array (max 10) : ");
        row = s.nextInt();
        System.out.print("Enter column for the array (max 10) : ");
        col = s.nextInt();

        System.out.println("Enter " +(row*col)+ " Array Elements : ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                arr[i][j] = s.nextInt();
            }
        }

        // the 2D array is here.
        System.out.print("The Array is :\n");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
