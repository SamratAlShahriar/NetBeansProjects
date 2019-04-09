package info.nayeem.sim.domain;

/**
 *
 * @author Nayeem
 */
public class TakenOffer {

    int id;
    String offerInfo;
    String offerStartFrom;
    String dateOfLastOfferGain;
    String totalHowManyTimeWillGetTheOffer;
    String alreadyGotOffer;
    String moreToGetOffer;
    String offerCondition;

    public TakenOffer() {
    }

    public TakenOffer(String offerInfo, String offerStartFrom, String dateOfLastOfferGain, String totalHowManyTimeWillGetTheOffer, String alreadyGotOffer, String moreToGetOffer, String offerCondition) {
        this.offerInfo = offerInfo;
        this.offerStartFrom = offerStartFrom;
        this.dateOfLastOfferGain = dateOfLastOfferGain;
        this.totalHowManyTimeWillGetTheOffer = totalHowManyTimeWillGetTheOffer;
        this.alreadyGotOffer = alreadyGotOffer;
        this.moreToGetOffer = moreToGetOffer;
        this.offerCondition = offerCondition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOfferInfo() {
        return offerInfo;
    }

    public void setOfferInfo(String offerInfo) {
        this.offerInfo = offerInfo;
    }

    public String getOfferStartFrom() {
        return offerStartFrom;
    }

    public void setOfferStartFrom(String offerStartFrom) {
        this.offerStartFrom = offerStartFrom;
    }

    public String getDateOfLastOfferGain() {
        return dateOfLastOfferGain;
    }

    public void setDateOfLastOfferGain(String dateOfLastOfferGain) {
        this.dateOfLastOfferGain = dateOfLastOfferGain;
    }

    public String getTotalHowManyTimeWillGetTheOffer() {
        return totalHowManyTimeWillGetTheOffer;
    }

    public void setTotalHowManyTimeWillGetTheOffer(String totalHowManyTimeWillGetTheOffer) {
        this.totalHowManyTimeWillGetTheOffer = totalHowManyTimeWillGetTheOffer;
    }

    public String getAlreadyGotOffer() {
        return alreadyGotOffer;
    }

    public void setAlreadyGotOffer(String alreadyGotOffer) {
        this.alreadyGotOffer = alreadyGotOffer;
    }

    public String getMoreToGetOffer() {
        return moreToGetOffer;
    }

    public void setMoreToGetOffer(String moreToGetOffer) {
        this.moreToGetOffer = moreToGetOffer;
    }

    public String getOfferCondition() {
        return offerCondition;
    }

    public void setOfferCondition(String offerCondition) {
        this.offerCondition = offerCondition;
    }

}
