
package procesadordelenguaje;

import java.io.*;

public class UseOfProcessor {
    
    public static void main(String[] args)throws IOException{
        
        ProccessorOfLenguage ultraProcesador = new ProccessorOfLenguage();
        
        File escrito1 = new File("C:\\Users\\aleks\\Desktop\\pd18is5e2\\datasets\\1GVJL.txt");
        
        File escrito2 = new File("C:\\Users\\aleks\\Desktop\\pd18is5e2\\datasets\\2GVJL.txt");
        
        File escrito3 = new File("C:\\Users\\aleks\\Desktop\\pd18is5e2\\datasets\\3GVJL.txt");
        
        System.out.println("    Apartado de palabras repetidas");
        
        System.out.println(ultraProcesador.totalWords(escrito1));
        System.out.println(ultraProcesador.totalWords(escrito2));
        System.out.println(ultraProcesador.totalWords(escrito3));
         System.out.println(" ------------------------------------");
        
        System.out.println("\n Palabras sin repetir");
        
        
        
        System.out.println(ultraProcesador.NotRepeatedWords(escrito1));
        System.out.println(ultraProcesador.NotRepeatedWords(escrito2));
        System.out.println(ultraProcesador.NotRepeatedWords(escrito3));
           System.out.println(" ------------------------------------");
        System.out.println("\n  Sílabas en cada escrito ");
        
        System.out.println(ultraProcesador.totalSyllables(escrito1));
        System.out.println(ultraProcesador.totalSyllables(escrito2));
        System.out.println(ultraProcesador.totalSyllables(escrito3));
        
           System.out.println(" ------------------------------------");
           
        System.out.println("\n  Caracteres");
        
        
        System.out.println(ultraProcesador.totalOfCharacters(escrito1));
        System.out.println(ultraProcesador.totalOfCharacters(escrito2));
        System.out.println(ultraProcesador.totalOfCharacters(escrito3));
           System.out.println(" ------------------------------------");
        
           
        
        File[] escritos ={escrito1, escrito2, escrito3};
        
        
        System.out.println("\n  Palabras sin repetir en "+escritos.length+" escritos ");
         System.out.println(ultraProcesador.TotalWordWithoutRepeat(escritos));
           System.out.println(" ------------------------------------");
       
        
        
        
        
    }
}
