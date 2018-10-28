package lk.ijse.app.service.impl;

import lk.ijse.app.dto.BatchDTO;
import lk.ijse.app.entity.Batch;
import lk.ijse.app.repository.BatchRepository;
import lk.ijse.app.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 8:29 PM
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BatchServiceImpl implements BatchService {

    @Autowired
    private BatchRepository batchRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public boolean saveBatch(BatchDTO batchDTO) {
        batchRepository.save(new Batch(batchDTO.getBatchNo(), batchDTO.getName(), batchDTO.getBranch()));
        return true;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public boolean updateBatch(int batchNo, BatchDTO batchDTO) {
        boolean exists = batchRepository.existsById(batchNo);

        if (!exists) {
            return false;
        }

        batchRepository.save(new Batch(batchDTO.getBatchNo(), batchDTO.getName(), batchDTO.getBranch()));
        return true;
    }

    @Override
    public BatchDTO searchBatch(int batchNo) {
        Batch batch = batchRepository.findById(batchNo).get();
        return new BatchDTO(batch.getBatchNo(),batch.getName(),batch.getBranch());
    }

    @Override
    public List<BatchDTO> getAllBatches() {
        List<Batch> batches = batchRepository.findAll();
        List<BatchDTO> dtoList = new ArrayList<>();
        batches.forEach(batch -> {
            dtoList.add(new BatchDTO(batch.getBatchNo(), batch.getName(), batch.getBranch()));
        });
        return dtoList;
    }
}
