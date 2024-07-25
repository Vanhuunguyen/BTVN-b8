package BTVN_b8;

public class InternationalStudent extends  UndergranduateStudent{
    String country;

    public InternationalStudent(String studentld, String name, int age, String major, String country) {
        super(studentld, name, age, major);
        this.country = country;
    }

    @Override
    public double caculateGPA() {
        return 1.5;
    }

    @Override
    public void studentInfor() {
        System.out.println(StudentID+" " +" " +name + " " + age+ " "+Major+ " "+country);
    }
}
