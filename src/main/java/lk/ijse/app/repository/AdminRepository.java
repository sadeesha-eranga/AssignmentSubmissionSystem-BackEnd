package lk.ijse.app.repository;

import lk.ijse.app.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 7:48 PM
 */
@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
}
