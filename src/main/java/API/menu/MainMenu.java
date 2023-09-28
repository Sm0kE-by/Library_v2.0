package API.menu;

import API.menu.MenuEnum.MainMenuEnum;
import API.menu.MenuEnum.SearchEnum;

public class MainMenu implements Menu {

    public void getMenu() {
        getHeadMenu();
        System.out.printf("%-35s %-3s\n", "��������", "ID");
        showOperationsMenu();
        System.out.println("�������� ��������, ����� ������ ID:");
        int numOperation = scanner.nextInt();
        chooseOperationMenu(numOperation);
    }

    public void showOperationsMenu() {
        //������� � ����������� �������� �������� ���� �� Enum
        for (MainMenuEnum operation : MainMenuEnum.values()) {
            System.out.printf("%-35s %-3s\n", operation.getNameOperation(), operation.getId());
        }
    }

    public void chooseOperationMenu(int numOperation) {
        switch (numOperation) {
            case 1 -> {
                CatalogOfPrintedProductMenu catalogOfPrintedProduct = new CatalogOfPrintedProductMenu();
                catalogOfPrintedProduct.getMenu();
            }
            case 2 -> {
                NoveltiesMenu novelties = new NoveltiesMenu();
                novelties.getMenu();
            }
            case 3 -> {
                SearchMenu searchMenu = new SearchMenu();
                searchMenu.getMenu();
            }
            case 4 -> {
                AdministrationMenu administrationMenu = new AdministrationMenu();
                administrationMenu.getMenu();
            }
            case 5 -> {
                System.out.println("���������� ��������, �.������, ��. ��������� �.1\n" +
                        "   ���������� �������: +375-25-777-66-55 \n" +
                        "   Email: GomelLibrary@mail.ru");
                getMenu();
            }
            case 6 -> {
                System.out.println("������������� ����� �� ����������");
                System.exit(0);
            }
            default -> {
                System.out.println("������� ������ ID ��������!!!");
                getMenu();
            }
        }
    }
}
