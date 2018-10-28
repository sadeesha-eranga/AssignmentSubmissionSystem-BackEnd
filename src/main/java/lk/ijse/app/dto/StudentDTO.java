package lk.ijse.app.dto;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-25
 * Time: 1:09 PM
 */
public class StudentDTO {

    private int studentId;
    private String name;
    private String gender;
    private Date dob;
    private String email;
    private String mobile;
    private BatchDTO batchDTO;

    public StudentDTO() {
    }

    public StudentDTO(int studentId, String name, String gender, Date dob, String email, String mobile, BatchDTO batchDTO) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.mobile = mobile;
        this.batchDTO = batchDTO;
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

    public BatchDTO getBatchDTO() {
        return batchDTO;
    }

    public void setBatchDTO(BatchDTO batchDTO) {
        this.batchDTO = batchDTO;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", batchDTO=" + batchDTO +
                '}';
    }
}
