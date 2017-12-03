package cn.j2ee.entity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rammus on 2017/10/16.
 */
public class User {
    /**
     * User的属性
     */
    //账户
    private String username;
    //密码
    private String password;
    //手机号
    private String mobile;
    //邮箱
    private String email;
    //城市
    private String city;
    //照片路径
    private String photoUrl;
    //简要介绍
    private String description;
    //创建时间
    private Date createTime;
    //状态 true为正常 false为锁定
    private Boolean status;
    public static final int _0 = 0;
    public static final int _1 = 1;
    public static final int _2 = 2;
    public User(){}

    /**
     * 构造方法
     * @param username
     * @param password
     * @param mobile
     * @param email
     * @param city
     * @param photoUrl
     * @param description
     * @param createTime
     * @param status
     */
    public User(String username, String password, String mobile, String email, String city, String photoUrl, String description, Date createTime, Boolean status) {
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.email = email;
        this.city = city;
        this.photoUrl = photoUrl;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAccountNonExpired() {
        return false;
    }

    public boolean isAccountNonLocked() {
        return this.status;
    }

    public boolean isCredentialsNonExpired() {
        return false;
    }

    public boolean isEnabled() {
        return false;
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
