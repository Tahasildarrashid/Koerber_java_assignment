public class q5
{
    public static boolean isleapyear(int year)
    {
        if((year%400 == 0 || year%100 != 0 ) && (year%4 == 0))
            return true;
        else return false;
    }

    public static int noofdays(int month, int year)
    {
        int arr[] = {-1, 31, 28, 31, 30, 31, 30 , 31, 31, 30, 31, 30, 31};
        if(month == 2)
        {
            if(isleapyear(year))
            {
                arr[2] = 29;
            }
        }
        return arr[month];
    }
    public static void main(String[] args)
    {
        int d = 28;
        int m = 2;
        int y = 2025;
        System.out.println("Today's date is " + d + "/" + m + "/" + y);
        d = d + 1;
        if(d > noofdays(m, y)){
            d=1;
            m++;
            if(m>12)
            {
                m=1;
                y++;
            }
        }
        System.out.println("The next date is " + d + "/" + m + "/" + y);

    }
}