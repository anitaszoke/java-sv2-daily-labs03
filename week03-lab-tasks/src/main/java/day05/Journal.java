package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> name = new ArrayList<>();

    public List<String> getName() {
        return name;
    }
    public boolean addStudent(String studentName) {
        if (studentName.contains(" ")) {
            name.add(studentName);
            return true;
        } else {
            return false;
        }
    }
}
