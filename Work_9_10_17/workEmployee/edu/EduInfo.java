
package workEmployee.edu;

public class EduInfo {
    
    private long eduInfoID;
    private Exam exam;
    private Group group;
    private ExamYear examYear;
    private ExamBord examBord;
    private ExamResult examResult;

    public EduInfo(long eduInfoID, Exam exam, Group group, ExamYear examYear, ExamBord examBord, ExamResult examResult) {
        this.eduInfoID = eduInfoID;
        this.exam = exam;
        this.group = group;
        this.examYear = examYear;
        this.examBord = examBord;
        this.examResult = examResult;
    }

    public long getEduInfoID() {
        return eduInfoID;
    }

    public Exam getExam() {
        return exam;
    }

    public Group getGroup() {
        return group;
    }

    public ExamYear getExamYear() {
        return examYear;
    }

    public ExamBord getExamBord() {
        return examBord;
    }

    public ExamResult getExamResult() {
        return examResult;
    }
    
    
}
