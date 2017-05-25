package model;

/**
 * Created by jakubinyi on 2017.05.17..
 */
public class University {

    private Integer id;
    private String name;
    private String city;

    public University(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }


}
