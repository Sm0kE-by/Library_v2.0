package API.menu.MenuEnum;

public enum SearchEnum {

    SEARCH_BY_AUTHOR("����� �� ������", 1),
    SEARCH_BY_PUBLISHING_HOUSE("����� �� ������������", 2),
    SEARCH_BY_YEAR_OF_PUBLICATION("����� �� ���� ����������", 3),
    SEARCH_BY_THE_TITLE_OF_THE_WORK("����� �� �������� ������", 4),
    BACK("��������� � ������� ����", 5);

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
