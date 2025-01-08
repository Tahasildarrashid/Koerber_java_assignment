package day2;

class CommissionEmployee extends Employee {
    protected int percentage;
    protected int weekly_sale;
    float total_salary;
    CommissionEmployee(String name, int percentage, int weekly_sale)
    {
        super(name);
        this.percentage = percentage;
        this.weekly_sale = weekly_sale;
    }

    public void calculateCommissionEmployeeSalary()
    {
        total_salary = (float) ((percentage * weekly_sale) / 100);
        System.out.println("Weekly salary of commission employee is " + total_salary);
    }

    public void increaseCommissionHourlySalary(int percent)
    {
        float amount = percent / 100.0f;
        float total_inc = amount * weekly_sale;
        float final_salary = total_salary + total_inc;
        System.out.println("Salary after " + percent + "% increment is " + final_salary);
    }
}
