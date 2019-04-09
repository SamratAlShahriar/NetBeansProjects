package com.gov.npi.lms.dao;

import com.gov.npi.lms.domain.Student;
import java.util.List;

/**
 *
 * @author Nayeem
 */
public interface StudentDAO {

    public void save(Student s);

    public void update(Student s);

    public void delete(int stuID);

    List<Student> getList();

    Student getStudent(int id);

    Student getUserByRegNo(String regNo);

    Student getUserByRollNo(String rollNo);

    List<Student> getListByName(String name);

    List<Student> getListByRollNo(String rollNo);

    List<Student> getListByRegNo(String regNo);

    List<Student> getListByPhoneNo(String phoneNo);
}
