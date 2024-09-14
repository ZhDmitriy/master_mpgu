/**
 * @author Zhdanov Dmitriy
 * Лабораторная работа №1. Языки и методы программирования.
 * Класс Task1 - содержит пример номера 1 и его решение (реализацию) для переменной a
 * Класс Task2 - содержит пример номера 1 и его решение (реализацию) для переменной b
 * Класс Task3 - содержит пример номера 2 и его решение (реализацию) для переменной a
 * Класс Task4 - содержит пример номера 2 и его решение (реализацию) для переменной b
 */

import java.lang.Math;

/**
 * Класс для решения задачи номер 1 для переменной a
 */
class Task1 {

    public double x;
    public double y;
    public double z;
    private double result_numerator;
    private double result_denominator;

    public Task1(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Вычислитель числителя
     * @return result_numerator - результат вычисления числителя
     */
    public double CalculateNumerator(){
        result_numerator = 3 + Math.pow(Math.E, y - 1);
        return result_numerator;
    }

    /**
     * Вычислитель знаменателя
     * @return result_denominator - результат вычисления знаменателя
     */
    public double CalculateDenominator(){
        result_denominator = 1 + Math.pow(x, 2) * Math.abs(y - Math.tan(z));
        return result_denominator;
    }

    /**
     * Получаем ответ решения задачи Task1 для переменной a
     * @param result_numerator - результат вычисления числителя
     * @param result_denominator - результат вычисления знаменателя
     * @return результат деления числителя на знаменатель задачи Task1, иначе возвращаем 0.0, если произошла
     * арифметическая ошибка
     */
    public double GetAnswer(double result_numerator, double result_denominator){
        try {
            return result_numerator / result_denominator;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception [Task1 a]: " + e.getMessage());
            System.out.println("Numerator: " + result_numerator);
            System.out.println("Denominator: " + result_denominator);
        }
        return 0.0;
    }
}


/**
 * Класс для решения задачи номер 1 для переменной b
 */
class Task2 {

    public double x;
    public double y;

    public Task2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Получаем ответ для решения задачи Task2 для переменной b
     * @return вычисленный пример для номера 1 переменной b
     */
    public double GetAnswer(){
        try{
            return  1 +
                    Math.abs(this.y - this.x) +
                    Math.pow((this.y - this.x), 2)/2 +
                    Math.pow(Math.abs(this.y - this.x), 3)/3;
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception [Task2 b]: " + e.getMessage());
        }
        return 0.0;
    }
}

/**
 * Класс для решения задачи номер 2 для переменой a
 */
class Task3 {

    public double x;
    public double y;

    public Task3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Получаем ответ для решения задачи номер 2 для переменной a
     * @return - результат вычисления номера 2 для переменной a
     */
    public double GetAnswer(){
        try {
            return this.y +
                    this.x / (
                            Math.pow(y, 2) +
                                    Math.abs(
                                            Math.pow(this.x, 2) / (y + Math.pow(this.x, 3) / 3)
                                    )
                    );
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception [Task3 a]: " + e.getMessage());
        }
        return 0.0;
    }
}

/**
 * Класс для решения задачи номер 2 для переменой b
 */
class Task4 {

    public double z;

    public Task4(double z) {
        this.z = z;
    }

    /**
     * Получаем ответ для решения задачи номер 2 для переменной b
     * @return - результат вычисления номера 2 для переменной b
     */
    public double GetAnswer(){
        try {
            return 1 + Math.pow(Math.tan(this.z/2), 2);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception [Task4 b]: " + e.getMessage());
        }
        return 0.0;
    }
}

public class Main {
    public static void main(String[] args){

        // Решение задачи №1 Task1 для переменной a
        Task1 task1 = new Task1(2.7, 0.5, 1);
        System.out.println(
                "Номер 1 и переменная a = " + task1.GetAnswer(
                        task1.CalculateNumerator(),
                        task1.CalculateDenominator()
                )
        );

        // Решение задачи №1 Task2 для переменной b
        Task2 task2 = new Task2(2.7, 0.5);
        System.out.println(
                "Номер 1 и переменная b = " + task2.GetAnswer()
        );

        // Решение задачи №2 Task3 для переменной a
        Task3 task3 = new Task3(2.7, 0.5);
        System.out.println(
                "Номер 2 и переменная a = " + task3.GetAnswer()
        );

        // Решение задачи №2 Task4 для переменной b
        Task4 task4 = new Task4(1);
        System.out.println(
                "Номер 2 и переменная b = " + task4.GetAnswer()
        );

    }
}

