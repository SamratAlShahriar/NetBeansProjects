
package workEmployee;


public class AddressInfo {
    
    private String houseNo;
    private String blockNo;
    private String roadNo;
    private String thana;
    private String destrict;
    private AddressTy addressTy;

    public AddressInfo(String houseNo, String blockNo, String roadNo, String thana, String destrict,AddressTy addressTy) {
        this.houseNo = houseNo;
        this.blockNo = blockNo;
        this.roadNo = roadNo;
        this.thana = thana;
        this.destrict = destrict;
        this.addressTy=addressTy;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getBlockNo() {
        return blockNo;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public String getThana() {
        return thana;
    }

    public String getDestrict() {
        return destrict;
    }
    
}
