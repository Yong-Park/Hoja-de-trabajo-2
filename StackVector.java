import java.util.ArrayList;
public class StackVector<T> implements Stack<T>{
    //arrays
    protected ArrayList<T> stack= new ArrayList<T>();   
    Float conversion;
    
    //asignar los datos a sus stacks respectivos
    public void Push(T dato){
        stack.add(dato);
        System.out.println(stack);
    }
    //eliminar un stack
    public T Pop(){
        //pop de numeros
        T dato = stack.get(Size()-1);
        stack.remove(dato);
        return dato;
    }

    //revisa que esten vacios los stacks
    public boolean Empty(){
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    //regresar el tamano del stack
    public int Size(){
        int longitud = stack.size();
        return longitud;
    }

    //revisar y obtener el dato
    public T Peek(){ 
        
        return null;
    }

}
