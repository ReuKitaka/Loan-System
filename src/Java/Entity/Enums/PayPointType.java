package Entity.Enums;

public enum PayPointType {

    BANK("Bank"),
    NON_BANK("Non Bank");

    private String name;

    private PayPointType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
