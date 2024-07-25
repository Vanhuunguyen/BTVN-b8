package BTVN_b8;

import java.util.ArrayList;

public class University {
    private static ArrayList<Student> Student;
         public University() {
            Student = new ArrayList<>();
        }
    public static void addStudent(Student s){
        Student.add(s);
    }
    public static void displayAllStudent(){
        for (Student s : Student) {
           s.studentInfor();
        }
    }

    public static void main(String[] args) {
        University uni = new University();
        Student st1 = new UndergranduateStudent("a001","Tuan",15,"kinh te");
        Student st2 = new GraduadateStudent("b002","Van",20,"abcd");
        Student st3 = new InternationalStudent("c003","Ha",30,"vanhoa","trung quoc");
        University.addStudent(st1);
        University.addStudent(st2);
        University.addStudent(st3);

        University.displayAllStudent();
    }
}
