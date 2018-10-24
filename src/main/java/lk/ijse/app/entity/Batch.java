package lk.ijse.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 8:22 PM
 */
@Entity
public class Batch {

    @Id
    private int batchNo;
    private String name;
    private String branch;

    public Batch() {
    }

    public Batch(int batchNo, String name, String branch) {
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
        return "Batch{" +
                "batchNo=" + batchNo +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
