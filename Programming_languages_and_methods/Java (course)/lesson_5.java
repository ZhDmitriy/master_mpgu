// ключевое слово this, static, final 

class Person {
    public static String name; // принадлежит всем экземплярам класса, которая будет являться общей переменной 
    
    public void setName(String name) {
        this.name = name; // переменная принадлежит экзмепляру класса    
    }
}


// класс родитель
public class Animal {
    
    protected String name; 
    protected int age; 
     
    public Animal(String name, int age) {
        this.name = name; 
        this.age = age; 
    }
    
    public void makeSound(){
        System.out.println("Some sound!"); 
    }
    
    public void displayInfo(){
        System.out.println("Name: " + "Age: " + age); 
    }   
    
}


// наследование 
public class Dog extends Animal {
    
    private String color; // собственная переменная класса Dog
    
    public Dog(String name, int age, String color) {
        super(name, age); // вызываем конструктор класса родителя, чтобы определить переменные name и age
        this.color = color; 
    }
    
    @Override // переопределение метода через аннотацию  
    public void makeSound(){
        System.out.println("Gaf!")
    }
    
    public void overload() {
        System.out.println("Empty!")
    }
    
    // перегрузка метода (два одинаковых метода, но с разными параметрами и функционалом) 
    public void overload(String name){
        System.out.println("Name: " + name); 
    }
    
}


public class Main{
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
}

