import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double[] marks;

    private static int idIncrement = 1;

    public Student(String name, int age, String gender, double[] marks) {
        this.id = idIncrement;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.marks = marks;
        idIncrement ++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    public double getAverageMark(){
        double sum = 0;
        for(double mark: marks){
            sum += mark;
        }
        return sum / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    /*public static void main(String[] args) {
        double[] marks = {3,5,7};
        Student student = new Student ("Tùng",21,"Nam", marks);
        Student student1 = new Student ("Tùng",21,"Nam", marks);
        Student student2 = new Student ("Tùng",21,"Nam", marks);
        System.out.println(student2.getId());
    }*/
}


