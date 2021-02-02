import java.io.IOException;
public class Calculadora implements CalculadoraGeneral {
    //atributos
    StackVector<String> vector;
    Float num1=0f;
    Float num2=0f;
    Float resultado = 0f;
    boolean calcular=true;
    int dato = 0;
    int tamano = 0;
    //correr el stackvector para realizar la lectura del archivo txt
    public Calculadora() throws IOException{
        vector = new StackVector<String>();
    }

    //realizar la operacion
    public void Calculo(){
        //mostrar el stack
        System.out.println("stack general " + vector.stack);
        //realizar la operacion
        try{
            do{
                //comenzar a guardar datos en el stack
                if(vector.stack.get(dato).equals("+")){
                    //guardar dato
                    tamano = vector.Size();
                    num1= vector.numeros.get(tamano-1);
                    vector.Pop();
                    tamano = vector.Size();
                    num2=vector.numeros.get(tamano-1);
                    vector.Pop();

                    //realizar la suma
                    resultado = num1 + num2;
                    System.out.println(num1+ " + " +num2 + "= " + resultado);
                    //agregarlo al stack
                    String res =String.valueOf(resultado);
                    vector.Push(res);
                    vector.Remove();
                }else if(vector.stack.get(dato).equals("-")){
                    //guardar dato
                    tamano = vector.Size();
                    num1= vector.numeros.get(tamano-1);
                    vector.Pop();
                    tamano = vector.Size();
                    num2=vector.numeros.get(tamano-1);
                    vector.Pop();

                    //realizar la resta
                    resultado = num1 - num2;
                    System.out.println(num1+ " - " +num2 + "= " + resultado);
                    //agregarlo al stack
                    String res =String.valueOf(resultado);
                    vector.Push(res);
                    vector.Remove();
                }else if(vector.stack.get(dato).equals("*")){
                    //guardar dato
                    tamano = vector.Size();
                    num1= vector.numeros.get(tamano-1);
                    vector.Pop();
                    tamano = vector.Size();
                    num2=vector.numeros.get(tamano-1);
                    vector.Pop();

                    //realizar la multiplicacion
                    resultado = num1 * num2;
                    System.out.println(num1+ " * " +num2 + "= " + resultado);
                    //agregarlo al stack
                    String res =String.valueOf(resultado);
                    vector.Push(res);
                    vector.Remove();
                }else if(vector.stack.get(dato).equals("/")){
                    //guardar dato
                    tamano = vector.Size();
                    num1= vector.numeros.get(tamano-1);
                    vector.Pop();
                    tamano = vector.Size();
                    num2=vector.numeros.get(tamano-1);
                    vector.Pop();

                    //realizar la division
                    resultado = num1 / num2;
                    System.out.println(num1+ " / " +num2 + "= " + resultado);
                    //agregarlo al stack
                    String res =String.valueOf(resultado);
                    vector.Push(res);
                    vector.Remove();
                }else{
                    //si es un numero agregarlo al stack
                    vector.Push(vector.stack.get(dato));
                    vector.Remove();
                }
                                
                //sumar para segir con la lectura de datos
                dato++;
                
                //verificar
                System.out.println("Stack " + vector.numeros);
                //revisar que ya no hayan mas datos ni expresioens
                if(vector.Empty()){
                    calcular=false;
                }
            }while(calcular);

            System.out.println("El resultado es " + vector.numeros.get((vector.Size()-1)));
        }catch(Exception e){
            System.out.println("No se puede realizar esta operacion");
        }

    }
    
}
