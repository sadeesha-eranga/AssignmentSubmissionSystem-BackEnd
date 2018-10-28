package lk.ijse.app.repository;

import lk.ijse.app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-25
 * Time: 1:14 PM
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
