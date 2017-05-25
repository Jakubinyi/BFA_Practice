package dao;

import model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubinyi on 2017.05.17..
 */
public interface StudentDao {

    List<Student> getStudentsByUID(Integer uid);
}
