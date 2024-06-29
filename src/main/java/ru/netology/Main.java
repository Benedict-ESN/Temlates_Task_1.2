package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Программа запущена");

        System.out.println("Введите размер списка N:");
        int n = scanner.nextInt();
        logger.log("Пользователь ввел размер списка: " + n);

        System.out.println("Введите верхнюю границу значений элементов в списке M:");
        int m = scanner.nextInt();
        logger.log("Пользователь ввел верхнюю границу значений: " + m);

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m + 1));
        }
        logger.log("Список случайных чисел: " + list);

        System.out.println("Введите число для фильтрации списка f:");
        int f = scanner.nextInt();
        logger.log("Пользователь ввел число для фильтрации: " + f);

        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);
        logger.log("Отфильтрованный список: " + filteredList);

        System.out.println("итоговый список: " + filteredList);
        logger.log("Программа завершена");
    }
}