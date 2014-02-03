package myInterface;

public class HourlyEmployee implements Employee {

    private double employeePay;
    private double employeeSSN;
    private String hireDate;
    private String firstName;
    private String lastName;
    private double employeeID;

    HourlyEmployee(String firstName, String lastName, int employeeSSN,
            String hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeSSN = employeeSSN;
        this.hireDate = hireDate;
    
    }

    @Override
    public double getEmployeePay() {
        return employeePay;
    }

    public void setEmployeePay(double employeePay) {
        this.employeePay = employeePay;
    }



    @Override
    public double getEmployeeSSN() {
        return employeeSSN;
    }

    public void setEmployeeSSN(int employeeSSN) {
        this.employeeSSN = employeeSSN;
    }

    @Override
    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public double getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(double employeeID) {
        this.employeeID = employeeID;
    }



}
