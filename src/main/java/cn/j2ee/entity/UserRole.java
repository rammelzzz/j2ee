package cn.j2ee.entity;

/**
 * Created by Rammus on 2017/10/17.
 */
public class UserRole {

    private int uid;
    private int rid;

    public UserRole(){}

    public UserRole(int uid, int rid) {
        this.uid = uid;
        this.rid = rid;
    }

    public int getUid() {
        return this.uid;
    }

    public int getRid() {
        return this.rid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
}
