package API.menu;

import API.menu.MenuEnum.CatalogOfPrintedProductEnum;

public class CatalogOfPrintedProductMenu implements Menu {

    @Override
    public void getMenu() {
        getHeadMenu();
        System.out.printf("%-35s %-3s\n", "��������", "ID");
        showOperationsMenu();
        System.out.println("�������� ��������, ����� ������ ID:");
        int numOperation = scanner.nextInt();
        chooseOperationMenu(numOperation);
    }


    @Override
    public void showOperationsMenu() {
//������� � ����������� �������� ���� ��������� �� Enum
        for (CatalogOfPrintedProductEnum operation : CatalogOfPrintedProductEnum.values()) {
            System.out.printf("%-35s %-3s\n", operation.getNameOperation(), operation.getId());
        }
    }

    @Override
    public void chooseOperationMenu(int numOperation) {
        switch (numOperation) {
            case 1 -> System.out.println("�������� ���� ����������� ����");
            case 2 -> System.out.println("�������� ���� ����������� ��������");
            case 3 -> System.out.println("�������� ���� ����������� �����");
            case 4 -> {
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
