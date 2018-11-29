
package procesadordelenguaje;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ProccessorOfLenguage
{
  public static boolean Vocal(char c)
  {
        
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
   
    public static String totalWords(File file) throws IOException{
        
        FileInputStream fs = new FileInputStream(file);
        InputStreamReader entrada = new InputStreamReader(fs);
        BufferedReader lector = new BufferedReader(entrada);
        
       
        int contadorPalabras=0;
        
         String x;
         
        while((x = lector.readLine())!= null){
            
            
            if(!(x.equals(""))){
                
                
                String[] wordList = x.split("\\s+");
                
                
                
                contadorPalabras += wordList.length;
            }
        }
        
        lector.close();
        
        return "El total de palabras en el archivo es: "+file.getName()+": "+contadorPalabras;
    }
    
    public static String NotRepeatedWords(File file)throws IOException{
        
        
          FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        
        String prueba = "";
        
        int contadorPalabras=0;
        
        Map<String, Integer> words = new HashMap<String, Integer>();
        
      
        
        while((prueba = reader.readLine()) != null){
            prueba.replaceAll("[a-zA-Z09]+","");
            
            String[] wordLine = prueba.split("\\s+");
            for(String p: wordLine){
                if(!words.containsKey(p.toLowerCase()))
                    words.put(p.toLowerCase(), 1);
                else
                    words.put(p.toLowerCase(),words.get(p.toLowerCase()) +1);
            }
        }
        
        
        
        
        
        
        
        reader.close();
        
        for(Map.Entry<String, Integer> e : words.entrySet()){
            contadorPalabras += 1;
        }
        
        reader.close();
        
        return "El total de palabras sin repetir en el archivo es igual a "+file.getName()+": "+contadorPalabras;
                
    }
    
     public static String TotalWordWithoutRepeat(File[] files) throws IOException{
        
        int c= 0;
        String line = "";
        Map<String, Integer> words = new HashMap<String, Integer>();
        
        for(int i = 0; i<files.length; i++){
            
            FileInputStream fileStream = new FileInputStream(files[i]);
            
            InputStreamReader input = new InputStreamReader(fileStream);
            
            BufferedReader reader = new BufferedReader(input);
            
            while((line = reader.readLine()) != null){
                line.replaceAll("[a-zA-Z0-9]+","");
                
                String[] wordLine = line.split("\\s+");
                for(String z: wordLine){
                    if(!words.containsKey(z.toLowerCase()))
                        words.put(z.toLowerCase(), 1);
                    else
                        words.put(z.toLowerCase(),words.get(z.toLowerCase()) +1);
                }
            }
            
            reader.close();
        }
        
        for(Map.Entry<String, Integer> e : words.entrySet()){
            
            c += 1;
        }
        String r=Integer.toString(c);
        return r;
    }
    
    public static String totalOfCharacters(File f) throws IOException{
        FileInputStream fs = new FileInputStream(f);
        InputStreamReader input = new InputStreamReader(fs);
        BufferedReader reader = new BufferedReader(input);
        String line;
        int characterCount = 0;
        while((line = reader.readLine()) != null){
            
            if(!(line.equals("")))
            {
                characterCount += line.length();
            }
        }
        
        String resultado = "El total de caracteres en el archivo es igual a "+ f.getName()
                +": "+characterCount;
        
        
        reader.close();
        return resultado;
    }
    
    public static String totalSyllables(File f)throws IOException{
        FileInputStream fs = new FileInputStream(f);
        InputStreamReader input = new InputStreamReader(fs);
        BufferedReader reader = new BufferedReader(input);

        int syllables = 0;
        String line;
        
        while((line = reader.readLine())!=null){
            syllables += SyllablesCount(line);
        }
        
        String total = "Total de silabas en "+f.getName()+
                ": "+syllables;
        reader.close();
        return total;
    }
    
    public static int SyllablesCount(String word){
        int contador = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) 
        {
            if (word.charAt(i) == '\"' || word.charAt(i) == '\'' || word.charAt(i) == '-' || word.charAt(i) == ',' || word.charAt(i) == ')' || word.charAt(i) == '(') {
                word = word.substring(0,i)+word.substring(i+1, word.length());
         }
        }
        boolean previo = false;
        for (int x = 0; x < word.length(); x++) {
            if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u"))
            {
                if (Vocal(word.charAt(x)) && !((word.charAt(x) == 'e') && (x == word.length()-1))) 
                {
                    if (previo == false) {
                        contador++;
                        previo = true;
                    }
                } else {
                    previo = false;
                }
            } else {
                contador++;
                break;
            }
        }
        return contador;
    }
}
    
  
