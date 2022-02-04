
import java.util.Scanner;



public class ejercicio2 {  public void funcion2(){
         Scanner entrada = new Scanner(System.in);
     
           
           System.out.print("numero de filas de la matriz: ");
           int filas = entrada.nextInt();
           System.out.print("numero de columnas de la matriz: ");
           int columnas = entrada.nextInt();
           
           int ceros = 0, unos = 0;
           boolean identidad = true;
           
           int matriz[][] = new int[filas][columnas];
           
           for (int i = 0; i < filas; i++) {
               for (int j = 0; j < columnas; j++) {
                   System.out.print("Ingrese un elemento de su matriz: ");
                   matriz[i][j] = entrada.nextInt();
               }
            }
           
           
           System.out.println("\n la matriz es: ");
           for (int i = 0; i < filas; i++) {
               for (int j = 0; j < columnas; j++) {
                   System.out.print( matriz [i][j]+ " ");
               }
               System.out.println(" ");   
            }
           
           
           for (int i = 0; i < filas; i++) {
               for (int j = 0; j < columnas; j++) {
                   if(matriz[i][j] == 0){
                   ceros++;
                   }                  
                   else if(matriz[i][j] == 1){
                   unos++;
                   }
               }
               if(ceros != (columnas-1)|| unos != 1){
                   identidad = false;
               } 
               ceros = 0;
               unos = 0;
           }
           if (identidad == true){
               System.out.println("La matriz es identidad");
           }
           else{
               System.out.println("La matriz no es identidad");
           }
    }
}
    

