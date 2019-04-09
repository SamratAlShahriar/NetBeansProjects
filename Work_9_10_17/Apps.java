
import workEmployee.AddressInfo;
import workEmployee.AddressTy;
import workEmployee.BasicInfo;
import workEmployee.EmployeeApss;
import workEmployee.edu.EduInfo;
import workEmployee.edu.Exam;
import workEmployee.edu.ExamBord;
import workEmployee.edu.ExamResult;
import workEmployee.edu.ExamYear;
import workEmployee.edu.Group;

public class Apps {

    public static void main(String[] args) {
        EmployeeApss employeeApss = new EmployeeApss(101, new BasicInfo("anik", "paulanik112@gmail.com", "01826995639"), new AddressInfo("12-13", "12", "9-A", "Dhanmondi", "Dhaka", new AddressTy("Present")), new EduInfo(201, new Exam("SSC"), new Group("CSE"), new ExamYear(2014), new ExamBord("Comilla"), new ExamResult(3.00, "B")));
        
        // EmployeeApss(long EmpID, BasicInfo basicInfo, AddressInfo addressInfo, EduInfo eduInfo)
        // AddressInfo(String houseNo, String blockNo, String roadNo, String thana, String destrict,AddressTy addressTy)
        //  EduInfo(long eduInfoID, Exam exam, Group group, ExamYear examYear, ExamBord examBord, ExamResult examResult)
        
        System.out.println("Empolyee Id: "+employeeApss.getEmpID()+
                           "\nEmpolyee Name: "+employeeApss.getBasicInfo().getName()+
                           "\nEmpolyee Email: "+employeeApss.getBasicInfo().getEmail()+
                           "\nEmpolyee Number: "+employeeApss.getBasicInfo().getNumber()+
                           "\n\nEmpolyee Present Address: "+
                           "\n\tHouse No: "+employeeApss.getAddressInfo().getHouseNo()+
                           "\n\tBlook NO: "+employeeApss.getAddressInfo().getBlockNo()+
                           "\n\tRoad NO: "+employeeApss.getAddressInfo().getRoadNo()+
                           "\n\tThana: "+employeeApss.getAddressInfo().getThana()+
                           "\n\tDestrict: "+employeeApss.getAddressInfo().getDestrict()+
                           "\n\nEducation Id: "+employeeApss.getEduInfo().getEduInfoID()+
                           "\n\tExam Name: "+employeeApss.getEduInfo().getExam().getExamName()+
                           "\n\tExam Group: "+employeeApss.getEduInfo().getExamBord().getBordName()+
                           "\n\tExam Year: "+employeeApss.getEduInfo().getExamYear().getExamYear()+
                           "\n\tExam Bord: "+employeeApss.getEduInfo().getExamBord().getBordName()+
                           "\n\n\tExam Result: "+
                           "\n\t\tGPA: "+employeeApss.getEduInfo().getExamResult().getGetGPA()+
                           "\n\t\tGrade: "+employeeApss.getEduInfo().getExamResult().getGetGrade());
    }

}
