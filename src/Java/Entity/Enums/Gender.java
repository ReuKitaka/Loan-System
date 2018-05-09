package Entity.Enums;

public enum Gender {

    MALE("Male"),
    FEMALE("Female");



    private String name;
    private Gender(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    public static Gender fromString(String val){
        if(val==null || val.equals(""))
            return null;
        val = val.trim();
        if(val.equalsIgnoreCase("Male"))
            return MALE;
        if(val.equalsIgnoreCase("Female"))
            return FEMALE;
        return null;
    }
}
