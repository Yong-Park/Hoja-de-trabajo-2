public interface Stack<T>{
    void Push(T num);
    //post:Agregar el dato al stack
    T Pop();
    //pre:revisar que no este vacio
    //post: eliminar un elemento del stack
    T Peek();
    //pre: que el stack no este vacio
    //post: muestra el stack mas reciente
    int Size();
    //post: regresa el tamano del stack
    boolean Empty();
    //post: true si esta vacio el stack

}