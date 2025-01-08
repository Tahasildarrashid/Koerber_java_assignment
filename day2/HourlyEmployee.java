package day2;

class HourlyEmployee extends Employee{
    int hourlyRate;
    int hoursWorkedPerWeek;
    public HourlyEmployee(String name, int Hours, int hourly_rate)
    {
        super(name);
        this.Hours = Hours;
        this.hourly_rate = hourly_rate;
    }

    public void calculateSalary()
    {
        float weekly_salary = Hours * hourly_rate;
        System.out.println("Salary of Hourly Employee is " + weekly_salary);
    }
}
