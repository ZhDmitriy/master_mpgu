public class Main {
    
    public static void main(String[] args) {
        // Массивы
        
        // Массив - это структура данных, хранящая элементы одного типа.
        
        // тип[] array = тип[размер массива]; 
        // тип[] array = {var1, var2, var3}; 
        
        int[] array = new int[3]; 
        // [0, 0, 0]
        
        for (int i = 0; i < array.length; i++){
            array[i] = i; // изменяем значения в массиве 
        }
        
        String[] array_str = {"May", "June", "July"}; 
        // ["May", "June", "July"]
        
        //Двумерные массивы 
        
        // тип[][] array = new тип[размер строк][размер столбцов]; 
        // тип[][] array = {
        //     {var1, var2, var3}, 
        //     {var4, var5, var6}
        // };
        
    }
    
}

