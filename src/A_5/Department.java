package A_5;

import java.util.ArrayList;

// TODO если это класс отдела, то почему в нем может быть только одна должность? возможно все-таки должен
//  быть список должностей?
public class Department {
    private final Position position = new Position();

    public void printHistory() {
        for (String history : position.positionHistory) {
            System.out.println(history);
        }
    }

    // TODO а как нипример при такой реализации узнать какую должность какой сотрудник занимает?
    //  и почему одно поле для имени и должности?
    public void addEmploye(String position, String name) {
        this.position.positionHistory.add(position + name);
    }

    // TODO должность хранит историю людей которые ее занимали? немного странно... история должна быть в отделе, или
    //  в каком-то журнале труддоустройства в отделе
    public static class Position {
        ArrayList<String> positionHistory = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Department{" +
                "position=" + position +
                '}';
    }
}
