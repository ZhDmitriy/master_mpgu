public class Main
{
    public static void main(String[] args) {
        
        // Условные операторы
        int x = 5; 
        
        if (x == 6) {
            System.out.println("x = 5");
        } else if (x == 7) {
            System.out.println("x = 7"); 
        } else {
            System.out.println("x != 7 and x != 5");
        }
        
        switch (x) {
            case 5: 
                System.out.println("5"); 
                break; 
            case 7: 
                System.out.println("7");
                break; 
            default: 
                System.out.println("Test switch case");
                break; 
        };
        
        // Тернарный оператор 
        int age = 20; 
        
        String info = age >= 18 ? "adult": "teen"; 
        System.out.println(info); 
        
        //  Цикл for 
        for (int i = 0; i < 5; i++){
            System.out.println(i+1);
        }
        
        // Цикл while
        int y = 0; 
        
        while (y < 5) {
            y++; 
            System.out.println("while loop"); 
            System.out.println(y); 
        }
        
        // Цикл foreach
        int[] array = new int[10]; // По умолчанию в массиве содержится 10 нулей 
        String[] strArray = new String[5]; // По умолчанию содержится 5 значений null
        
        // null = 0 для ссылочных типов данных 
        
        for (int number: array) {
            System.out.println(number); 
        };
        
        for (String str: strArray){
            System.out.println(str); 
        }
    }
}

