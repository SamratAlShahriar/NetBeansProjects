package workEmployee;

import workEmployee.edu.EduInfo;

public class EmployeeApss {
    
    private long EmpID;
    private BasicInfo basicInfo;
    private AddressInfo addressInfo;
    private EduInfo eduInfo;

    public EmployeeApss(long EmpID, BasicInfo basicInfo, AddressInfo addressInfo, EduInfo eduInfo) {
        this.EmpID = EmpID;
        this.basicInfo = basicInfo;
        this.addressInfo = addressInfo;
        this.eduInfo = eduInfo;
    }

    public long getEmpID() {
        return EmpID;
    }

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public EduInfo getEduInfo() {
        return eduInfo;
    }
    
    
    
}
