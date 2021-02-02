public interface Stack<T>{
    void Push(String num);
    //post:Agregar el dato al stack
    void Pop();
    //pre:revisar que no este vacio
    //post: eliminar un elemento del stack
    void Peek();
    //pre: que el stack no este vacio
    //post: muestra el stack mas reciente
    int Size();
    //post: regresa el tamano del stack
    boolean Empty();
    //post: true si esta vacio el stack

}