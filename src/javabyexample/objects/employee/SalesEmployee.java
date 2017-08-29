package javabyexample.objects.employee;

public class SalesEmployee extends Employee {
    private double sales;
    private double commissionPercent;

    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(double commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public SalesEmployee( String employeeID ) {
        super( employeeID );
        super.setDepartment(Employee.DEPT_SALES);
    }

    public SalesEmployee( String employeeID, String firstName, String lastName,
                          String managerID, double baseSalary ) {
        super( employeeID, firstName, lastName, managerID, baseSalary );
        super.setDepartment(Employee.DEPT_SALES);
    }

    public void setDepartment( String department ) {
        return;
    }

    public double getSalary() {
        return this.getBaseSalary() + this.getBonus()+ this.sales*this.commissionPercent/100;
    }

}
