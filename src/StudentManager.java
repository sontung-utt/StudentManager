import java.util.ArrayList;

public class StudentManager {
    private Student[] listStudent;
    private int size;

    public StudentManager() {
        size = 0;
        this.listStudent = new Student[100];
    }

    public void add(Student student) {
        this.listStudent[size] = student;
        this.size++;
    }

    public Student[] getListStudent() {
        return this.listStudent;
    }

    public int getSize() {
        return this.size;
    }

    public Student searchStudentById(int id) {
        for (Student student : this.listStudent) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public int searchById(int id) {
        for (int i = 0; i < size; i++) {
            if (this.listStudent[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int id) {
        int index = searchById(id);
        for (int i = index; i < size; i++) {
            listStudent[i] = listStudent[i + 1];
        }
        size--;
    }

    public void edit(int id, Student newStudent) {
        int index = searchById(id);
        this.listStudent[index] = newStudent;
    }

    public double getAverageClass() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += listStudent[i].getAverageMark();
        }
        return sum / size;
    }

    public double getMaxAverage(){
        double max = listStudent[0].getAverageMark();
        //double max = Double.NEGATIVE_INFINITY; cách 2
        for (int i = 0; i < size; i++) {
            if(listStudent[i].getAverageMark() > max){
                max = listStudent[i].getAverageMark();
            }
        }
        return max;
    }

    public ArrayList<Student> getStudentByName(String name) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if(listStudent[i].getName().toLowerCase().contains(name.toLowerCase())){
                students.add(listStudent[i]);
            }
        }
        return students;
    }

}
