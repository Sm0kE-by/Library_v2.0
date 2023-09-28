package API.menu.MenuEnum;

public enum SearchEnum {

    SEARCH_BY_AUTHOR("Поиск по автору", 1),
    SEARCH_BY_PUBLISHING_HOUSE("Поиск по издательству", 2),
    SEARCH_BY_YEAR_OF_PUBLICATION("Поиск по году публикации", 3),
    SEARCH_BY_THE_TITLE_OF_THE_WORK("Поиск по названию работы", 4),
    BACK("Вернуться в главное меню", 5);

    private String nameOperation;
    private int id;

    SearchEnum(String nameOperation, int id) {
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
