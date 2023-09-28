package API.menu;

import API.menu.MenuEnum.MainMenuEnum;
import API.menu.MenuEnum.SearchEnum;

public class MainMenu implements Menu {

    public void getMenu() {
        getHeadMenu();
        System.out.printf("%-35s %-3s\n", "ОПЕРАЦИЯ", "ID");
        showOperationsMenu();
        System.out.println("Выберите операцию, введя нужный ID:");
        int numOperation = scanner.nextInt();
        chooseOperationMenu(numOperation);
    }

    public void showOperationsMenu() {
        //перебор и отображение операций главного меню из Enum
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
                System.out.println("РЕСПУБЛИКА БЕЛАРУСЬ, г.Гомель, ул. Саветская д.1\n" +
                        "   Контактный телефон: +375-25-777-66-55 \n" +
                        "   Email: GomelLibrary@mail.ru");
                getMenu();
            }
            case 6 -> {
                System.out.println("Производиться выход из приложения");
                System.exit(0);
            }
            default -> {
                System.out.println("Неверно выбран ID операции!!!");
                getMenu();
            }
        }
    }
}
