package cn.j2ee.entity;

import java.util.Date;

/**
 * Created by rammel on 2017/12/3.
 */
public class Picture {

    private int id;
    private String classify;
    private String name;
    private String tag;
    private Date time;
    private int status;
    /**
     * 通过级联注入
     */
    private PicLocation picLocation;

    public PicLocation getPicLocation() {
        return picLocation;
    }

    public void setPicLocation(PicLocation picLocation) {
        this.picLocation = picLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
