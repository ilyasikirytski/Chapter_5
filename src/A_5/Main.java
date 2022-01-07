/*
Создать класс Department с внутренним классом, с помощью объектов
которого можно хранить информацию обо всех должностях отдела и обо
всех сотрудниках, когда-либо занимавших конкретную должность.
 */
package A_5;

public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        department.addEmploye("director ", "jack");
        department.addEmploye("driver ", "john");
        department.addEmploye("dealer ", "jimm");
        department.printHistory();

    }
}
