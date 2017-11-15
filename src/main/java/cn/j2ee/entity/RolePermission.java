package cn.j2ee.entity;

/**
 * Created by Rammus on 2017/10/17.
 */
public class RolePermission {

    private int rid;
    private int pid;

    public RolePermission(){}

    public RolePermission(int rid, int pid) {
        this.rid = rid;
        this.pid = pid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
