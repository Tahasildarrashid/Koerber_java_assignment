package day3;

public class Application {
    public static void main(String[] args)
    {
        Employee e = new Employee(1, "rashid t", 12345);
        System.out.println(e.getPayment());
        e.toString();
        Invoice inv = new Invoice("Office chairs", "Workhub by Novel Office", 100, 1500);
        System.out.println(inv.getPayment());
        inv.toString();
    }


}
