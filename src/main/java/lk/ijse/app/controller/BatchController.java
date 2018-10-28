package lk.ijse.app.controller;

import lk.ijse.app.dto.BatchDTO;
import lk.ijse.app.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 8:32 PM
 */
@RestController
@CrossOrigin
@RequestMapping("api/v1/batches")
public class BatchController {

    @Autowired
    private BatchService batchService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveBatch(@RequestBody BatchDTO batchDTO) {
        return batchService.saveBatch(batchDTO);
    }

    @PutMapping(value = "/{batchNo}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateBatch(@PathVariable int batchNo, @RequestBody BatchDTO batchDTO) {
        return batchService.updateBatch(batchNo, batchDTO);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BatchDTO> getAllBatches() {
        return batchService.getAllBatches();
    }
}
