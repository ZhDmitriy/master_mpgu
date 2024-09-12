//Основной класс программы 
public class Main
{
    
    //Модификатор доступа -> тип переменной -> наименование переменной -> значение
    public static int test_first = 1000;
    public static String test_second = "Hello world!";

    //Точка входа в программу
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(test_first);
        System.out.println(test_second);
        
        //Арифметические операторы 
        int a = 1; 
        int b = 2;
        int c = a + b; 
        double r = (double) a / b; //Явное приведение типов 
        a++; // a = a + 1  
        
        System.out.println(c);
        System.out.println(r);
        System.out.println(a);
        
        // && и 
        // || или 
        
    }
}
