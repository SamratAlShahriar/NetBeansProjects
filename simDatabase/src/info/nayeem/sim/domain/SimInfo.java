package info.nayeem.sim.domain;

/**
 *
 * @author Nayeem
 */
public class SimInfo {

    int id;
    String mobileNo;
    String simNo;
    String operatorName;
    String pin1;
    String pin2;
    String puk1;
    String puk2;
    String lastActiveDay;

    public SimInfo() {
    }

    public SimInfo(String mobileNo, String simNo, String operatorName, String pin1, String pin2, String puk1, String puk2, String lastActiveDay) {
        this.mobileNo = mobileNo;
        this.simNo = simNo;
        this.operatorName = operatorName;
        this.pin1 = pin1;
        this.pin2 = pin2;
        this.puk1 = puk1;
        this.puk2 = puk2;
        this.lastActiveDay = lastActiveDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getSimNo() {
        return simNo;
    }

    public void setSimNo(String simNo) {
        this.simNo = simNo;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getPin1() {
        return pin1;
    }

    public void setPin1(String pin1) {
        this.pin1 = pin1;
    }

    public String getPin2() {
        return pin2;
    }

    public void setPin2(String pin2) {
        this.pin2 = pin2;
    }

    public String getPuk1() {
        return puk1;
    }

    public void setPuk1(String puk1) {
        this.puk1 = puk1;
    }

    public String getPuk2() {
        return puk2;
    }

    public void setPuk2(String puk2) {
        this.puk2 = puk2;
    }

    public String getLastActiveDay() {
        return lastActiveDay;
    }

    public void setLastActiveDay(String lastActiveDay) {
        this.lastActiveDay = lastActiveDay;
    }

}
