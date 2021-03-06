/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriooperadores66206;

/**
 *
 * @author starco
 */
public class LaboratorioOperadores66206 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int x = 10;
 int y = 10;
 boolean b = false;
        System.out.println("Valor inicial de x : " + x);
        System.out.println("Valor inicial de y : " + y);
        System.out.println("Valor de x con pre-incremento : " + ++x);
        System.out.println("Valor de y con pos-incremento : " + y++);
        System.out.println("Valor final de x : " + x);
        System.out.println("Valor final de y : " + y);
        
        System.out.println("El negativo de x es : " + -x);
        System.out.println("El complemento de b es : " + !b);
        
        x = 192;
        System.out.println("El numero 192 en binario es : " + Integer.toBinaryString(x));
        System.out.println("El inverso de 192 en binario es : " + Integer.toBinaryString(~x));
        
        x = (int) 5.9999999999;
        System.out.println("Casteando un doble en entero :  " + x);
        
        x = 5;
        y = 5;
        System.out.println("Suma : 5+5 = " + (x+y));
        System.out.println("Resta : 5-5 = " + (x-y));
        System.out.println("Multiplicacion : 5*5 = " +(x*y));
        System.out.println("Division : 5/5 = " +(x/y) );
        System.out.println("Modulo : 5%5 = " + (x%y));
        
        String frase1 = "¡El operador Suma (+)";
        String frase2 = "tambien une cadenas de texto!";
        System.out.println(frase1  + frase2);
        
        x = 7;
        y = 4;
        double z = x / y; 
        System.out.println("La division 7/4 es : " + z);
        
        b = (x>y);
        boolean b2 = (x<y);
        boolean b3 = (x != y);
        System.out.println(" 7> 4 AND 7 < 4 <? : " + (b && b2));
        System.out.println("7 > 4 OR 7 < 4? : " + (b || b2));
        System.out.println("7 > 4 AND 7 != 4? : " + (b && b3));
        System.out.println("7 > 4 OR 7 != 4? : " + (b || b3));
        System.out.println("¿frase1 es un String? " + (frase1 instanceof String));
        
        System.out.println("¡Hemos estado utilizando el operador " + "Asignacion desde el principio ¡Lo habias notado?");
        x = 10;
        y = 10;
        x += 20;
        y = y + 20;
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        
        int byte1 = 51;
        int byte2 = 112;
        System.out.println("El byte1 en binario: "+ Integer.toBinaryString(byte1));
        System.out.println("El byte2 en binario: "+ Integer.toBinaryString(byte2));
        System.out.println("Operacion Bitwise AND: " + Integer.toBinaryString(byte1 & byte2));
        System.out.println("Operacion Bitwise OR: " + Integer.toBinaryString(byte1 | byte2));
        System.out.println("Operacion Bitwise XOR: " +Integer.toBinaryString(byte1 ^ byte2));
        System.out.println("Desplazamiento 3 lugares a la izquierda: " + Integer.toBinaryString(byte1 << 3));
        System.out.println("Desplazamiento 3 lugares a la derecha: " + Integer.toBinaryString(byte1 >> 3));
        System.out.println("Desplazamiento sin signo 3 lugares a la " + "derecha: " + Integer.toBinaryString(byte1 >>> 3));
        
        

        
        
        
        
        
    }
    
}
