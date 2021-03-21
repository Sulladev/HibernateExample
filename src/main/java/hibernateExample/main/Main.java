package hibernateExample.main;

import hibernateExample.entity.Student;
import hibernateExample.service.StudentService;
import hibernateExample.util.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        StudentService studentService = new StudentService();

//        for (int i = 0; i < 1000; i++) {
//            Student student = new Student();
//            student.setName("John " + i);
//            student.setMark(i);
//            studentService.add(student);
//        }

        Student student1 = studentService.getById(10);
        System.out.println(student1);

        List<Student> students = studentService.getAll();
        System.out.println(students.size());

        studentService.remove(students.get(0));
        System.out.println(students.size());

        HibernateUtil.shutdown();
    }
}
