package day7.q1.q2;

//Lazy Initialization
class Singleton{
    private static Singleton singleton;

    private Singleton(){};

    public static Singleton getInstance()
    {
        if(singleton == null)
            singleton =  new Singleton();

        return singleton;
    }
}

//Eager Initialization
//class Singleton{
//    private static Singleton singleton = new Singleton();
//
//    private Singleton(){};
//
//    public Singleton getInstance()
//    {
//        return singleton;
//    }
//}

public class SingletonClient {
    public static void main(String[] args) {
        Singleton inst1 = Singleton.getInstance();
        Singleton inst2 = Singleton.getInstance();
        System.out.println("Both instances are same right? " + inst1.equals(inst2));
    }
}
