
package myConcrete;


public class Employee {
    private static int employeeSSN;
    private static String hireDate;
    private static int employeeID;

    public static int getEmployeeSSN() {
        return employeeSSN;
    }

    public static void setEmployeeSSN(int employeeSSN) {
        Employee.employeeSSN = employeeSSN;
    }

    public static String getHireDate() {
        return hireDate;
    }

    public static void setHireDate(String hireDate) {
        Employee.hireDate = hireDate;
    }

    public static int getEmployeeID() {
        return employeeID;
    }

    public static void setEmployeeID(int employeeID) {
        Employee.employeeID = employeeID;
    }
    
    
}
