package API.menu;

import API.menu.MenuEnum.Forward_Back;

public class NoveltiesMenu implements Menu {
    int count = 0;

    @Override
    public void getMenu() {

        getHeadMenu();
        System.out.println("Сейчас отображаются 10 последних изданий по времени добавления");
        System.out.printf("%-35s %-3s\n", "ОПЕРАЦИЯ", "ID");
        while (count != 1) {
            showOperationsMenu();
            System.out.println("Выберите операцию, введя нужный ID:");
            int numOperation = scanner.nextInt();
            chooseOperationMenu(numOperation);
        }
    }

    @Override
    public void showOperationsMenu() {
        //перебор и отображение операций меню Вперед - назад из Enum
        for (Forward_Back operation : Forward_Back.values()) {
            System.out.printf("%-35s %-3s\n", operation.getNameOperation(), operation.getId());
        }
    }

    @Override
    public void chooseOperationMenu(int numOperation) {
        switch (numOperation) {
            case 1 -> {
                System.out.println("Вызываем следующие 10 экземпляров продукции");
                count = 0;
            }
            case 2 -> {
                //НУЖНА ПРОВЕРКА НА ПЕРВУЮ СТРАНИЦУ
                System.out.println("Вызываем предыдущие 10 экземпляров продукции");
                count = 0;
            }
            case 3 -> {
                count = 1;
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
