package Entity.Enums;

public enum Title {

    MR("Mr."),
    MRS("Mrs."),
    MISS("Miss."),
    MS("Ms."),
    DR("Dr."),
    PROF("Prof."),
    REV("Rev."),
    ENG("Eng."),
    VIRTUAL("Virt."),
    HON("Hon."),
    UNKNOWN("");

    private String name;
    private Title(String name) {
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

    public static Title fromString(String text) {
        if (text != null) {
            for (Title b : Title.values()) {
                if (text.equalsIgnoreCase(b.name()) || text.equalsIgnoreCase(b.name() + ".")) {
                    return b;
                }
            }
        }
        return null;
    }
}
