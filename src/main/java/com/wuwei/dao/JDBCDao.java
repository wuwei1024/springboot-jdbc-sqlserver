package com.wuwei.dao;

import com.wuwei.entity.User;
import com.wuwei.util.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Wu Wei
 * @date 2017-8-9 17:07:18
 */
@Repository("JdbcDao")
public class JDBCDao implements Dao {

    private static final Logger logger = Logger.getLogger(JDBCDao.class.getName());
    private static final Connection conn = JDBCUtils.getConnection();

    @Override
    public int addUser(User user) {
        int res = 0;
        String sql = "INSERT INTO tRemote_customer(UserName,MeterId,OldMeterID,FactoryId,"
                + "MeterAddr,Linkman,Phone,PaperNo,Address,Caliber,InstallDate,IfCtrlValve,"
                + "Imported,UserCode,Remark,ExtendData1,ExtendData2,ExtendData3)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, user.getUserName());
            pre.setInt(2, user.getMeterId());
            pre.setInt(3, user.getOldMeterID());
            pre.setInt(4, user.getFactoryId());
            pre.setString(5, user.getMeterAddr());
            pre.setString(6, user.getLinkman());
            pre.setString(7, user.getPhone());
            pre.setString(8, user.getPaperNo());
            pre.setString(9, user.getAddress());
            pre.setString(10, user.getCaliber());
            pre.setTimestamp(11, user.getInstallDate());
            pre.setShort(12, user.getIfCtrlValve());
            pre.setShort(13, user.getImported());
            pre.setString(14, user.getUserCode());
            pre.setString(15, user.getRemark());
            pre.setString(16, user.getExtendData1());
            pre.setString(17, user.getExtendData2());
            pre.setString(18, user.getExtendData3());
            res = pre.executeUpdate();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public int updateUser(User user) {
        int res = 0;
        String sql = "UPDATE tRemote_customer SET UserName = ?,MeterId = ?,OldMeterID = ?,FactoryId = ?,"
                + "MeterAddr = ?,Linkman = ?,Phone = ?,PaperNo = ?,Address = ?,Caliber = ?,InstallDate = ?,IfCtrlValve = ?,"
                + "Imported = ?,UserCode = ?,Remark = ?,ExtendData1 = ?,ExtendData2 = ?,ExtendData3 = ? WHERE Id = ?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, user.getUserName());
            pre.setInt(2, user.getMeterId());
            pre.setInt(3, user.getOldMeterID());
            pre.setInt(4, user.getFactoryId());
            pre.setString(5, user.getMeterAddr());
            pre.setString(6, user.getLinkman());
            pre.setString(7, user.getPhone());
            pre.setString(8, user.getPaperNo());
            pre.setString(9, user.getAddress());
            pre.setString(10, user.getCaliber());
            pre.setTimestamp(11, user.getInstallDate());
            pre.setShort(12, user.getIfCtrlValve());
            pre.setShort(13, (short)0);//资料修改之后，Imported值改为0
            pre.setString(14, user.getUserCode());
            pre.setString(15, user.getRemark());
            pre.setString(16, user.getExtendData1());
            pre.setString(17, user.getExtendData2());
            pre.setString(18, user.getExtendData3());
            pre.setLong(19, user.getId());
            res = pre.executeUpdate();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public int changeMeterId(String meterId, String oldMeterId) {
        int res = 0;
        String sql = "UPDATE tRemote_customer SET MeterId = ?,OldMeterID = ? WHERE MeterId = ?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, meterId);
            pre.setString(2, oldMeterId);
            pre.setString(3, oldMeterId);
            res = pre.executeUpdate();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public int saveReadData(String factoryId, String meterAddr, Double readNumber, String readDate) {
        int res = 0;
        String sql = "INSERT INTO tRemote_Data(FactoryId,MeterAddr,ReadNumber,ReadDate)VALUES(?,?,?,?)";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, factoryId);
            pre.setString(2, meterAddr);
            pre.setDouble(3, readNumber);
            pre.setString(4, readDate);
            res = pre.executeUpdate();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public int updateValveData(String meterAddr, String ifProcess, String processDate, String processResult, String processDesc) {
        int res = 0;
        String sql = "UPDATE tRemote_Valve SET IfProcess = ?,ProcessDate = ?,ProcessResult = ?,ProcessDesc = ? WHERE MeterAddr = ?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, ifProcess);
            pre.setString(2, processDate);
            pre.setString(3, processResult);
            pre.setString(4, processDesc);
            pre.setString(5, meterAddr);
            res = pre.executeUpdate();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        return res;
    }

}
