public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        double[] marks = {6.6,8.1,9.2};
        double[] marks2 = {9.8,8.9,10};
        Student student1 = new Student("Tùng",21,"Nam", marks);
        studentManager.add(student1);
        Student student2 = new Student("Hùng",22,"Nam", marks);
        studentManager.add(student2);
        Student student3 = new Student("Hải",20,"Nam", marks);
        studentManager.add(student3);
        Student student4 = new Student("Đức",18,"Nam", marks);
        //studentManager.add(student4);
        Student student5 = new Student("Long",19,"Nam", marks2);
        //studentManager.add(student5);
        System.out.println("Danh sách sinh viên");
        for (int i=0; i<studentManager.getSize(); i++){
            System.out.println(studentManager.getListStudent()[i]);
        }
//        System.out.println("Sinh viên cần tìm");
//        System.out.println(studentManager.searchStudentById(1));

//        studentManager.remove(2);
//        System.out.println("Danh sách sinh viên sau xóa");
//        for (int i=0; i<studentManager.getSize(); i++){
//            System.out.println(studentManager.getListStudent()[i]);
//        }

        System.out.println("Danh sách sinh viên sau sửa");
        studentManager.edit(3, student4);
        studentManager.edit(1, student5);
        for (int i=0; i<studentManager.getSize(); i++){
            System.out.println(studentManager.getListStudent()[i]);
        }

        System.out.println("Điểm trung bình của lớp là: " + (double) Math.round(studentManager.getAverageClass() * 1000) / 1000);//3 số sau dấu phẩy
        System.out.println("Điểm trung bình cao nhất: " + (double) Math.round(studentManager.getMaxAverage() * 100) / 100);//2 số sau dấu phẩy

        System.out.println("Danh sách sinh viên có chữ n");
        for(Student student: studentManager.getStudentByName("n")){
            System.out.println(student);
        }

    }
}