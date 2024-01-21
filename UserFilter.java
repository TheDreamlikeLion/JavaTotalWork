import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserFilter {

    public static void userFilter(Set<NotebookClass> notebooks) {
        HashSet<NotebookClass> notebooksList = new HashSet<NotebookClass>(notebooks);
        Scanner sc = new Scanner(System.in);
        int userChoice = 1;

        Map<String, Double> mapFilter = new HashMap<>();
        mapFilter.put("объем оперативной памяти", 0.0);
        mapFilter.put("размер экрана", 0.0);
        mapFilter.put("объем накопителя", 0.0);

        while (userChoice != 0) {
            System.out.println();
            System.out.println("Выберете <<1>> , чтобы показать список доступных моделей ноутбуков.");
            System.out.println("Выберете <<2>> , чтобы настроить фильтр по параметрам.");
            System.out.println("Выберете <<3>> , чтобы сбросить фильтр.");
            System.out.println("Выберете <<0>> для выхода из программы.");
            System.out.println();
            System.out.println("Сделайте Ваш выбор: <<1>> , <<2>> , <<3>>  или  <<0>> .");
                
            userChoice = sc.nextInt();
            if (userChoice == 1) {
                printFilteredList(mapFilter, notebooksList);
            }
            if (userChoice == 2) {
                System.out.println();
                System.out.println("Данный мастер поможет Вам определиться с выбором среди имеющихся моделей.");
                getUserFilter(mapFilter);
            }
            if (userChoice == 3) {
                mapFilter.put("объем оперативной памяти", 0.0);
                mapFilter.put("размер экрана", 0.0);
                mapFilter.put("объем накопителя", 0.0);
                System.out.println("Все параметры фильтра были обнулены. \nВы можете заново настроить фильтр или вывести полный список доступных моделей.");
            }
            if (userChoice == 0) {
                sc.close();
                return;
            }
        }
        sc.close();
    }

    public static void getUserFilter(Map<String, Double> mapFilter) {
        List<String> keyList = new ArrayList<>(mapFilter.keySet());
        Double userChoice;
        for (String key : keyList) {
            userChoice = chooseParam(key);
            mapFilter.put(key, userChoice);
        }
        System.out.println("Параметры фильтра установлены. Можете вывести список.");
    }

    public static Double chooseParam(String fieldName) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println();
        System.out.printf("Введите минимальное значение для параметра %s.\n", fieldName);
        Double choosenParam = sc2.nextDouble();
        return choosenParam;
    }

    public static void printFilteredList(Map<String, Double> mapFilter, HashSet<NotebookClass> notebooksList) {
        System.out.println("Вам подходят следующие модели:");
        int count = 1;
        for (NotebookClass notebook : notebooksList) {
            if ((notebook.getRam() >= mapFilter.get("объем оперативной памяти").intValue()) && (notebook.getDriveCap() >= (int) mapFilter.get("объем накопителя").intValue()) && notebook.getScreenSize() >= mapFilter.get("размер экрана")) {
                System.out.print(count);
                System.out.println(".");
                System.out.println(notebook.toString());
                count++;
            }
        }
    }
}