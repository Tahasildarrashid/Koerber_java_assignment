import java.util.*;

class q {
    public int fibonacci(int n)
    {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
public class q1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        q obj = new q();

        float sum = 0;
        for(int i=0; i<=n; i++)
        {
            System.out.print(obj.fibonacci(i) + " ");
            sum += obj.fibonacci(i);
        }
        System.out.println();
        System.out.println(sum / n);
    }
}

