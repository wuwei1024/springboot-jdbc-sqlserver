package com.wuwei.test;

import com.wuwei.entity.User;
import com.wuwei.util.JDBCUtils;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 数据库连接测试
 *
 * @author Wu Wei
 * @date 2017-8-9 11:07:46
 */
public class DatabaseConnectionTest {

    public static void main(String[] args) {
        queryTest();
    }

    public static void queryTest() {
        try {
            Connection conn = JDBCUtils.getConnection();
            String sql = "select * from tRemote_customer where Id = ?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setInt(1, 2);
            ResultSet rs = pre.executeQuery();
            //结果集转换成实体对象
            List<?> list = JDBCUtils.TranverseToList(rs, User.class);
            //循环遍历结果
            for (int i = 0; i < list.size(); i++) {
                User user = (User) list.get(i);
                System.out.println(user);
            }
        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DatabaseConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            JDBCUtils.close();
        }
    }
}
