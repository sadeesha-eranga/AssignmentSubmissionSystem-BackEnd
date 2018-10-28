package lk.ijse.app.service;

import lk.ijse.app.dto.StudentDTO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-25
 * Time: 1:24 PM
 */
public interface StudentService {

    boolean addStudent(StudentDTO studentDTO);

    boolean updateStudent(StudentDTO studentDTO);

    boolean deleteStudent(int studentId);

    StudentDTO searchStudent(int studentId);

    List<StudentDTO> getAllStudents();

}
