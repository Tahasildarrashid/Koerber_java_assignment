import java.util.Scanner;
public class q2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            int grades;
            while(true)
            {
                System.out.println("Enter the grades of " + 3(i+1) + " student");
                grades = scanner.nextInt();
                if(grades >= 0 && grades <= 100)
                {
                    break;
                }
                else {
                    System.out.println("Invalid grade! Please try again");
                }
            }
            arr[i] = grades;
        }

        float total = 0;
        for(int it: arr)
        {
            total += it;
        }
        System.out.println("The average grade is c" + total/n);
    }
}
