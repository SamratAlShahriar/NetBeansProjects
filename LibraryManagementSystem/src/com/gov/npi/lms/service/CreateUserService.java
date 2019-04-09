package com.gov.npi.lms.service;

import com.gov.npi.lms.connection.DbConnection;
import com.gov.npi.lms.dao.CreateUserDAO;
import com.gov.npi.lms.domain.CreateUser;
import com.gov.npi.lms.domain.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samrtat Al Shahriar Nayeem
 */
public class CreateUserService implements CreateUserDAO {

    Connection conn = DbConnection.getConnection();

    @Override
    public void createUser(CreateUser crtusrcu) {
        try {
            if (crtusrcu != null) {

                PreparedStatement stmt = conn.prepareStatement("INSERT INTO lmsdb_user(name, email, username, mobile, password, user_type)" + "values(?,?,?,?,?,?)");
                stmt.setString(1, crtusrcu.getName());
                stmt.setString(2, crtusrcu.getEmail());
                stmt.setString(3, crtusrcu.getUsername());
                stmt.setString(4, crtusrcu.getMobile());
                stmt.setString(5, crtusrcu.getPassword());
                stmt.setString(6, crtusrcu.getUserType());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editUser(CreateUser crtusreu) {
        try {
            if (crtusreu.getId() != 0) {
                PreparedStatement stmt = conn.prepareStatement("update lmsdb_user SET name=?, email=?, username=?, mobile=?, password=?, user_type=? where id=?");

                stmt.setString(1, crtusreu.getName());
                stmt.setString(2, crtusreu.getEmail());
                stmt.setString(3, crtusreu.getUsername());
                stmt.setString(4, crtusreu.getMobile());
                stmt.setString(5, crtusreu.getPassword());
                stmt.setString(6, crtusreu.getUserType());
                stmt.setInt(7, crtusreu.getId());
                int i = stmt.executeUpdate();

                System.out.println(i + " record Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteUser(int crtusrduID) {
        try {
            if (crtusrduID != 0) {
                PreparedStatement stmt = conn.prepareStatement("delete from lmsdb_user where id=?");

                stmt.setInt(1, crtusrduID);

                int i = stmt.executeUpdate();
                System.out.println(i + " record Deleted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<CreateUser> getList() {
        List<CreateUser> list = new ArrayList<>();
        try {
            CreateUser cr;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_user");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cr = new CreateUser();
                cr.setId(rs.getInt(1));
                cr.setName(rs.getString(2));
                cr.setEmail(rs.getString(3));
                cr.setUsername(rs.getString(4));
                cr.setMobile(rs.getString(5));
                cr.setPassword(rs.getString(6));
                cr.setUserType(rs.getString(7));
                list.add(cr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public CreateUser getUser(int id) {
        CreateUser cr = new CreateUser();
        try {

            PreparedStatement stmt = conn.prepareStatement("select * from lmsdb_user where id=?");
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cr.setId(rs.getInt(1));
                cr.setName(rs.getString(2));
                cr.setEmail(rs.getString(3));
                cr.setUsername(rs.getString(4));
                cr.setMobile(rs.getString(5));
                cr.setPassword(rs.getString(6));
                cr.setUserType(rs.getString(7));

            }

        } catch (SQLException ex) {
            Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cr;
    }

    @Override
    public CreateUser getUserByUsername(String username) {
        CreateUser createUser = new CreateUser();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_user WHERE username=?");
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                createUser.setId(rs.getInt(1));
                createUser.setName(rs.getString(2));
                createUser.setEmail(rs.getString(3));
                createUser.setUsername(rs.getString(4));
                createUser.setMobile(rs.getString(5));
                createUser.setPassword(rs.getString(6));
                createUser.setUserType(rs.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return createUser;
    }

    @Override
    public CreateUser getUserByEmail(String email) {
        CreateUser createUser = new CreateUser();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_user WHERE email=?");
            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                createUser.setId(rs.getInt(1));
                createUser.setName(rs.getString(2));
                createUser.setEmail(rs.getString(3));
                createUser.setUsername(rs.getString(4));
                createUser.setMobile(rs.getString(5));
                createUser.setPassword(rs.getString(6));
                createUser.setUserType(rs.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return createUser;
    }
}
