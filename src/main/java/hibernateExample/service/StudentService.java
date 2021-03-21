package hibernateExample.service;

import hibernateExample.dao.StudentDAO;
import hibernateExample.entity.Student;
import hibernateExample.util.SessionUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

public class StudentService extends SessionUtil implements StudentDAO {


    @Override
    public void add(Student student) throws SQLException {
        openTransactionSession();

        Session session = getSession();
        session.save(student);

        closeTransactionSession();
    }

    @Override
    public List<Student> getAll() throws SQLException {
        openTransactionSession();

        Session session = getSession();

        List<Student> studentList = session.createQuery("from Student").getResultList();

        closeTransactionSession();

        return studentList;
    }

    @Override
    public Student getById(int id) throws SQLException {

        openTransactionSession();

        Session session = getSession();

        Student student = session.get(Student.class, id);

        closeTransactionSession();

        return student;
    }

    @Override
    public void update(Student student) throws SQLException {
        openTransactionSession();

        Session session = getSession();

        session.update(student);

        closeTransactionSession();

    }

    @Override
    public void remove(Student student) throws SQLException {

        openTransactionSession();

        Session session = getSession();
        session.remove(student);


        closeTransactionSession();
    }
}
