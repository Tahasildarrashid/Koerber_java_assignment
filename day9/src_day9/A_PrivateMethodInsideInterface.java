package day9.src_day9;

interface Java8DBLogging
{
    default void logInfo(String message)
    {
        GeneralLog(message, "logInfo");
    }

    default void logWarn(String message)
    {
        GeneralLog(message, "logWarn");
    }

    default void logError(String message)
    {
        GeneralLog(message, "logError");
    }

    private void GeneralLog(String message, String Error) {
        System.out.println(" Step1: Connect to DataBase");
        System.out.println(" Setp2: " + Error + " Message is: " + message);
        System.out.println(" Setp3: Close the DataBase connection");
    }
}

public class A_PrivateMethodInsideInterface {
    public static void main(String[] args) {
        Java8DBLogging j1 = new Java8DBLogging() {};
        j1.logWarn("This was a user raised warning");
    }
}
