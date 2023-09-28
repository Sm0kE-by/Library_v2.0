package API.menu.MenuEnum;

public enum Forward_Back {
    FORWARD("Вперед", 1),
    BACK("Назад", 2),
    RETURN("Вернуться в предыдущее меню", 3);

    private String nameOperation;
    private int id;

    Forward_Back(String nameOperation, int id) {
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
