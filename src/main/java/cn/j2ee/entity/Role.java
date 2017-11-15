package cn.j2ee.entity;

/**
 * Created by Rammus on 2017/10/17.
 */
public class Role {
    private int id;
    private String name;
    private String decription;

    //空的构造方法
    public Role(){}

    /**
     * 构造方法
     * @param id
     * @param name
     * @param decription
     */
    public Role(int id, String name, String decription) {
        this.id = id;
        this.name = name;
        this.decription = decription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
