package Entity.Enums;

public enum Status {

    ACTIVE("Active"),
    LOCKED("Locked"),
    EXPIRED("Expired"),
    INACTIVE("Deactivated");


    public static Status fromString(String val){
        if(val==null || val.equals(""))
            return null;
        val = val.trim();
        if(val.equalsIgnoreCase("ACTIVE"))
            return ACTIVE;
        if(val.equalsIgnoreCase("LOCKED"))
            return LOCKED;
        if(val.equalsIgnoreCase("EXPIRED"))
            return EXPIRED;
        if(val.equalsIgnoreCase("INACTIVE"))
            return INACTIVE;
        return null;
    }
    private String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
