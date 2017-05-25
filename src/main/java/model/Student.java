package model;

/**
 * Created by jakubinyi on 2017.05.17..
 */
public class Student {

    private Integer id;
    private String name;
    private String department;
    private Integer uid;

    public Student(Integer id, String name, String department, Integer uid) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.uid = uid;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getUid() {
        return uid;
    }
}
