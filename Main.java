import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args){
        
        Calculadora calculadora = new Calculadora();
        ArrayList<String> stack = new ArrayList<String>();

        try{
            File datos = new File("Datos.txt");
            Scanner lectura = new Scanner(datos);

            while(lectura.hasNextLine()){
                String expresion = lectura.nextLine();
                stack.add(expresion);
            }
            lectura.close();
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
            e.printStackTrace();
        }
        //realizar la operacion
        
        for(String linea : stack){
            String resultado = calculadora.Calculo(linea);
            System.out.println("El resultado es: " + resultado);
            System.out.println("____________________________");
        }
      
    }
}
