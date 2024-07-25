package BTVN_b8;

public class GraduadateStudent extends Student{
    String researchTopic;

    public GraduadateStudent(String studentld, String name, int age, String researchTopic) {
        super(studentld, name, age);
        this.researchTopic = researchTopic;
    }

    @Override
    public double caculateGPA() {
        return 3.2;
    }

    @Override
    public void studentInfor() {
        System.out.println(StudentID+" " +" " +name + " " + age);
    }
}
