package com.joymeter.controller;

import com.joymeter.entity.Result;
import com.joymeter.entity.User;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.joymeter.service.BaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 控制器Controller
 *
 * @author Wu Wei
 * @date 2017-8-8 17:53:21
 */
@RestController
@RequestMapping("/api")
public class Controller {

    @Resource
    private BaseService service;

    /**
     * 新增水表客户
     *
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    public Result addUser(@RequestBody User user) {
        return service.addUser(user);
    }

    /**
     * 修改客户资料
     *
     * @param user
     * @return
     */
    @PostMapping("/updateUser")
    public Result updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    /**
     * 换表
     *
     * @param meterId 新表ID
     * @param oldMeterId 旧表ID
     * @return
     */
    @PostMapping("/changeMeterId")
    public Result changeMeterId(@RequestParam("meterId") String meterId,
            @RequestParam("oldMeterId") String oldMeterId) {
        return service.changeMeterId(meterId, oldMeterId);
    }

    /**
     * 保存抄表读数
     *
     * @param factoryId 厂家ID
     * @param meterAddr 水表编码
     * @param readNumber 最新表数
     * @param readDate 抄表时间
     * @return
     */
    @PostMapping("/saveReadData")
    public Result saveReadData(@RequestParam("factoryId") String factoryId,
            @RequestParam("meterAddr") String meterAddr,
            @RequestParam("readNumber") Double readNumber,
            @RequestParam("readDate") String readDate) {
        return service.saveReadData(factoryId, meterAddr, readNumber, readDate);
    }

    /**
     * 开关阀数据的处理
     *
     * @param meterAddr 水表编码
     * @param ifProcess 是否处理
     * @param processDate 处理时间
     * @param processResult 处理结果
     * @param processDesc 处理结果描述
     * @return
     */
    @PostMapping("/updateValveData")
    public Result updateValveData(@RequestParam("meterAddr") String meterAddr,
            @RequestParam("ifProcess") String ifProcess,
            @RequestParam("processDate") String processDate,
            @RequestParam("processResult") String processResult,
            @RequestParam("processDesc") String processDesc) {
        return service.updateValveData(meterAddr, ifProcess, processDate, processResult, processDesc);
    }
}
