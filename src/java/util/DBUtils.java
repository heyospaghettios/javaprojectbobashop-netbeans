/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Product;

/**
 *
 * @author Paul
 */
public class DBUtils {
    public static List<Product> queryProduct(Connection conn) throws SQLException {
        
        String sql = "Select"
    }
}
