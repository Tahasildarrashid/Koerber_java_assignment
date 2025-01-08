package day2;

class CommissionEmployee extends Employee {
    protected int percentage;
    protected int weekly_sale;

    CommissionEmployee(String name, int percentage, int weekly_sale)
    {
        super(name);
        this.percentage = percentage;
        this.weekly_sale = weekly_sale;
    }

    public void calculateCommissionEmployeeSalary()
    {
        float total_salary = (float) ((percentage * weekly_sale) / 100);
        System.out.println("Weekly salary of commission employee is " + total_salary);
    }
}
