package com.joymeter.service;

import com.joymeter.entity.Result;
import com.joymeter.entity.User;

/**
 * BaseService Layer
 *
 * @author Wu Wei
 * @date 2017-8-6 20:31:29
 */
public interface BaseService {

    public Result addUser(User user);

    public Result updateUser(User user);

    public Result changeMeterId(String meterId, String oldMeterId);

    public Result saveReadData(String factoryId, String meterAddr, Double readNumber, String readDate);

    public Result updateValveData(String meterAddr, String ifProcess, String processDate, String processResult, String processDesc);

}
