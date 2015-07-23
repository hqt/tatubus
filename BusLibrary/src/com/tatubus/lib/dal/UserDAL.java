package com.tatubus.lib.dal;

import com.mysql.jdbc.Connection;
import com.tatus.lib.model.User;


public class UserDAL {
    
     public static User getUserById(int id) {
         Connection conn = DBUtils.getConnection();
         return null;
     }
     
     public static void main(String[] args) {
        UserDAL.getUserById(10);
    }

}
