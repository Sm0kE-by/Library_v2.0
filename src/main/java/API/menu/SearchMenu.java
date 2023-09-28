package API.menu;

import API.menu.MenuEnum.CatalogOfPrintedProductEnum;
import API.menu.MenuEnum.SearchEnum;

public class SearchMenu implements Menu{
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
//перебор и отображение операций меню поиска из Enum
        for (SearchEnum operation : SearchEnum.values()) {
            System.out.printf("%-35s %-3s\n", operation.getNameOperation(), operation.getId());
        }
    }

    @Override
    public void chooseOperationMenu(int numOperation) {
        switch (numOperation) {
            case 1 -> System.out.println("Вызываем меню Поиска по автору");
            case 2 -> System.out.println("Вызываем меню Поиска по издательству");
            case 3 -> System.out.println("Вызываем меню Поиска по году публикации");
            case 4 -> System.out.println("Вызываем меню Поиска по названию работы");
            case 5 -> {
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
