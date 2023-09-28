package API.menu.MenuEnum;

public enum CatalogOfPrintedProductEnum {

    BOOKS("Книги",1),
    MAGAZINES ("Журналы",2),
    NEWSPAPERS("Газеты", 3),
    BACK_TO_MAIN_MENU("Вернуться в главное меню", 4);


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
