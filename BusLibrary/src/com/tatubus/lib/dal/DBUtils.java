package com.tatubus.lib.dal;

import com.mysql.jdbc.Connection;
import com.tatubus.lib.config.Config;
import static com.tatubus.lib.config.Config.DB_URL;
import static com.tatubus.lib.config.Config.PASS;
import static com.tatubus.lib.config.Config.USER;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtils {

    public static Connection getConnection() {
        Connection conn;
        try {
            Class.forName(Config.JDBC_DRIVER);
            conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        } 
 
        return null;
    }
}
