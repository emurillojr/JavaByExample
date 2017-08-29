package javabyexample.objects.employee;

public class TestEmployee {

    public static void main( String[] args ) {
        Employee[] employees = createData();
        Employee emp;
        for( int count = 0; count < employees.length; count++ ) {
            emp = employees[ count ];
            System.out.println( emp.getDepartment() + " " + emp.getFirstName() + " "
                                + emp.getLastName() + "  Salary: " + emp.getSalary() );
        }

    }

    public static Employee[] createData() {
        Employee[] employees = new Employee[5];
        Employee employee;
        employee = new Employee("E001", "Edward", "Elgar", "E009", 30000);
        employee.setDepartment( Employee.DEPT_FINANCE );
        employee.setBonus( 5000 );
        employees[0] = employee;

        employee = new Employee("E002", "Kerri", "Fletcher", "E009", 35000);
        employee.setDepartment( Employee.DEPT_FINANCE );
        employee.setBonus( 5000 );
        employees[1] = employee;

        SalesEmployee salesemp = new SalesEmployee("E003", "Evard", "Hegge", "E009", 30000);
        salesemp.setBonus( 8000 );
        salesemp.setSales( 50000 );
        salesemp.setCommissionPercent( 3 );
        employees[2] = salesemp;

        salesemp = new SalesEmployee("E004", "Diana", "Manson", "E009", 32000);
        salesemp.setBonus( 8000 );
        salesemp.setSales( 75000 );
        salesemp.setCommissionPercent( 3.5 );
        employees[3] = salesemp;

        employee = new Employee("E006", "Michelle", "Robinson", "E009", 28000);
        employee.setDepartment( Employee.DEPT_PRODUCTION );
        employee.setBonus( 5000 );
        employees[4] = employee;
        return employees;

    }
}
