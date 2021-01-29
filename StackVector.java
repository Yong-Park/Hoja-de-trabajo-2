import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class StackVector<T> implements Stack<T>{
    //arrays
    public List<String> stack = new ArrayList<String>();
    protected ArrayList<Float> numeros= new ArrayList<Float>();  
    protected ArrayList<String> signos= new ArrayList<String>(); 

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
            //guardar la lista en un arraylist
            stack = Arrays.asList(str);
            System.out.println(stack);
        }
        b.close();
    }
    //asignar los datos a sus stacks respectivos
    public void Push(String dato){
        if(dato.equals("+")){
            signos.add(dato);
        }else if(dato.equals("-")){
            signos.add(dato);
        }else if(dato.equals("*")){
            signos.add(dato);
        }else if(dato.equals("/")){
            signos.add(dato);
        //si es algun dato ingresarlo al array de datos
        }else{
            Float conversion = Float.parseFloat(dato);
            numeros.add(conversion);
        }
    }
    //eliminar un stack
    public void Pop(int a){
        //pop de numeros
        if(a==1){
        numeros.remove(0);
        //pop de signos
        }else{
            signos.remove(0);
        }
    }

    public boolean Empty(){
        if(numeros.size()==0 && signos.size()==0){
            return true;
        }
        return false;
    }
    //regresar el tamano del stack
    public int Size(){
        int tamano=stack.size();
        return tamano;
    }

    public void Peek(){
        
    }
}
