
package spp.jposadasa.a07;
import java.util.*;
public class SPPJPosadasAA07 {

    public static void main(String[] args) {
        int dec;
        String [] telefono = new String[10];
        Scanner kb = new Scanner (System.in);
        for (int i = 0; i < telefono.length; i++){
            System.out.println("Introduce el telefono " + i);
            telefono[i] = kb.nextLine();
        }
        System.out.println("Porfavor introduzca que numero quiere");
        dec = kb.nextInt();
        if (dec < telefono.length){
        System.out.println("El numero es " + telefono[dec]);
        } else System.out.println("El numero esta fuera del rango.");
    }
    
}
