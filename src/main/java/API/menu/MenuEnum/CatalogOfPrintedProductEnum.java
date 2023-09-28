package API.menu.MenuEnum;

public enum CatalogOfPrintedProductEnum {

    BOOKS("�����",1),
    MAGAZINES ("�������",2),
    NEWSPAPERS("������", 3),
    BACK_TO_MAIN_MENU("��������� � ������� ����", 4);


    private String nameOperation;
    private int id;

    CatalogOfPrintedProductEnum(String nameOperation, int id) {
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
