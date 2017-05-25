package dao;

import model.University;

import java.util.List;

/**
 * Created by jakubinyi on 2017.05.17..
 */
public interface UniversityDao {

    List<University> getAllUniversity();

    University getUniversity(Integer id);

    void set(List<University> unis);

    void addUni(String name);

}
