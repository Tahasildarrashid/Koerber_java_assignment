package day2;

class HourlyEmployee extends Employee{
    int hourlyRate;
    int hoursWorkedPerWeek;
    float weekly_salary;
    public HourlyEmployee(String name, int Hours, int hourly_rate)
    {
        super(name);
        this.Hours = Hours;
        this.hourly_rate = hourly_rate;
    }

    public void calculateSalary()
    {
        weekly_salary = Hours * hourly_rate;
        System.out.println("Salary of Hourly Employee is " + weekly_salary);
    }

    public void increaseHourlySalary(int percent)
    {
        float amount = percent / 100.0f;
        float total_inc = amount * hourly_rate;
        float final_salary = hourly_rate + total_inc;
        System.out.println("Salary after " + percent + "% increment is " + final_salary);
    }
}
