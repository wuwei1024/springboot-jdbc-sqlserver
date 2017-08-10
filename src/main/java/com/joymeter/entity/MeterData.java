package com.joymeter.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class MeterData implements Serializable {

    private static final long serialVersionUID = -7517802094134403071L;

    private Long Id;
    private Integer FactoryId;
    private String MeterAddr;
    private Double ReadNumber;
    private Timestamp ReadDate;

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

    public String getMeterAddr() {
        return MeterAddr;
    }

    public void setMeterAddr(String MeterAddr) {
        this.MeterAddr = MeterAddr;
    }

    public Double getReadNumber() {
        return ReadNumber;
    }

    public void setReadNumber(Double ReadNumber) {
        this.ReadNumber = ReadNumber;
    }

    public Timestamp getReadDate() {
        return ReadDate;
    }

    public void setReadDate(Timestamp ReadDate) {
        this.ReadDate = ReadDate;
    }

    @Override
    public String toString() {
        return "MeterData{" + "Id=" + Id + ", FactoryId=" + FactoryId + ", MeterAddr=" + MeterAddr + ", ReadNumber=" + ReadNumber + ", ReadDate=" + ReadDate + '}';
    }
}
