import java.util.Scanner; 

// Объекты  

class Person {
    
    // Признаки - поля объекта 
    String name; 
    // int age; 
    // boolean developer; 
    // String[] skills; 
    // Team team; 
    
    // Конструктор класса  
    public Person(String Name){
        this.name = name; 
    }
    
    // Java не может создать объект без конструктора, по умолчанию он пустой
    
    // Модификаторы доступов
    
    // Модификаторы доступа = это область видимости переменных: 
    // public - можем обращаться откуда угодно 
    // private - не можем обратиться к объекту, кроме как из самого класса 
    // protected - имеем доступ только внутри пакета или классов наследников 
    // default - если не указываем явно 
    
    // Создаем метод, void = что метод возвращает 
    public void testProtect(){
        System.out.println("First method!");
        System.out.println("1" + "2"); // Конкатенация строк 
    } 
    
    //public тип имяМетода(){
        // return значение;
    // }
    
    // Метод может ничего не возвращать 
    
}  


public class Main {
    
    public static void main(String[] args) {
        
        // Инициализируем объект
        Person person_1 = new Person("Dima"); 
        
        // Ввод данных (внутри = откуда считывать)
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Введите число: ");
        String value = scanner.nextLine(); 
        
        System.out.println(value); 
        
    }
    
}

