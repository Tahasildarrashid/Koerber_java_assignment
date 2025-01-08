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
}
