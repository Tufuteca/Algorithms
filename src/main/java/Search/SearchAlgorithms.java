package Search;

import java.util.Random;
import java.util.Scanner;

public class SearchAlgorithms {

    public static void main(String[] args) {
        SearchAlgorithms searchAlgorithms = new SearchAlgorithms();
        searchAlgorithms.menu();
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Выберите тип генерации");
        System.out.println("1. Случайные числа");
        System.out.println("2. По порядку");
        int secondChoose = scanner.nextInt();
        if(secondChoose == 1){
            System.out.println("Выберите промежуток генерации");
            System.out.print("От:");
            int low = scanner.nextInt();
            System.out.print("До:");
            int high = scanner.nextInt();
            Random random = new Random();
            for(int i = 0; i < n; i++){
                array[i] = random.nextInt((high - low) + 1) + low;
            }
        } else if(secondChoose == 2){
            System.out.println("Выберите начальное значение");
            System.out.print("От:");
            int low = scanner.nextInt();
            for(int i = 0; i < n; i++){
                array[i] = low + i;
            }
        }

        System.out.println("Выберите число для поиска");
        int searchNum = scanner.nextInt();

        System.out.println("Выберите алгоритм поиска");
        System.out.println("1. Линейный поиск");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                int index = linearSearch(array, searchNum);
                if(index != -1) {
                    System.out.println("Число найдено на позиции: " + index);
                } else {
                    System.out.println("Число не найдено");
                }
                break;
            default:
                System.out.println("Неверный выбор");
        }
    }

    public int linearSearch(int[] array, int num){
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                return i;
            }
        }
        return -1;
    }

}
