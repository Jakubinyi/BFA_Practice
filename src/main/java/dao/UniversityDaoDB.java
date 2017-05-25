package dao;

import model.University;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubinyi on 2017.05.17..
 */
public class UniversityDaoDB implements UniversityDao {

    Connection conn = ConnectionUtil.getConnection(ConnectionUtil.DatabaseName.BFA);

    @Override
    public List<University> getAllUniversity() {
        List<University> unis = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM University";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //Integer id = Integer.valueOf(resultSet.getString("id"));
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                University university = new University(id, name, city);
                unis.add(university);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return unis;
    }

    @Override
    public University getUniversity(Integer id) {

        return null;
    }

    @Override
    public void set(List<University> unis) {

    }

    @Override
    public void addUni(String name) {
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO University(name, city) VALUES ('" + name + "', 'somewhere')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
