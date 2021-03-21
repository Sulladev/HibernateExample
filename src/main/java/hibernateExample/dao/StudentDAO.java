package hibernateExample.dao;

import hibernateExample.entity.Student;
import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {

    void add(Student student) throws SQLException;

    List<Student> getAll() throws SQLException;

    Student getById(int id) throws SQLException;

    void update(Student student) throws SQLException;

    void remove(Student student) throws SQLException;
}
