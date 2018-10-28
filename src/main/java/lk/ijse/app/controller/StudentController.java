package lk.ijse.app.controller;

import lk.ijse.app.dto.StudentDTO;
import lk.ijse.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-25
 * Time: 1:31 PM
 */
@RestController
@CrossOrigin
@RequestMapping("api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.addStudent(studentDTO);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping(value = "/{studentId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteStudent(@PathVariable int studentId) {
        return studentService.deleteStudent(studentId);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.updateStudent(studentDTO);
    }

    @GetMapping(value = "/studentId", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentDTO searchStudent(@PathVariable int studentId) {
        return studentService.searchStudent(studentId);
    }
}
