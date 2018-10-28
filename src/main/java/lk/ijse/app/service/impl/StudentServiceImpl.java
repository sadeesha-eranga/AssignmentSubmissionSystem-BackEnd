package lk.ijse.app.service.impl;

import lk.ijse.app.dto.BatchDTO;
import lk.ijse.app.dto.StudentDTO;
import lk.ijse.app.entity.Batch;
import lk.ijse.app.entity.Student;
import lk.ijse.app.repository.StudentRepository;
import lk.ijse.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-25
 * Time: 1:25 PM
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public boolean addStudent(StudentDTO studentDTO) {
        studentRepository.save(new Student(studentDTO.getName(),
                studentDTO.getGender(),
                studentDTO.getDob(),
                studentDTO.getEmail(),
                studentDTO.getMobile(),
                new Batch(studentDTO.getBatchDTO().getBatchNo(),studentDTO.getBatchDTO().getName(),studentDTO.getBatchDTO().getBranch())));
        return true;
    }

    @Override
    public boolean updateStudent(StudentDTO studentDTO) {
        return false;
    }

    @Override
    public boolean deleteStudent(int studentId) {
        return false;
    }

    @Override
    public StudentDTO searchStudent(int studentId) {
        return null;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> allStudents = studentRepository.findAll();
        List<StudentDTO> dtoList = new ArrayList<>();
        allStudents.forEach(student -> {
            dtoList.add(new StudentDTO(student.getStudentId(),
                    student.getName(),
                    student.getGender(),
                    student.getDob(),
                    student.getEmail(),
                    student.getMobile(),
                    new BatchDTO(student.getBatch().getBatchNo(),student.getBatch().getName(),student.getBatch().getBranch())));
        });
        return dtoList;
    }
}
