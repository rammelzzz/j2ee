package cn.j2ee.entity;

import java.util.Date;

/**
 * Created by rammel on 2017/12/3.
 */
public class Member {
    //账户
    private String username;
    //密码
    private String password;
    //手机号
    private String mobile;
    //简要介绍
    private String description;
    //创建时间
    private Date createTime;
    //状态 true为正常 false为锁定
    private int status;
    public Member(){}

    /**
     * 构造方法
     * @param username
     * @param password
     * @param mobile
     * @param description
     * @param createTime
     * @param status
     */
    public Member(String username, String password, String mobile, String description, Date createTime, int status) {
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.description = description;
        this.createTime = createTime;
        this.status = status;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
