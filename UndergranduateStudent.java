package BTVN_b8;

public class UndergranduateStudent extends Student{
    String Major;

    public UndergranduateStudent(String studentID, String name, int age, String major) {
        super(studentID, name, age);
        this.Major = major;
    }

    @Override
    public double caculateGPA() {
        return 2.0;
    }

    @Override
    public void studentInfor() {
        System.out.println(StudentID+" " +" " +name + " " + age+ " "+Major);
    }
}
