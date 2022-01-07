package A_5;

import java.util.ArrayList;

public class Department {
    private final Position position = new Position();

    public void printHistory() {
        for (String history : position.positionHistory) {
            System.out.println(history);
        }
    }

    public void addEmploye(String position, String name) {
        this.position.positionHistory.add(position + name);
    }

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
