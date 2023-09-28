package API.menu.MenuEnum;

public enum AdministrationEnum {
    CREATE("�������", 1),
    READ("��������", 2),
    UPDATE("��������", 3),
    DELETE("�������", 4),
    BACK("�����", 5);

    private String nameOperation;
    private int id;

    AdministrationEnum(String nameOperation, int id) {
        this.nameOperation = nameOperation;
        this.id = id;
    }

    public String getNameOperation() {
        return nameOperation;
    }

    public int getId() {
        return id;
    }
}
