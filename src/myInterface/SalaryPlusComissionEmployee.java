package myInterface;

public class SalaryPlusComissionEmployee extends SalariedEmployee {

    private double employeePay;
    private double employeeSSN;
    private String hireDate;
    private String firstName;
    private String lastName;
    private double employeeID;
    private double commisionRate;
    private double salaryPlusCommisionRate;

    public SalaryPlusComissionEmployee() {
        super();
        this.employeePay = employeePay;
        this.employeeSSN = employeeSSN;
        this.hireDate = hireDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.salaryPlusCommisionRate = salaryPlusCommisionRate;
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
