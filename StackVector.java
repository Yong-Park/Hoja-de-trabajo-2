import java.util.ArrayList;
public class StackVector<T> implements Stack<T>{
    //arrays
    protected ArrayList<T> data= new ArrayList<T>();   
    Float conversion;
    
    
    /** 
     * @param dato
     */
    //asignar los datos a sus stacks respectivos
    public void Push(T dato){
        data.add(dato);
        System.out.println(data);
    }
    
    /** 
     * @return T
     */
    //eliminar un stack
    public T Pop(){
        //pop de numeros
        T dato = data.get(Size()-1);
        data.remove(dato);
        return dato;
    }

    
    /** 
     * @return boolean
     */
    //revisa que esten vacios los stacks
    public boolean Empty(){
        if(data.isEmpty()){
            return true;
        }
        return false;
    }
    
    /** 
     * @return int
     */
    //regresar el tamano del stack
    public int Size(){
        int longitud = data.size();
        return longitud;
    }

    
    /** 
     * @return T
     */
    //revisar y obtener el dato
    public T Peek(){ 
        
        return null;
    }

}
