package com.company;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int number = 0;
        while (number < 10) {
            System.out.print(++ number + " ");
        }
        System.out.println();
        for (; number > 0; number --) {
            System.out.print(number + " ");
        }
        System.out.println();

// Задача 2
        int firstFriday = 5;
        for(int fridayReport = firstFriday; fridayReport <= 31; fridayReport += 7) {
            System.out.println("Сегодня пятница " + fridayReport + " , необходимо подготовить отчет");
        }


// Задача 3
        int now = 2022;
        int start = now - 200;
        int finish = now + 100;
        for (int year = start; year <= finish; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

    }
}
