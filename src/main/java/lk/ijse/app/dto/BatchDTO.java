package lk.ijse.app.dto;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 8:23 PM
 */
public class BatchDTO {

    private int batchNo;
    private String name;
    private String branch;

    public BatchDTO() {
    }

    public BatchDTO(int batchNo, String name, String branch) {
        this.batchNo = batchNo;
        this.name = name;
        this.branch = branch;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "BatchDTO{" +
                "batchNo=" + batchNo +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
