package Entity.Enums;

public enum MaritalStatus {

    SINGLE("Single"),
    MARRIED("Married"),
    SEPARATED("Separated"),
    DIVORCED("Divorced"),
    WIDOWED("Widowed"),
    NOT_SPECIFIED("Not Specified");


    private String name;

    MaritalStatus(String name) {
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

    public static MaritalStatus fromString(String text) {
        if (text != null) {
            for (MaritalStatus b : MaritalStatus.values()) {
                if (text.equalsIgnoreCase(b.name)) {
                    return b;
                }
            }
        }
        return null;
    }
}
