package API.menu.MenuEnum;

public enum Forward_Back {
    FORWARD("������", 1),
    BACK("�����", 2),
    RETURN("��������� � ���������� ����", 3);

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
