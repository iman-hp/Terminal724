
package ir.terminal724.www.terminal724.Show_Ticket.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Comparator;

public class Flight {
    public static class Sortbyroll implements Comparator<Flight> {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Flight a, Flight b) {
            return a.getPriceView().intValue() - b.getPriceView().intValue();
        }
    }
    public static class SortByTime implements Comparator<Flight> {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Flight a, Flight b) {
            String[] clocka = a.getFlightTime().split(":");
            String[] clockb = b.getFlightTime().split(":");
            Long aI = Long.parseLong((clocka[0]));
            Long bI = Long.parseLong(clockb[0]);
//            if (aI<12){
//                aI+=12;
//            }
//            if (bI<12){
//                bI+=12;
//            }

            return aI.intValue() - bI.intValue();
        }
    }

    @SerializedName("flightId")
    @Expose
    private Long flightId;
    @SerializedName("classId")
    @Expose
    private Long classId;
    @SerializedName("kndSys")
    @Expose
    private Integer kndSys;
    @SerializedName("airline")
    @Expose
    private String airline;
    @SerializedName("airlineIataCode")
    @Expose
    private String airlineIataCode;
    @SerializedName("flightNo")
    @Expose
    private String flightNo;
    @SerializedName("flightTime")
    @Expose
    private String flightTime;
    @SerializedName("flightDay")
    @Expose
    private String flightDay;
    @SerializedName("flightDate")
    @Expose
    private String flightDate;
    @SerializedName("flightDateM")
    @Expose
    private String flightDateM;
    @SerializedName("flightDateTime")
    @Expose
    private String flightDateTime;
    @SerializedName("cap")
    @Expose
    private Integer cap;
    @SerializedName("capCount")
    @Expose
    private Object capCount;
    @SerializedName("priceView")
    @Expose
    private double priceView;
    @SerializedName("className")
    @Expose
    private String className;
    @SerializedName("iataCodSource")
    @Expose
    private String iataCodSource;
    @SerializedName("iataCodDestinate")
    @Expose
    private String iataCodDestinate;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("destinate")
    @Expose
    private String destinate;
    @SerializedName("flightType")
    @Expose
    private String flightType;
    @SerializedName("pathKind")
    @Expose
    private Integer pathKind;
    @SerializedName("fareBasisCode")
    @Expose
    private String fareBasisCode;
    @SerializedName("serviceType")
    @Expose
    private Integer serviceType;
    @SerializedName("faranegarId")
    @Expose
    private String faranegarId;

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }

    public Integer getKndSys() {
        return kndSys;
    }

    public void setKndSys(Integer kndSys) {
        this.kndSys = kndSys;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAirlineIataCode() {
        return airlineIataCode;
    }

    public void setAirlineIataCode(String airlineIataCode) {
        this.airlineIataCode = airlineIataCode;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getFlightDay() {
        return flightDay;
    }

    public void setFlightDay(String flightDay) {
        this.flightDay = flightDay;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightDateM() {
        return flightDateM;
    }

    public void setFlightDateM(String flightDateM) {
        this.flightDateM = flightDateM;
    }

    public String getFlightDateTime() {
        return flightDateTime;
    }

    public void setFlightDateTime(String flightDateTime) {
        this.flightDateTime = flightDateTime;
    }

    public Integer getCap() {
        return cap;
    }

    public void setCap(Integer cap) {
        this.cap = cap;
    }

    public Object getCapCount() {
        return capCount;
    }

    public void setCapCount(Object capCount) {
        this.capCount = capCount;
    }

    public Double getPriceView() {
        return priceView;
    }

    public void setPriceView(Integer priceView) {
        this.priceView = priceView;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getIataCodSource() {
        return iataCodSource;
    }

    public void setIataCodSource(String iataCodSource) {
        this.iataCodSource = iataCodSource;
    }

    public String getIataCodDestinate() {
        return iataCodDestinate;
    }

    public void setIataCodDestinate(String iataCodDestinate) {
        this.iataCodDestinate = iataCodDestinate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestinate() {
        return destinate;
    }

    public void setDestinate(String destinate) {
        this.destinate = destinate;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public Integer getPathKind() {
        return pathKind;
    }

    public void setPathKind(Integer pathKind) {
        this.pathKind = pathKind;
    }

    public String getFareBasisCode() {
        return fareBasisCode;
    }

    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public String getFaranegarId() {
        return faranegarId;
    }

    public void setFaranegarId(String faranegarId) {
        this.faranegarId = faranegarId;
    }

}
