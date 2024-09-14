// Коллекция List

// ArrayList 

import java.util.ArrayList; 

public class Main{
    
    /**
    * Рассмотрим ArrayList
    * 
    */ 
    public static void main(String[] args) { 
        // В основе ArrayList лежит массив Object (те может принимать собственные созданные типы, а не из "коробки")
        ArrayList<String> arraylist_int = new ArrayList<String>(30); // инициализация ArrayList, можно не указывать DataType справа и оставить пустые <>, можно указать длину массива 30
        // Метод add
        arraylist_int.add("1"); // добавление элементов в ArrayList только типа String
        arraylist_int.add("2");
        System.out.println(arraylist_int);
        
        ArrayList arraylist_all = new ArrayList(30); // можем добавить любые элементы в ArrayList не только String 
        arraylist_all.add("1a"); 
        arraylist_all.add("2b"); 
        arraylist_all.add(1); // компилятор не проверяет теперь типы, которые мы добавляем в список
        System.out.println(arraylist_all); 
        
        // Другие методы ArrayList
        for (String s: arraylist_int){ // пробегаемся по элементам массива 
            System.out.println(s + " "); 
        }
        
        System.out.println(arraylist_int.size()); // получаем размер массива
        arraylist_int.set(1, "5"); // изменяем значение под индексом 1
        arraylist_int.remove("5"); // удаляем значение 5, если есть такое значение 
        int index = arraylist_int.indexOf("5"); // получаем индекс под которым находится этот элемент 
        System.out.println(arraylist_int.isEmpty()); // проверяем пустой ли массив 
        System.out.println(arraylist_int.contains("Kolya")); // проверяем содержит ли такое значение, возвращает bool значение 
        
    }
}

