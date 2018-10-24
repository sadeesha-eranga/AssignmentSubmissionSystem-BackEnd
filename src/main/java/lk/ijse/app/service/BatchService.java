package lk.ijse.app.service;

import lk.ijse.app.dto.BatchDTO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 8:25 PM
 */
public interface BatchService {

    boolean saveBatch(BatchDTO batchDTO);

    boolean updateBatch(int batchNo, BatchDTO batchDTO);

    BatchDTO searchBatch(int batchNo);

    List<BatchDTO> getAllBatches();

}
