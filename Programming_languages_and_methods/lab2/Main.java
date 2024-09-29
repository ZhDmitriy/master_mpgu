/**
 * @author Zhdanov Dmitriy
 * Лабораторная работа №2. Итерационные и рекурсивные алгоритмы.
 * GoldenRatio - класс, который содержит решение задачи номер 1.
 * RecursionF - класс, который содержит решение задачи номер 2.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;


/**
 * Рекурсивная задача поиска "золотого сечения"
 */
class GoldenRatio {

    int n;
    ArrayList<Float> arrayFib = new ArrayList<>(n);

    GoldenRatio(int n) {
        this.n = n;
    }

    public float fibonachi(int n){
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        } else {
            return fibonachi(n-1) + fibonachi(n-2);
        }
    }

}


/**
 * Рекурсивная задача поиска значение функции x^n / n!
 */
class RecursionF{

    public float factorial(int m){
        if (m < 0){
            System.out.println("m < 0 - введите положительное m");
        }else {
            if (m == 0) {
                return 1;
            } else {
                return m * factorial(m - 1);
            }
        }
        return 0;
    }

    public float f(float x, int n){
        return (float) (Math.pow(x, n) / this.factorial(n));
    }

}

public class Main {
    public static void main(String[] args) {

        // Решение задачи золотого сечения №1
        System.out.println("Задача №1");
        Scanner console = new Scanner(System.in);
        System.out.println("n = ");
        int n = Integer.parseInt(console.nextLine());
        GoldenRatio golden_ration = new GoldenRatio(n);
        for (int fib_num = 0; fib_num < n; fib_num++){
            golden_ration.arrayFib.add(golden_ration.fibonachi(fib_num));
        }
        System.out.println("Ряд Фибоначчи = " + golden_ration.arrayFib);
        if (golden_ration.arrayFib.size() >= 22){
            // начиная с n = 21 до максимума
            for (int fib_num = 21; fib_num < golden_ration.arrayFib.size()-1; fib_num++){
                System.out.println(
                        "F(" + fib_num + ") = " + golden_ration.arrayFib.get(fib_num+1) / golden_ration.arrayFib.get(fib_num)
                );
            }
        }

        System.out.println("\n");

        // Решение рекурсивной задачи №2
        System.out.println("Задача №2");
        RecursionF recursionF = new RecursionF();
        Scanner sc = new Scanner(System.in);
        System.out.println("x = ");
        float x = sc.nextFloat();
        System.out.println("m = ");
        try {
            int m = sc.nextInt();
            System.out.println("Решение = " + recursionF.f(x, m));
        }catch (Exception e){
            System.out.println("Введите целое число m");
        }
    }
}