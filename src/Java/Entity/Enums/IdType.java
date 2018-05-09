package Entity.Enums;

public enum IdType {

    NATIONAL("National ID"),
    PASSPORT("Passport No"),
    VOTER("Voter ID"),
    DRIVER("Driver's License"),
    NOT_SPECIFIED("Not Specified");

    private String name;

    IdType(String name) {
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

    public static IdType fromString(String text) {
        if (text != null) {
            try{
                //try getting the raw value
                return IdType.valueOf(text);
            }catch (Exception e) {
                //the text did not match any raw values, now try the other option
                for (IdType b : IdType.values()) {
                    if (text.equalsIgnoreCase(b.toString())) {
                        return b;
                    }
                }
            }
        }
        return null;
    }

    public String toJson(){
        StringBuffer sb = new StringBuffer();
        sb.append("{\"value\":").append("\"").append(this.name()).append("\",")
                .append("\"name\":\"").append(this.getName()).append("\"},")
                .append("\n");
        return sb.toString();
    }
}
