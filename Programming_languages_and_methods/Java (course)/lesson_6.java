// исключения

// Типы: 
// checked 
// unchecked 
// errors

public class Main{
    
    public static void main(String[] args) throws FileNotFoundException { // чтобы не прописывать try / catch 
    // в каждом блоке кода, можем пробросить обработку 
    // исключение выше (в самом методе)
        
        String c = "1"; 
        
        try{
            // Код который может вызвать исключение 
            c += "l";
        } catch(Exception e){
            // действие с переменной исключения
            e.getMessage(); // выведем в консоль результат исключения 
        } finally {
            // то, что будет выполнено в любом случае
            System.out.println("Можем например закрывать соединение с базой данных");
        }
        
    }
}

