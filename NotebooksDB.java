import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class NotebooksDB {
    public static void main(String[] args) throws Exception {
        NotebookClass laptop1 = new NotebookClass("Lenovo IdealPad 15", 15.6, 8, "HDD", 1024, "DOS", "Цвет: черный, WiFi: 11a/b, Optical Drive: DVD-RW.");
        NotebookClass laptop2 = new NotebookClass("Honor MagicBook 16", 16.1, 16, "SSD", 512, "Windows 11", "Цвет: серибристый, WiFi: 11n, CardReader для SD, док-станция в комплекте.");
        NotebookClass laptop3 = new NotebookClass("Apple MacBook Air 13", 13.3, 8, "SSD", 256, "MacOs", "Цвет: золотистый, WiFi: 11n");
        NotebookClass laptop4 = new NotebookClass("Dell Latitude 5520", 15.6, 8, "HDD", 512, "без ОС", "Цвет: серебристый, WiFi: 11b/g/n, SmartCard reader");
        NotebookClass laptop5 = new NotebookClass("Honor MagicBook 16", 16.1, 16, "SSD", 512, "Windows 11", "Цвет: серибристый, WiFi: 11n, CardReader для SD.");
        NotebookClass laptop6 = new NotebookClass("Honor MagicBook 15", 15.3, 16, "HDD", 512, "Windows 7", "Цвет: серибристый, WiFi: 11n, CardReader для SD");
        NotebookClass laptop7 = new NotebookClass("Lenovo IdealPad 15", 15.6, 4, "HDD", 256, "Windows 7", "Цвет: черный, WiFi: 11a/b, Optical Drive: DVD-RW.");
        NotebookClass laptop8 = new NotebookClass("Lenovo IdealPad 14", 14.0, 8, "HDD", 256, "DOS", "Цвет: черный, Optical Drive: CD-ROM.");
        NotebookClass laptop9 = new NotebookClass("Dell Latitude 5520", 15.6, 8, "SSD", 512, "без ОС", "Цвет: серебристый, WiFi: 11b/g/n, SmartCard reader");
        NotebookClass laptop10 = new NotebookClass("Honor MagicBook 16", 16.1, 16, "SSD", 1024, "Windows 11", "Цвет: серибристый, WiFi: 11n, CardReader для SD, док-станция в комплекте.");
        NotebookClass laptop11 = laptop3;
        NotebookClass laptop12 = laptop5;
        NotebookClass laptop13 = laptop8;
        NotebookClass laptop14 = laptop8;
        NotebookClass laptop15 = laptop5;
        NotebookClass laptop16 = laptop6;
        NotebookClass laptop17 = laptop1;
        NotebookClass laptop18 = laptop8;

        
        ArrayList<NotebookClass> notebooks = new ArrayList<>();
        notebooks.add(laptop1);
        notebooks.add(laptop2);
        notebooks.add(laptop3);
        notebooks.add(laptop4);
        notebooks.add(laptop5);
        notebooks.add(laptop6);
        notebooks.add(laptop7);
        notebooks.add(laptop8);
        notebooks.add(laptop9);
        notebooks.add(laptop10);
        notebooks.add(laptop11);
        notebooks.add(laptop12);
        notebooks.add(laptop13);
        notebooks.add(laptop14);
        notebooks.add(laptop15);
        notebooks.add(laptop16);
        notebooks.add(laptop17);
        notebooks.add(laptop18);
        notebooks.add(laptop19);
        notebooks.add(laptop20);

        Set<NotebookClass> uniqueNotebooks = new HashSet<>(notebooks);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("* Добро пожаловать в магазин ноутбуков <<Чем богаты - тем и рады!>> *");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println();
        System.out.printf("У нас в продаже %d ноутбуков.\n", notebooks.size());
        if (notebooks.size() > uniqueNotebooks.size()) {
            System.out.print("Среди них есть одинаковые модели. ");
        }
        System.out.printf("Вы можете выбрать любой ноутбук из %d моделей.\n", uniqueNotebooks.size());
        System.out.println();

        Map<Integer, String> mapFilter = new HashMap<>();
        mapFilter.put(1, "объем оперативной памяти");
        mapFilter.put(2, "объем накопителя");
        mapFilter.put(3, "ОС");
        mapFilter.put(4, "цвет");
        mapFilter.put(5, "диагональ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: 1. объем оперативной памяти: ");
        int ChoosenRAM = sc.nextInt();
        System.out.println("объем накопителя: ");
        int ChoosenDrive = sc.nextInt();
        System.out.println("диагональ");
        double ChoosenDiag = sc.nextDouble();
        int count = 0;
        for (NotebookClass notebook : uniqueNotebooks) {
            if ((notebook.getRam() >= ChoosenRAM) && (notebook.getDriveCap() >= ChoosenDrive) && notebook.getScreenSize() >= ChoosenDiag) {
                count++;
                if (count>0) {
                    System.out.println();
                    System.out.println("Вам подходят следующие модели:");
                }
                System.out.println(notebook.toString());
            }
        }
        sc.close();
        System.out.println();
        System.out.println("Свяжитесь с нашими менеджерами. Они обязательно помогут определиться с покупкой.");
        System.out.println("Телефон для связи: 8-(987)-654-32-10");
    }
}