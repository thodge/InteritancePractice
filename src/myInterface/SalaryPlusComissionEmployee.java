package myInterface;

public class SalaryPlusComissionEmployee extends SalariedEmployee {

    private double salary;
    private int employeeSSN;
    private String hireDate;
    private String firstName;
    private String lastName;

    private double commisionRate;
    private double salaryPlusCommisionRate;

    SalaryPlusComissionEmployee(String firstName, String lastName, int employeeSSN,
            String hireDate, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeSSN = employeeSSN;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public double getSalaryPlusCommisionRate(double commissionRate, double salary) {
        salaryPlusCommisionRate = commissionRate + salary;
        return salaryPlusCommisionRate;
    }

    public void setSalaryPlusCommisionRate(double salaryPlusCommisionRate) {
        this.salaryPlusCommisionRate = salaryPlusCommisionRate;
    }

}
