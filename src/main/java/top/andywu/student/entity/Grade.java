package top.andywu.student.entity;

import java.io.Serializable;

/**
 * (Grade)实体类
 *
 * @author makejava
 * @since 2021-10-17 19:00:55
 */
public class Grade implements Serializable {
    private static final long serialVersionUID = 328356053032656347L;
    
    private Integer id;
    
    private String studentId;
    
    private String cid;
    
    private Integer score;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}

