package day01;

public class StudentsMain {
    public static void main(String[] args) {
        Students students = new Students();

        students.addHeight(130);
        students.addHeight(141);
        students.addHeight(145);
        System.out.println(students.isHeightIncreasing());

        students.addHeight(160);
        students.addHeight(155);
        students.addHeight(133);

        System.out.println(students.isHeightIncreasing());
    }
}
