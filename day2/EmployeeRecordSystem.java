package day2;

public class EmployeeRecordSystem {
    public static void main(String[] args)
    {
        SalariedEmployee s = new SalariedEmployee("rashid t tahasildar", 123456);
        s.getWeeklySalaryofSalariedEMployee();

        HourlyEmployee h = new HourlyEmployee("ramesh", 40, 1500);
        h.calculateSalary();

        CommissionEmployee c = new CommissionEmployee("suresh", 30, 50);
        c.calculateCommissionEmployeeSalary();
    }

}
