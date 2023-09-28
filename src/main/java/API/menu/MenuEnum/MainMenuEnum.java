package API.menu.MenuEnum;

public enum MainMenuEnum {

    CATALOG_OF_PRINTED_PRODUCTS("������� �������� ���������", 1),
    NOVELTIES("�������", 2),
    SEARCH("�����",3),
    ADMINISTRATION("�����������������",4),
    FEEDBACK("�������� �����",5),
    EXIT("����� �� ����������",6);

    private String nameOperation;
    private int id;

    MainMenuEnum(String nameOperation, int id) {
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
