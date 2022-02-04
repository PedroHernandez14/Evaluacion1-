
import java.util.Scanner;


public class Ejercicio1 {public static void main(String[] args) {

        int matriz_uno[][] = new int[3][3];
        int matriz_dos[][] = new int[3][3];
        int matriz_tres[][] = new int[3][3];
        int matriz_resultante[][] = new int[3][3];
        int matriz_resultante2[][] = new int[3][3];

        
    for (int[] matriz_uno1 : matriz_uno) {
        for (int j = 0; j < matriz_uno.length; j++) {
            matriz_uno1[j] = (int) (Math.random() * 5);
        }
    }

        
    for (int[] matriz_do : matriz_dos) {
        for (int j = 0; j < matriz_dos.length; j++) {
            matriz_do[j] = (int) (Math.random() * 5);
        }
    }
        for (int i = 0; i < matriz_tres.length; i++) {
            for (int j = 0; j < matriz_tres.length; j++) {
                matriz_tres[i][j] = (int) (Math.random() * 5);
            }
        }
            
            
            for (int i = 0; i < matriz_uno.length; i++) {
                for (int j = 0; j < matriz_dos.length; j++) {
                    matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
                }
            
        }

        
        for (int i = 0; i < matriz_uno.length; i++) {

            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.print("[ " + matriz_uno[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  +   ");
            } else {
                System.out.print("      ");
            }                        

            for (int j = 0; j < matriz_dos.length; j++) {
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }
            
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            
            for (int j = 0; j < matriz_resultante.length; j++) {
                System.out.print("[ " + matriz_resultante[i][j] + " ]");
            }
        
            System.out.println(""
            		+ "");
        }
    for (int[] matriz_resultante1 : matriz_resultante) {
            for (var matriz_tre : matriz_tres) {
            }
        
        if (matriz_resultante2[0][0] == 0) {
            int temporal = (matriz_resultante[0][0] * matriz_tres[0][0])
                    + (matriz_resultante[0][1] * matriz_tres[1][0])
                    + (matriz_resultante[0][2] * matriz_tres[2][0]);
            
            matriz_resultante2[0][0] = temporal;
            
        } else if (matriz_resultante2[1][0] == 0) {
            int temporal = (matriz_resultante[1][0] * matriz_tres[0][0])
                    + (matriz_resultante[1][1] * matriz_tres[1][0])
                    + (matriz_resultante[1][2] * matriz_tres[2][0]);
            
            matriz_resultante2[1][0] = temporal;
            
        } else if (matriz_resultante2[0][1] == 0) {
            int temporal = (matriz_resultante[0][0] * matriz_dos[0][1])
                    + (matriz_resultante[0][1] * matriz_dos[1][1])
                    + (matriz_resultante[0][2] * matriz_dos[2][1]);
            
            matriz_resultante[0][1] = temporal;
            
        } else if (matriz_resultante2[1][1] == 0) {
            int temporal = (matriz_resultante[1][0] * matriz_tres[0][1])
                    + (matriz_resultante[1][1] * matriz_tres[1][1])
                    + (matriz_resultante[1][2] * matriz_tres[2][1]);
            
            matriz_resultante2[1][1] = temporal;
        }
    }
            for (int i = 0; i < 3; i++) {

                if (i < 2) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("[ " + matriz_resultante[i][j] + " ]");
                    }
                    if (i == 1) {
                        System.out.print("   x   ");
                    } else {
                        System.out.print("       ");
                    }
                } else {
                    System.out.print("                      ");
                }

                for (int j = 0; j < 3; j++) {
                    System.out.print("[ " + matriz_tres[i][j] + " ]");
                }
                if (i == 1) {
                    System.out.print("   =   ");
                } else {
                    System.out.print("       ");
                }
                
                if(i < 2){
                    for (int j = 0; j < 3; j++) {
                        System.out.print("[ " + matriz_resultante2[i][j] + " ]");
                    }
                }
                System.out.println("");
            }
            }
            
        public class ejercicio2 {  public void funcion3(){
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
        }


    

