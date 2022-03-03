package A_5;

import java.util.ArrayList;

public class Department {
    private final ArrayList<Employee> employees = new ArrayList<>();

    public void printEmployeeHistory(String name) {
        System.out.printf("Работник %s, занимал следующие должности:\n", name);
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                System.out.println(employee.getPositions());
            }
        }
    }

    public void printPositionHistory(String position) {
        System.out.printf("Дожность %s, занимали следующие работники:\n", position);
        for (Employee employee : employees) {
            if (employee.positions.contains(position)) {
                System.out.println(employee.getName());
            }
        }
    }

    public void addEmploye(Employee employee) {
        employees.add(employee);
    }

    public static class Employee {
        private final String name;
        private final ArrayList<String> positions = new ArrayList<>();

        public Employee(String position, String name) {
            this.name = name;
            positions.add(position);
        }

        public String getName() {
            return name;
        }

        public ArrayList<String> getPositions() {
            return positions;
        }
    }
}
