package ir.terminal724.www.terminal724.Search_City;

public class POJO_Cities {
    String city_persian;
    String city_english;
    String city_code;
    String country;

    public POJO_Cities(String city_persian, String city_english, String city_code, String country) {
        this.city_persian = city_persian;
        this.city_english = city_english;
        this.city_code = city_code;
        this.country = country;
    }

    public String getCity_persian() {
        return city_persian;
    }

    public void setCity_persian(String city_persian) {
        this.city_persian = city_persian;
    }

    public String getCity_english() {
        return city_english;
    }

    public void setCity_english(String city_english) {
        this.city_english = city_english;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
