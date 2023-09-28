package API.menu;

import API.menu.MenuEnum.CatalogOfPrintedProductEnum;

public class CatalogOfPrintedProductMenu implements Menu {

    @Override
    public void getMenu() {
        getHeadMenu();
        System.out.printf("%-35s %-3s\n", "ОПЕРАЦИЯ", "ID");
        showOperationsMenu();
        System.out.println("Выберите операцию, введя нужный ID:");
        int numOperation = scanner.nextInt();
        chooseOperationMenu(numOperation);
    }


    @Override
    public void showOperationsMenu() {
//перебор и отображение операций меню каталогов из Enum
        for (CatalogOfPrintedProductEnum operation : CatalogOfPrintedProductEnum.values()) {
            System.out.printf("%-35s %-3s\n", operation.getNameOperation(), operation.getId());
        }
    }

    @Override
    public void chooseOperationMenu(int numOperation) {
        switch (numOperation) {
            case 1 -> System.out.println("Вызываем меню отображения Книг");
            case 2 -> System.out.println("Вызываем меню отображения Журналов");
            case 3 -> System.out.println("Вызываем меню отображения Газет");
            case 4 -> {
                MainMenu mainMenu = new MainMenu();
                mainMenu.getMenu();
            }
            default -> {
                System.out.println("Неверно выбран ID операции!!!");
                getMenu();
            }
        }
    }
}
