package day3;

public class Employee implements Payable{
    private int id;
    private String name;
    private int salary;

    Employee(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getPayment()
    {
        return this.salary;
    }

}
