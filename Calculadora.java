import java.io.IOException;
public class Calculadora implements CalculadoraGeneral {
    //atributos
    StackVector<String> vector;
    Float num1=0f;
    Float num2=0f;
    boolean calcular=true;
    //correr el stackvector para realizar la lectura del archivo txt
    public Calculadora() throws IOException{
        vector = new StackVector<String>();
    }

    //realizar la operacion
    public void Calculo(){
        for(int i=0;i<vector.Size();i++){
            //asignar los datos de manera individual
            vector.Push(vector.stack.get(i));
        }
        //verificar
        System.out.println(vector.numeros);
        System.out.println(vector.signos);

        //realizar la operacion
        do{
            //el dato 1 ya tiene una operacion
            if(num1!=0f){
                //guardar
                num2=vector.numeros.get(0);

                //eliminar
                vector.Pop(1);

                //operar
                if(vector.signos.get(0).equals("+")){
                    num1=num1+num2;
                    vector.Pop(2);
                }else if(vector.signos.get(0).equals("-")){
                    num1=num1-num2;
                    vector.Pop(2);
                }else if(vector.signos.get(0).equals("*")){
                    num1=num1*num2;
                    vector.Pop(2);
                }else if(vector.signos.get(0).equals("/")){
                    num1=num1/num2;
                    vector.Pop(2);
                }
            //ninguno de los datos tiene un numero
            }else{
                //guardar
                num1=vector.numeros.get(0);
                num2=vector.numeros.get(1);
                //eliminar
                vector.Pop(1);
                vector.Pop(1);
                //operar
                if(vector.signos.get(0).equals("+")){
                    num1=num1+num2;
                    vector.Pop(2);
                }else if(vector.signos.get(0).equals("-")){
                    num1=num1-num2;
                    vector.Pop(2);
                }else if(vector.signos.get(0).equals("*")){
                    num1=num1*num2;
                    vector.Pop(2);
                }else if(vector.signos.get(0).equals("/")){
                    num1=num1/num2;
                    vector.Pop(2);
                }
            }
            //revisar que ya no hayan mas datos ni expresioens
            if(vector.Empty()){
                calcular=false;
            }
        }while(calcular);

        System.out.println("El resultado es " + num1);
    }
    
}
