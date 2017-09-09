package org.lanqiao.dao;

import org.lanqiao.bean.Student;

import java.util.List;

/**
 * Created by lenovo on 2017/9/4.
 */
public interface IClassesDao {
    /**
     * 获取所有班级信息和老师信息
     * @return
     */
    List<Class> getAllClassesInfo();

    /**
     * 根据班级ID查询学生信息
     * @param id
     * @return
     */
    List<Student> getClassesInfoById(int id);
}
