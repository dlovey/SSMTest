package org.lanqiao.bean;

/**
 * Created by lenovo on 2017/8/30.
 */
public class User {
    private Integer stuId;
    private String stuName;

    public User(Integer stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "User{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                '}';
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
