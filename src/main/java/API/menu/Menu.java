package API.menu;

import java.util.Scanner;

public interface Menu {
    public Scanner scanner = new Scanner(System.in);
    //getMenu - возможно сделать дефолт
    public void getMenu();
    public void showOperationsMenu();
    //chooseOperationMenu возможно нужно связать с ТД енама
    public void chooseOperationMenu(int numOperation);
    default void getHeadMenu(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Гомельская городская центральная библиотека имени В. И. Ленина");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Для работы в нашем приложении выберите ID необходимой операции");
    }
}
