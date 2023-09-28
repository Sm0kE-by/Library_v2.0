package API.menu;

import API.menu.MenuEnum.Forward_Back;

public class NoveltiesMenu implements Menu {
    int count = 0;

    @Override
    public void getMenu() {

        getHeadMenu();
        System.out.println("������ ������������ 10 ��������� ������� �� ������� ����������");
        System.out.printf("%-35s %-3s\n", "��������", "ID");
        while (count != 1) {
            showOperationsMenu();
            System.out.println("�������� ��������, ����� ������ ID:");
            int numOperation = scanner.nextInt();
            chooseOperationMenu(numOperation);
        }
    }

    @Override
    public void showOperationsMenu() {
        //������� � ����������� �������� ���� ������ - ����� �� Enum
        for (Forward_Back operation : Forward_Back.values()) {
            System.out.printf("%-35s %-3s\n", operation.getNameOperation(), operation.getId());
        }
    }

    @Override
    public void chooseOperationMenu(int numOperation) {
        switch (numOperation) {
            case 1 -> {
                System.out.println("�������� ��������� 10 ����������� ���������");
                count = 0;
            }
            case 2 -> {
                //����� �������� �� ������ ��������
                System.out.println("�������� ���������� 10 ����������� ���������");
                count = 0;
            }
            case 3 -> {
                count = 1;
                MainMenu mainMenu = new MainMenu();
                mainMenu.getMenu();
            }
            default -> {
                System.out.println("������� ������ ID ��������!!!");
                getMenu();
            }
        }
    }
}
