package API.menu;

import java.util.Scanner;

public interface Menu {
    public Scanner scanner = new Scanner(System.in);
    //getMenu - �������� ������� ������
    public void getMenu();
    public void showOperationsMenu();
    //chooseOperationMenu �������� ����� ������� � �� �����
    public void chooseOperationMenu(int numOperation);
    default void getHeadMenu(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("���������� ��������� ����������� ���������� ����� �. �. ������");
        System.out.println("----------------------------------------------------------------");
        System.out.println("��� ������ � ����� ���������� �������� ID ����������� ��������");
    }
}
