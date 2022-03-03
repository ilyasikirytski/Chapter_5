/*
Создать класс Department с внутренним классом, с помощью объектов
которого можно хранить информацию обо всех должностях отдела и обо
всех сотрудниках, когда-либо занимавших конкретную должность.
 */
package A_5;

public class Main {
    public static void main(String[] args) {
        Department department = new Department();

        department.addEmploye(new Department.Employee("director 1", "jack"));
        department.addEmploye(new Department.Employee("director 2", "jack"));
        department.addEmploye(new Department.Employee("director 3", "jack"));
        department.addEmploye(new Department.Employee("driver", "john1"));
        department.addEmploye(new Department.Employee("driver", "john2"));
        department.addEmploye(new Department.Employee("driver", "john3"));
        department.addEmploye(new Department.Employee("dealer ", "jimm"));
        department.printEmployeeHistory("jack");
        department.printPositionHistory("driver");

    }
}
