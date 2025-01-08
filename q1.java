class Employee
{
    private int id;
    private String firstname;
    private String lastname;
    private int Salary;

    public Employee(int id, String firstname, String lastname, int Salary)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.Salary = Salary;
    }

    public int getID()
    {
        return id;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public String Name()
    {
        return firstname + " " + lastname;
    }

    public int getSalary()
    {
        return Salary;
    }

    public void setSalary(int Salary)
    {
        this.Salary = Salary;
    }

    public int getAnnualSalary()
    {
        return Salary * 12;
    }

    public float IncreaseSalary(int hike)
    {
        float a = (float)hike / 100;
        float increment_amount = this.Salary * a;
        float new_Salary = increment_amount + this.Salary;
        return new_Salary;
    }
}

public class q1 {
    public static void main(String[] args)
    {
        Employee e1 = new Employee(1, "rashid t", "tahasildar", 20000);
        System.out.println("id " + e1.getID());
        System.out.println("firstname " + e1.getFirstname());
        System.out.println("lastname " + e1.getLastname());
        System.out.println("salary " + e1.getSalary());
        System.out.println("Name " + e1.Name());
        System.out.println("Annual Salary is " + e1.getAnnualSalary());
        System.out.println("Increased Salary after hike is " + e1.IncreaseSalary(30));
        e1.setSalary(50000);
        System.out.println("The new Salary is " + e1.getSalary());

    }
}

