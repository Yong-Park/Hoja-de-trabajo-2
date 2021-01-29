import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class StackVector<T> implements Stack<T>{
    //array
    private ArrayList<Character> stack = new ArrayList<Character>();
    //obtener la ruta 
    public StackVector()throws IOException{
        Read("C:\\Users\\omen\\OneDrive\\바탕 화면\\Datos.txt");
    }
    //lectura del archivo txt
    public void Read(String archivo) throws FileNotFoundException, IOException{
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena=b.readLine())!=null){
            System.out.println(cadena);
            //separarlo
            String str[] = cadena.split(" ");
            List<String> stack = new ArrayList<String>();
            //guardar la lista
            stack = Arrays.asList(str);
            System.out.println(stack);
        }
        b.close();
    }

    public void Push(T num){

    }
    
    public void Pop(){

    }

    public boolean Empty(){
        return true;
    }
    public int Size(){
        return 1;
    }

    public void Peek(){
        
    }
}
