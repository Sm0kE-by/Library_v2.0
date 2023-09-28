package API.menu;

import API.menu.MenuEnum.AdministrationEnum;
import API.menu.MenuEnum.SearchEnum;

public class AdministrationMenu implements Menu {
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
//перебор и отображение операций меню поиска администратора из Enum
        for (AdministrationEnum operation : AdministrationEnum.values()) {
            System.out.printf("%-35s %-3s\n", operation.getNameOperation(), operation.getId());
        }
    }

    @Override
    public void chooseOperationMenu(int numOperation) {
        switch (numOperation) {
            case 1 -> System.out.println("Вызываем меню Создания объекта");
            case 2 -> System.out.println("Вызываем меню Получения объекта");
            case 3 -> System.out.println("Вызываем меню Изменения объекта");
            case 4 -> System.out.println("Вызываем меню Удаления объекта");
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
