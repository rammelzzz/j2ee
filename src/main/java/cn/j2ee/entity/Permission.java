package cn.j2ee.entity;

/**
 * Created by Rammus on 2017/10/17.
 */
public class Permission {
    private int id;
    private String name;
    private String url;

    //空的构造方法
    public Permission(){}

    /**
     * 构造方法
     * @param id
     * @param name
     * @param description
     */
    public Permission(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return name;
    }

    public void setToken(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
