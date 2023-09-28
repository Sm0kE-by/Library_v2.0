package API.menu.MenuEnum;

public enum AdministrationEnum {
    CREATE("Создать", 1),
    READ("Получить", 2),
    UPDATE("Изменить", 3),
    DELETE("Удалить", 4),
    BACK("Назад", 5);

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
