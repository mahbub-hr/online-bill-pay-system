/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nayeem
 */
public class Users
{
    public int validateLogin(String userName, String password)
    {
        int id=-1;
        String sql = "SELECT * FROM LOGININFO WHERE EMAIL_ID = ? AND PASSWORD=?";
        
        try{
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, userName);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next())
            {
                id = rs.getInt(4);            
            }
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            
        }
        return id;
    }
    public List<List<String>> getAllUsers()
    {
        String sql = "SELECT * FROM USERS";
        List<List<String>> resultList = new ArrayList<>();
        try{
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            
            while (rs.next())
            {
                List<String> row = new ArrayList<>();
                row.add(rs.getString("USERNAME"));
                row.add(rs.getString("PASSWORD"));
                row.add(rs.getString("FULLNAME"));
                resultList.add(row);
            }
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            
        }
        return resultList;
    }
    
    public boolean InsertUser(String EmailID,String password){
    try
        {
            Connection con = new OracleDBMS().getConnection();
            String sql = "insert into LOGININFO (EMAIL_ID, PASSWORD,STATUS_ID) values(?,?,?)" ;
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,EmailID);
            pst.setString(2, password);
            pst.setInt(3,11 );
            pst.executeUpdate();
            pst.close();
            con.close();
        }catch (SQLException e)
        {
            System.out.println("Connection Failed! Check it from console");
            e.printStackTrace();
        }
    
     return true;
    }
    
    public List<List<String>> ShowUsage(int consumer)
    {
        String sql = "SELECT U.CONSUMER_ID,S.SERVICE_ID,S.SERVICE_NAME,U.START_READING,U.END_READING\n" +
                     "FROM USAGE U,SERVICE S\n" +
                     "WHERE U.CONSUMER_ID=? AND U.SERVICE_ID=S.SERVICE_ID;";
        List<List<String>> resultList = new ArrayList<>();
        try{
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, consumer);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
       
            while (rs.next())
            {
                List<String> row = new ArrayList<>();
                row.add(String.valueOf(rs.getInt("CONSUMER_ID")));
                row.add(String.valueOf(rs.getInt("SERVICE_ID")));
                row.add(rs.getString("SERVICE_NAME"));
                row.add(String.valueOf(rs.getInt("START_READING")));
                row.add(String.valueOf(rs.getInt("END_READING")));

                resultList.add(row);
            }
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            
        }
         return resultList;
    }
}
