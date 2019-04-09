package com.gov.npi.lms.service;

import com.gov.npi.lms.connection.DbConnection;
import com.gov.npi.lms.dao.StudentDAO;
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
 * @author Nayeem
 */
public class StudentService implements StudentDAO {

    Connection conn = DbConnection.getConnection();

    @Override
    public void save(Student s) {
        try {
            if (s.getRegistrationNo() != null) {

                PreparedStatement stmt = conn.prepareStatement("INSERT INTO lmsdb_student(name, registration_no, roll_no, department, shift, session, phone_no, house_no, road_no, block_or_village, thana, district, division, country)" + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                stmt.setString(1, s.getName());
                stmt.setString(2, s.getRegistrationNo());
                stmt.setString(3, s.getRollNo());
                stmt.setString(4, s.getDepartment());
                stmt.setString(5, s.getShift());
                stmt.setString(6, s.getSession());
                stmt.setString(7, s.getPhoneNo());
                stmt.setString(8, s.getHouseNo());
                stmt.setString(9, s.getRoadNo());
                stmt.setString(10, s.getBlockOrVillage());
                stmt.setString(11, s.getThana());
                stmt.setString(12, s.getDistrict());
                stmt.setString(13, s.getDivision());
                stmt.setString(14, s.getCountry());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Student s) {
        try {
            if (s.getId() != 0) {
                PreparedStatement stmt = conn.prepareStatement("update lmsdb_student SET name=?, registration_no=?, roll_no=?, department=?, shift=?, session=?, phone_no=?, house_no=?, road_no=?, block_or_village=?, thana=?, district=?, division=?, country=? where id=?");

                stmt.setString(1, s.getName());
                stmt.setString(2, s.getRegistrationNo());
                stmt.setString(3, s.getRollNo());
                stmt.setString(4, s.getDepartment());
                stmt.setString(5, s.getShift());
                stmt.setString(6, s.getSession());
                stmt.setString(7, s.getPhoneNo());
                stmt.setString(8, s.getHouseNo());
                stmt.setString(9, s.getRoadNo());
                stmt.setString(10, s.getBlockOrVillage());
                stmt.setString(11, s.getThana());
                stmt.setString(12, s.getDistrict());
                stmt.setString(13, s.getDivision());
                stmt.setString(14, s.getCountry());
                stmt.setInt(15, s.getId());
                int i = stmt.executeUpdate();

                System.out.println(i + " record Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int stuID) {
        try {
            if (stuID != 0) {
                PreparedStatement stmt = conn.prepareStatement("delete from lmsdb_student where id=?");

                stmt.setInt(1, stuID);

                int i = stmt.executeUpdate();
                System.out.println(i + " record Deleted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reset(Student s) {

    }

    @Override
    public List<Student> getList() {

        List<Student> list = new ArrayList<>();
        try {
            Student s;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_student");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setRegistrationNo(rs.getString(3));
                s.setRollNo(rs.getString(4));
                s.setDepartment(rs.getString(5));
                s.setShift(rs.getString(6));
                s.setSession(rs.getString(7));
                s.setPhoneNo(rs.getString(8));
                s.setHouseNo(rs.getString(9));
                s.setRoadNo(rs.getString(10));
                s.setBlockOrVillage(rs.getString(11));
                s.setThana(rs.getString(12));
                s.setDistrict(rs.getString(13));
                s.setDivision(rs.getString(14));
                s.setCountry(rs.getString(15));
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Student getStudent(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getUserByRollNo(String rollNO) {
        Student s = new Student();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from lmsdb_student where roll_no=?");
            stmt.setString(1, rollNO);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setRegistrationNo(rs.getString(3));
                s.setRollNo(rs.getString(4));
                s.setDepartment(rs.getString(5));
                s.setShift(rs.getString(6));
                s.setSession(rs.getString(7));
                s.setPhoneNo(rs.getString(8));
                s.setHouseNo(rs.getString(9));
                s.setRoadNo(rs.getString(10));
                s.setBlockOrVillage(rs.getString(11));
                s.setThana(rs.getString(12));
                s.setDistrict(rs.getString(13));
                s.setDivision(rs.getString(14));
                s.setCountry(rs.getString(15));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    @Override
    public Student getUserByRegNo(String regNo) {
         Student s = new Student();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from lmsdb_student where registration_no=?");
            stmt.setString(1, regNo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setRegistrationNo(rs.getString(3));
                s.setRollNo(rs.getString(4));
                s.setDepartment(rs.getString(5));
                s.setShift(rs.getString(6));
                s.setSession(rs.getString(7));
                s.setPhoneNo(rs.getString(8));
                s.setHouseNo(rs.getString(9));
                s.setRoadNo(rs.getString(10));
                s.setBlockOrVillage(rs.getString(11));
                s.setThana(rs.getString(12));
                s.setDistrict(rs.getString(13));
                s.setDivision(rs.getString(14));
                s.setCountry(rs.getString(15));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    @Override
    public List<Student> getListByName(String name) {
        List<Student> list = new ArrayList<>();
        try {
            Student s;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_student WHERE name=?");
            stmt.setString(1, name);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setRegistrationNo(rs.getString(3));
                s.setRollNo(rs.getString(4));
                s.setDepartment(rs.getString(5));
                s.setShift(rs.getString(6));
                s.setSession(rs.getString(7));
                s.setPhoneNo(rs.getString(8));
                s.setHouseNo(rs.getString(9));
                s.setRoadNo(rs.getString(10));
                s.setBlockOrVillage(rs.getString(11));
                s.setThana(rs.getString(12));
                s.setDistrict(rs.getString(13));
                s.setDivision(rs.getString(14));
                s.setCountry(rs.getString(15));
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<Student> getListByRollNo(String rollNo) {
       List<Student> list = new ArrayList<>();
        try {
            Student s;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_student WHERE roll_no=?");
            stmt.setString(1, rollNo);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setRegistrationNo(rs.getString(3));
                s.setRollNo(rs.getString(4));
                s.setDepartment(rs.getString(5));
                s.setShift(rs.getString(6));
                s.setSession(rs.getString(7));
                s.setPhoneNo(rs.getString(8));
                s.setHouseNo(rs.getString(9));
                s.setRoadNo(rs.getString(10));
                s.setBlockOrVillage(rs.getString(11));
                s.setThana(rs.getString(12));
                s.setDistrict(rs.getString(13));
                s.setDivision(rs.getString(14));
                s.setCountry(rs.getString(15));
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<Student> getListByRegNo(String regNo) {
       List<Student> list = new ArrayList<>();
        try {
            Student s;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_student WHERE registration_no=?");
            stmt.setString(1, regNo);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setRegistrationNo(rs.getString(3));
                s.setRollNo(rs.getString(4));
                s.setDepartment(rs.getString(5));
                s.setShift(rs.getString(6));
                s.setSession(rs.getString(7));
                s.setPhoneNo(rs.getString(8));
                s.setHouseNo(rs.getString(9));
                s.setRoadNo(rs.getString(10));
                s.setBlockOrVillage(rs.getString(11));
                s.setThana(rs.getString(12));
                s.setDistrict(rs.getString(13));
                s.setDivision(rs.getString(14));
                s.setCountry(rs.getString(15));
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<Student> getListByPhoneNo(String phoneNo) {
        List<Student> list = new ArrayList<>();
        try {
            Student s;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_student WHERE phone_no=?");
            stmt.setString(1, phoneNo);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setRegistrationNo(rs.getString(3));
                s.setRollNo(rs.getString(4));
                s.setDepartment(rs.getString(5));
                s.setShift(rs.getString(6));
                s.setSession(rs.getString(7));
                s.setPhoneNo(rs.getString(8));
                s.setHouseNo(rs.getString(9));
                s.setRoadNo(rs.getString(10));
                s.setBlockOrVillage(rs.getString(11));
                s.setThana(rs.getString(12));
                s.setDistrict(rs.getString(13));
                s.setDivision(rs.getString(14));
                s.setCountry(rs.getString(15));
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
