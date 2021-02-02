import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class StackVector<T> implements Stack<T>{
    //arrays
    protected List<String> stack = new ArrayList<String>();
    protected ArrayList<String> stacks= new ArrayList<String>();  
    protected ArrayList<Float> numeros= new ArrayList<Float>();  

    //obtener la ruta 
    public StackVector()throws IOException{
        Read("Datos.txt");
    }
    
    //lectura del archivo txt
    public void Read(String archivo) throws FileNotFoundException, IOException{
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena=b.readLine())!=null){
            //separarlo
            String str[] = cadena.split(" ");
            //guardar la lista en un arraylist
            stack = Arrays.asList(str);
        }
        b.close();
        //para guardarlo en un arraylist
        for(int i=0;i<stack.size();i++){
            stacks.add(stack.get(i));
        }
    }
    //asignar los datos a sus stacks respectivos
    public void Push(String dato){
        //si es algun dato ingresarlo al array de datos
        Float conversion = Float.parseFloat(dato);
        numeros.add(conversion);
        
    }
    //eliminar un stack
    public void Pop(){
        //pop de numeros
        numeros.remove(Size()-1);
    }
    
    public void Remove(){
        stacks.remove(0);
    }

    //revisa que esten vacios los stacks
    public boolean Empty(){
        if(stacks.size()==0){
            return true;
        }
        return false;
    }
    //regresar el tamano del stack
    public int Size(){
        int tamano=numeros.size();
        return tamano;
    }

    public void Peek(){

    }
}
