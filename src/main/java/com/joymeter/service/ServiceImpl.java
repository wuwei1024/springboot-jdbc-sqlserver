package com.joymeter.service;

import com.joymeter.dao.Dao;
import com.joymeter.entity.Result;
import com.joymeter.entity.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Wu Wei
 * @date 2017-8-8 18:06:30
 */
@Service
public class ServiceImpl implements BaseService {

    @Resource(name = "JdbcDao")
    private Dao dao;
    private static final Logger logger = Logger.getLogger(ServiceImpl.class.getName());

    @Override
    public Result addUser(User user) {
        Result result = new Result();
        try {
            int res = dao.addUser(user);
            result.setStatus(res);
        } catch (Exception e) {
            logger.log(Level.SEVERE, null, e);
        }
        return result;
    }

    @Override
    public Result updateUser(User user) {
        Result result = new Result();
        try {
            int res = dao.updateUser(user);
            result.setStatus(res);
        } catch (Exception e) {
            logger.log(Level.SEVERE, null, e);
        }
        return result;
    }

    @Override
    public Result changeMeterId(String meterId, String oldMeterId) {
        Result result = new Result();
        try {
            int res = dao.changeMeterId(meterId, oldMeterId);
            result.setStatus(res);
        } catch (Exception e) {
            logger.log(Level.SEVERE, null, e);
        }
        return result;
    }

    @Override
    public Result saveReadData(String factoryId, String meterAddr, Double readNumber, String readDate) {
        Result result = new Result();
        try {
            int res = dao.saveReadData(factoryId, meterAddr, readNumber, readDate);
            result.setStatus(res);
        } catch (Exception e) {
            logger.log(Level.SEVERE, null, e);
        }
        return result;
    }

    @Override
    public Result updateValveData(String meterAddr, String ifProcess, String processDate, String processResult, String processDesc) {
        Result result = new Result();
        try {
            int res = dao.updateValveData(meterAddr, ifProcess, processDate, processResult, processDesc);
            result.setStatus(res);
        } catch (Exception e) {
            logger.log(Level.SEVERE, null, e);
        }
        return result;
    }
}
