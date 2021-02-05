
import java.util.*;

public class Calculadora implements CalculadoraGeneral {
    //atributos
    Float num1=0f;
    Float num2=0f;
    String operacion;
    Float resultado = 0f;
    
    /** 
     * @param linea
     * @return String
     */
    //realizar la operacion
    public String Calculo(String linea){
        //defnir clases
        Stack<Float> numeros= new StackVector<Float>();
        Stack<String> signos = new StackVector<String>();
        
        //crear el vector
        Vector<String> vec = new Vector<String>();
        //separarlo
        String[] vect = linea.split(" ");
        //agregrlo al vector 
        for(int i=0; i<vect.length;i++){
            vec.add(vect[i]);
        }

        //guardar segun el tipo de dato que sea
        for(int i=0; i<vec.size();i++){
            try{
                float numero = Float.parseFloat(vec.get(i));
                numeros.Push(numero);
            }catch(Exception e){
                signos.Push(vec.get(i));
                //revisar si hay alguna operacion despues de dos datos numericos
                if(numeros.Size()>=2){
                    num1 = numeros.Pop();
                    num2 = numeros.Pop();
                    operacion = signos.Pop();
                    //operar segun el signo
                    if(operacion.equals("+")){
                    resultado = num1 + num2;
                    }else if(operacion.equals("-")){
                        resultado = num2 - num1; 
                    }else if(operacion.equals("/")){
                        resultado = num2 / num1;
                    }else if(operacion.equals("*")){
                        resultado = num1 * num2;
                    }
                    //agregar el resultado al stack
                    numeros.Push(resultado);
                }
            }
        }
        
        //resultado
        if(!signos.Empty()){
            return "Este no se puede operar";
        }
        String resultadoTexto = String.valueOf(resultado);
        return resultadoTexto;
    }
    
}
