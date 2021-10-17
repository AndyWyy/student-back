package top.andywu.student.entity;

import java.io.Serializable;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2021-10-16 16:28:15
 */
public class Course implements Serializable {
    private static final long serialVersionUID = -95560331803326133L;
    
    private Integer id;
    
    private String cid;
    
    private String courseName;
    
    private Integer courseCredit;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

}

