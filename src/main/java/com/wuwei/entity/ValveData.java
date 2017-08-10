package com.wuwei.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class ValveData implements Serializable {

    private static final long serialVersionUID = 435605317636770217L;

    private Long Id;
    private Integer FactoryId;
    private Integer MeterAddr;
    private Integer ValveFlag;
    private Timestamp InsertDate;
    private Short IfProcess;
    private Timestamp ProcessDate;
    private Short ProcessResult;
    private String ProcessDesc;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Integer getFactoryId() {
        return FactoryId;
    }

    public void setFactoryId(Integer FactoryId) {
        this.FactoryId = FactoryId;
    }

    public Integer getMeterAddr() {
        return MeterAddr;
    }

    public void setMeterAddr(Integer MeterAddr) {
        this.MeterAddr = MeterAddr;
    }

    public Integer getValveFlag() {
        return ValveFlag;
    }

    public void setValveFlag(Integer ValveFlag) {
        this.ValveFlag = ValveFlag;
    }

    public Timestamp getInsertDate() {
        return InsertDate;
    }

    public void setInsertDate(Timestamp InsertDate) {
        this.InsertDate = InsertDate;
    }

    public Short getIfProcess() {
        return IfProcess;
    }

    public void setIfProcess(Short IfProcess) {
        this.IfProcess = IfProcess;
    }

    public Timestamp getProcessDate() {
        return ProcessDate;
    }

    public void setProcessDate(Timestamp ProcessDate) {
        this.ProcessDate = ProcessDate;
    }

    public Short getProcessResult() {
        return ProcessResult;
    }

    public void setProcessResult(Short ProcessResult) {
        this.ProcessResult = ProcessResult;
    }

    public String getProcessDesc() {
        return ProcessDesc;
    }

    public void setProcessDesc(String ProcessDesc) {
        this.ProcessDesc = ProcessDesc;
    }

    @Override
    public String toString() {
        return "ValveData{" + "Id=" + Id + ", FactoryId=" + FactoryId + ", MeterAddr=" + MeterAddr + ", ValveFlag=" + ValveFlag + ", InsertDate=" + InsertDate + ", IfProcess=" + IfProcess + ", ProcessDate=" + ProcessDate + ", ProcessResult=" + ProcessResult + ", ProcessDesc=" + ProcessDesc + '}';
    }
}
