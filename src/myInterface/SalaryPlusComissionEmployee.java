package myInterface;

public class SalaryPlusComissionEmployee extends SalariedEmployee {

    private int hourlyPayRate;
    private int employeeSSN;
    private String hireDate;
    private String firstName;
    private String lastName;

    private int commisionRate;
    private int salaryPlusCommisionRate;

    SalaryPlusComissionEmployee(String firstName, String lastName, int employeeSSN,
            String hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeSSN = employeeSSN;
        this.hireDate = hireDate;

    

    public int getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(int commisionRate) {
        this.commisionRate = commisionRate;
    }

    public int getSalaryPlusCommisionRate(int commissionRate, int salaryRate) {
        salaryPlusCommisionRate = commissionRate + salaryRate;
        return salaryPlusCommisionRate;
    }

    public void setSalaryPlusCommisionRate(int salaryPlusCommisionRate) {
        this.salaryPlusCommisionRate = salaryPlusCommisionRate;
    }

}
