public interface StackVector{
    void push();
    //post:Agregar el dato al stack
    void pop();
    //pre:revisar que no este vacio
    //post: eliminar un elemento del stack
    void get();
    //pre: que el stack no este vacio
    //post: muestra el stack mas reciente
    void size();
    //post: regresa el tamano del stack
    void peek();
    //post: true si esta vacio el stack

}