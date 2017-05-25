package dao;

import model.Student;
import model.University;
import util.ConnectionUtil;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubinyi on 2017.05.17..
 */
public class StudentDaoDB implements StudentDao {

    Connection conn = ConnectionUtil.getConnection(ConnectionUtil.DatabaseName.BFA);

    @Override
    public List<Student> getStudentsByUID(Integer uid) {
        List<Student> students = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM Student WHERE uid=" + uid;
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                Integer uID = resultSet.getInt("uid");
                Student student = new Student(id,name,department,uID);
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
}
