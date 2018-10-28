package lk.ijse.app.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-25
 * Time: 1:14 PM
 */
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String name;
    private String gender;
    private Date dob;
    private String email;
    private String mobile;
    @ManyToOne
    private Batch batch;

    public Student() {
    }

    public Student(String name, String gender, Date dob, String email, String mobile, Batch batch) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.mobile = mobile;
        this.batch = batch;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", batch=" + batch +
                '}';
    }
}
