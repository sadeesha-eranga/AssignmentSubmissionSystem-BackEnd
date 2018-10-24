package lk.ijse.app.repository;

import lk.ijse.app.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 8:21 PM
 */
@Repository
public interface BatchRepository extends JpaRepository<Batch, Integer> {
}
