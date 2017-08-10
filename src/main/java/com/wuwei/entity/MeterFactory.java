package com.wuwei.entity;

import java.io.Serializable;

public class MeterFactory implements Serializable {

    private static final long serialVersionUID = -2257407834537815437L;

    private Long Id;
    private Integer FactoryId;
    private String FactoryName;

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

    public String getFactoryName() {
        return FactoryName;
    }

    public void setFactoryName(String FactoryName) {
        this.FactoryName = FactoryName;
    }

    @Override
    public String toString() {
        return "MeterFactory{" + "Id=" + Id + ", FactoryId=" + FactoryId + ", FactoryName=" + FactoryName + '}';
    }
}
