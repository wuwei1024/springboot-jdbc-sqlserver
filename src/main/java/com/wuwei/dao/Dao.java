package com.wuwei.dao;

import com.wuwei.entity.User;

/**
 * Data Access Layer
 *
 * @author Wu Wei
 * @date 2017-8-5 21:03:48
 */
public interface Dao {

    public int addUser(User user);
    
    public int updateUser(User user);

    public int changeMeterId(String meterId, String oldMeterId);

    public int saveReadData(String factoryId, String meterAddr, Double readNumber, String readDate);

    public int updateValveData(String meterAddr, String ifProcess, String processDate, String processResult, String processDesc);

}
