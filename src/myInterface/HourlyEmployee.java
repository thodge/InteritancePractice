package myInterface;

public class HourlyEmployee implements Employee {

    private int hourlyPayRate;
    private int employeeSSN;
    private String hireDate;
    private String firstName;
    private String lastName;

    HourlyEmployee(String firstName, String lastName, int employeeSSN,
            String hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeSSN = employeeSSN;
        this.hireDate = hireDate;
    


    

    public int getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(int hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public void employeeSSN() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hireDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void firstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getEmployeePay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double employeeID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
