package com.gov.npi.lms.domain;

/**
 *
 * @author Samrat Al Shahriar
 */
public class Student {

    private int id;
    private String name;
    private String registrationNo;
    private String rollNo;
    private String department;
    private String shift;
    private String session;
    private String phoneNo;
    private String houseNo;
    private String roadNo;
    private String blockOrVillage;
    private String thana;
    private String district;
    private String division;
    private String country;

    public Student() {
    }

    public Student(String name, String registrationNo, String rollNo, String department, String shift, String session, String phoneNo, String houseNo, String roadNo, String blockOrVillage, String thana, String district, String division, String country) {
        this.name = name;
        this.registrationNo = registrationNo;
        this.rollNo = rollNo;
        this.department = department;
        this.shift = shift;
        this.session = session;
        this.phoneNo = phoneNo;
        this.houseNo = houseNo;
        this.roadNo = roadNo;
        this.blockOrVillage = blockOrVillage;
        this.thana = thana;
        this.district = district;
        this.division = division;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(String roadNo) {
        this.roadNo = roadNo;
    }

    public String getBlockOrVillage() {
        return blockOrVillage;
    }

    public void setBlockOrVillage(String blockOrVillage) {
        this.blockOrVillage = blockOrVillage;
    }

    public String getThana() {
        return thana;
    }

    public void setThana(String thana) {
        this.thana = thana;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
