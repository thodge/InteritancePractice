package myInterface;

public class SalariedEmployee implements Employee {

    private int hourlyPayRate;
    private int employeeSSN;
    private String hireDate;
    private String firstName;
    private String lastName;

    SalariedEmployee(String firstName, String lastName, int employeeSSN,
            String hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeSSN = employeeSSN;
        this.hireDate = hireDate;
    }

        @Override
        public abstract double getEmployeePay();
}
