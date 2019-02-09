
package ir.terminal724.www.terminal724.Search_City;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Citys implements Parcelable
{

    @SerializedName("airportCode")
    @Expose
    private String airportCode;
    @SerializedName("airportName")
    @Expose
    private String airportName;
    @SerializedName("airportNameEn")
    @Expose
    private String airportNameEn;
    @SerializedName("airportKey")
    @Expose
    private String airportKey;
    public final static Creator<Citys> CREATOR = new Creator<Citys>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Citys createFromParcel(Parcel in) {
            return new Citys(in);
        }

        public Citys[] newArray(int size) {
            return (new Citys[size]);
        }

    }
    ;

    protected Citys(Parcel in) {
        this.airportCode = ((String) in.readValue((String.class.getClassLoader())));
        this.airportName = ((String) in.readValue((String.class.getClassLoader())));
        this.airportNameEn = ((String) in.readValue((String.class.getClassLoader())));
        this.airportKey = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Citys() {
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public Citys withAirportCode(String airportCode) {
        this.airportCode = airportCode;
        return this;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public Citys withAirportName(String airportName) {
        this.airportName = airportName;
        return this;
    }

    public String getAirportNameEn() {
        return airportNameEn;
    }

    public void setAirportNameEn(String airportNameEn) {
        this.airportNameEn = airportNameEn;
    }

    public Citys withAirportNameEn(String airportNameEn) {
        this.airportNameEn = airportNameEn;
        return this;
    }

    public String getAirportKey() {
        return airportKey;
    }

    public void setAirportKey(String airportKey) {
        this.airportKey = airportKey;
    }

    public Citys withAirportKey(String airportKey) {
        this.airportKey = airportKey;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(airportCode);
        dest.writeValue(airportName);
        dest.writeValue(airportNameEn);
        dest.writeValue(airportKey);
    }

    public int describeContents() {
        return  0;
    }

}
