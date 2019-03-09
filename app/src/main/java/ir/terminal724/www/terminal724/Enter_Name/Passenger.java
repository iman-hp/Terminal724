package ir.terminal724.www.terminal724.Enter_Name;

public class Passenger {
    private String name = "";
    private String lastName = "";
    private String birthday = "";
    private boolean major;
    private boolean nationality;
    private String id ="0";
    private int type;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    private String typeName;


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }



    public Passenger(String name, String lastName, boolean major, boolean nationality, String id, int type) {
        this.name = name;
        this.lastName = lastName;
        this.major = major;
        this.nationality = nationality;
        this.id = id;
        this.type = type;
    }

    public Passenger(int type) {
        this.type = type;
    }

    public String getName() {


        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isMajor() {
        return major;
    }

    public void setMajor(boolean major) {
        this.major = major;
    }

    public boolean isNationality() {
        return nationality;
    }

    public void setNationality(boolean nationality) {
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
