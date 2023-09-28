package API.menu.MenuEnum;

public enum MainMenuEnum {

    CATALOG_OF_PRINTED_PRODUCTS("Каталог печатной продукции", 1),
    NOVELTIES("Новинки", 2),
    SEARCH("Поиск",3),
    ADMINISTRATION("Администрирование",4),
    FEEDBACK("Обратная связь",5),
    EXIT("Выход из приложения",6);

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
