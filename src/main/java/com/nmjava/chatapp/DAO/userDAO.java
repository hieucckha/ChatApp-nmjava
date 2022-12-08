package com.nmjava.chatapp.DAO;

import com.nmjava.chatapp.models.User;
import com.nmjava.chatapp.connection.getConnection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class userDAO {
    public boolean insertUser(User user) throws SQLException {
        String sql = "insert into \"Users\" " + "(username,name,dob,address,gender,email,password,created_at,updated_at,user_id) values (?,?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement ps = getConnection.connection().prepareStatement(sql);

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getName());
            ps.setDate(3,  new java.sql.Date(user.getDob().getTime())) ;
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getGender());
            ps.setString(6, user.getEmail());
            ps.setString(7, user.getPassword());
            ps.setDate(8,java.sql.Date.valueOf(user.getCreate_at().toLocalDate()));
            ps.setDate(9,java.sql.Date.valueOf(user.getUpdate_at().toLocalDate()));
            ps.setString(10, user.getUser_id());


            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean deleteUser(String userId) {
        String sql = "delete from \"Users\" where user_id=?";
        try {

            PreparedStatement ps = getConnection.connection().prepareStatement(sql);
            ps.setString(1, userId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean updateUser(int id, User user) {
        String sql = "update \"Users\" set  username=?,name=?,address=?,dob=?,sex=?,email=?" +
                "where user_id=?";
        try {

            PreparedStatement ps = getConnection.connection().prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getName());
            ps.setString(3, user.getAddress());
            ps.setDate(4, (Date) user.getDob());
            ps.setString(5, user.getGender());
            ps.setString(6, user.getEmail());
            ps.setString(7, user.getUser_id());

            return ps.executeUpdate() > 0;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public User getUser(String username) {
        String sql = " select username,name,address,dob,sex,email from \"Users\" where username=?";

        try {

            PreparedStatement ps = getConnection.connection().prepareStatement(sql);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User User = new User();
                User.setUsername(rs.getString(1));
                User.setName(rs.getString(2));
                User.setAddress(rs.getString(3));
                User.setDob(rs.getDate(4));
                User.setEmail(rs.getString(5));
                User.setGender((rs.getString(6)));

                return User;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> getUsers() {
        String sql = " select username,name,address,dob,gender,email from \"Users\" ";
        List<User> list = new ArrayList<>();

        try {

            PreparedStatement ps = getConnection.connection().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                User User = new User();
                User.setUsername(rs.getString(1));
                User.setName(rs.getString(2));
                User.setAddress(rs.getString(3));
                User.setDob(rs.getDate(4));
                User.setGender((rs.getString(5)));
                User.setEmail(rs.getString(6));
                list.add(User);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public String MaxUserId()
    {
        String sql="select max(user_id) from \"Users\"";
        try {
            PreparedStatement ps = getConnection.connection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {

               String result=rs.getString(1).trim();
               int tmp =Integer.valueOf(result);
               tmp+=1;
               result= String.valueOf(tmp);
               return result ;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }




}
