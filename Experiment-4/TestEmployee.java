public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice Smith", 85000.0, 2021, "AB123456C");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: $" + emp.getSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("National Insurance No: " + emp.getNationalInsuranceNumber());
    }
}

