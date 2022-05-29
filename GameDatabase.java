/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc_assignment_2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pycun
 */
public class GameDatabase {
    Connection conn = null;
    String url = "jdbc:derby:GameDB;create=true";
    String dbusername = "pdc";
    String dbpassword = "pdc";
    String rules = "rules goes here";
    
    public void dbsetup(){
        try{
            conn = DriverManager.getConnection(url, dbusername, dbpassword);
            Statement statement = conn.createStatement();
            String tableName = "GameProfile";
            
            if(!checkTableExisting(tableName)){
                statement.executeUpdate("CREATE TABLE " + tableName + " (username VARCHAR(12), password VARCHAR(12), rules VARCHAR(1000), hpMulti INT, dmgMulti INT, luckMulti INT)");
            }
            statement.close();
        } catch (Throwable e) {
            System.out.println("error");
        }
    }
    
    public GameData checkName(String username, String password){
        GameData data = new GameData();
        Player player = new Player();    

        try{
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM GameProfile " + "WHERE username = '" + username + "'");
            if(rs.next()){
                String pass = rs.getString("password");
                System.out.println("***" + pass);
                System.out.println("found user");
                if(password.compareTo(pass) == 0){
                    data.hpMulti = rs.getInt("hpMulti");
                    data.dmgMulti = rs.getInt("dmgMulti");
                    data.luckMulti = rs.getInt("luckMulti");
                    data.loginFlag = true;
                } else {
                    data.loginFlag = false;
                }
            } else {
                System.out.println("no such user");
                statement.executeUpdate("INSERT INTO GameProfile " + "VALUES('" + username + "', '" + password + "', 1, 1, 1)");
                data.loginFlag = true;
            }            
        } catch (SQLException ex){
            Logger.getLogger(GameDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    private boolean checkTableExisting(String newTableName){
        boolean flag = false;
        try {
            System.out.println("check existing tables.... ");
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rsDBMeta = dbmd.getTables(null, null, null, null);
            while (rsDBMeta.next()) {
                String tableName = rsDBMeta.getString("TABLE_NAME");
                if (tableName.compareToIgnoreCase(newTableName) == 0) {
                    System.out.println(tableName + "  is there");
                    flag = true;
                }
            }
            if (rsDBMeta != null) {
                rsDBMeta.close();
            }
        } catch (SQLException ex) {
        }
        return flag;
    }
    
    public void saveDB(int hpMulti, int dmgMulti, int luckMulti, String username){
        try{
            Statement statement = conn.createStatement();
            statement.executeUpdate("UPDATE GameProfile SET hpMulti = '"+hpMulti+"', dmgMulti = '" +dmgMulti+ "', luckMulti = '" +luckMulti+ "' WHERE username = '" + username + "'");
          
        } catch (SQLException ex){
            
        }
    }
}
