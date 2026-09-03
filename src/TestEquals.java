class Employee {
    int employeeNo;

    Employee(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;

        return this.employeeNo == other.employeeNo;
    }
}

public class TestEquals {
    public static void main(String[] args) {

        Employee e1 = new Employee(1001);
        Employee e2 = new Employee(1001);
        Employee e3 = new Employee(1002);

        System.out.println("e1 equals e2: " + e1.equals(e2));
        System.out.println("e1 equals e3: " + e1.equals(e3));
    }
}