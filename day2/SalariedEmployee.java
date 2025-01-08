package day2;

class SalariedEmployee extends Employee {
    private int weeklySalary;
    SalariedEmployee(String name, int weeklySalary)
    {
        super(name);
        this.weeklySalary = weeklySalary;
    }

    public void getWeeklySalaryofSalariedEMployee()
    {
        System.out.println("Salaried Employee Salary is: " + weeklySalary);
    }

    public void increaseSalary(int percent)
    {
        float amount = percent / 100.0f;
        float total_inc = amount * weeklySalary;
        float final_salary = weeklySalary + total_inc;
        System.out.println("Salary after " + percent + "% increment is " + final_salary);
    }
}
