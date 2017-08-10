package com.joymeter.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {

    private static final long serialVersionUID = -6589604840928990768L;

    private Long Id;
    private String UserName;
    private Integer MeterId;
    private Integer OldMeterID;
    private Integer FactoryId;
    private String MeterAddr;
    private String Linkman;
    private String Phone;
    private String PaperNo;
    private String Address;
    private String Caliber;
    private Timestamp InstallDate;
    private Short IfCtrlValve;
    private Short Imported;
    private String UserCode;
    private String Remark;
    private String ExtendData1;
    private String ExtendData2;
    private String ExtendData3;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public Integer getMeterId() {
        return MeterId;
    }

    public void setMeterId(Integer MeterId) {
        this.MeterId = MeterId;
    }

    public Integer getOldMeterID() {
        return OldMeterID;
    }

    public void setOldMeterID(Integer OldMeterID) {
        this.OldMeterID = OldMeterID;
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

    public String getLinkman() {
        return Linkman;
    }

    public void setLinkman(String Linkman) {
        this.Linkman = Linkman;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPaperNo() {
        return PaperNo;
    }

    public void setPaperNo(String PaperNo) {
        this.PaperNo = PaperNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCaliber() {
        return Caliber;
    }

    public void setCaliber(String Caliber) {
        this.Caliber = Caliber;
    }

    public Timestamp getInstallDate() {
        return InstallDate;
    }

    public void setInstallDate(Timestamp InstallDate) {
        this.InstallDate = InstallDate;
    }

    public Short getIfCtrlValve() {
        return IfCtrlValve;
    }

    public void setIfCtrlValve(Short IfCtrlValve) {
        this.IfCtrlValve = IfCtrlValve;
    }

    public Short getImported() {
        return Imported;
    }

    public void setImported(Short Imported) {
        this.Imported = Imported;
    }

    public String getUserCode() {
        return UserCode;
    }

    public void setUserCode(String UserCode) {
        this.UserCode = UserCode;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public String getExtendData1() {
        return ExtendData1;
    }

    public void setExtendData1(String ExtendData1) {
        this.ExtendData1 = ExtendData1;
    }

    public String getExtendData2() {
        return ExtendData2;
    }

    public void setExtendData2(String ExtendData2) {
        this.ExtendData2 = ExtendData2;
    }

    public String getExtendData3() {
        return ExtendData3;
    }

    public void setExtendData3(String ExtendData3) {
        this.ExtendData3 = ExtendData3;
    }

    @Override
    public String toString() {
        return "User{" + "Id=" + Id + ", UserName=" + UserName + ", MeterId=" + MeterId + ", OldMeterID=" + OldMeterID + ", FactoryId=" + FactoryId + ", MeterAddr=" + MeterAddr + ", Linkman=" + Linkman + ", Phone=" + Phone + ", PaperNo=" + PaperNo + ", Address=" + Address + ", Caliber=" + Caliber + ", InstallDate=" + InstallDate + ", IfCtrlValve=" + IfCtrlValve + ", Imported=" + Imported + ", UserCode=" + UserCode + ", Remark=" + Remark + ", ExtendData1=" + ExtendData1 + ", ExtendData2=" + ExtendData2 + ", ExtendData3=" + ExtendData3 + '}';
    }
}
