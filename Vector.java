import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Vector implements StackVector{
    public Vector()throws IOException{
        Read("C:\\Users\\omen\\OneDrive\\바탕 화면\\Datos.txt");
    }

    public void Read(String archivo) throws FileNotFoundException, IOException{
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena=b.readLine())!=null){
            System.out.println(cadena);
        }
        b.close();
        
    }

    public void push(){

    }
    
    public void pop(){

    }

    public void get(){

    }
    public void size(){

    }

    public void peek(){
        
    }
}
