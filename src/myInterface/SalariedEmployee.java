package myInterface;

public class SalariedEmployee implements Employee {

    private int hourlyPayRate;
    private int employeeSSN;
    private String hireDate;
    private String firstName;
    private String lastName;

    @Override
    public abstract double getEmployeePay();
}
