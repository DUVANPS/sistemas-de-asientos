package sistemadeasientos;

import java.util.Scanner;

public class SistemaDeAsientos {

    public static void main(String[] args) {
        //Declaracion de variables
        char asientos[][] = new char[10][10];
        boolean bandera = false;
        Scanner teclado = new Scanner(System.in);
        int fila=0, asiento=0;
        String respuesta;
        String verMapa;
        
        //Cargamos la matriz de asiento

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }

        }
        //Bienvenida al sistema
        System.out.println("-----BIENVENIDOS AL SISTEMA DE RESERVAS-----");
        //reserva de asientos
        while (bandera != true) {
            //Visualizacion de mapa
            System.out.println("¿Desea ver los asientos disponibles? S: Si, cualquier otra letra: No");
            verMapa = teclado.next();
            
            if(verMapa.equalsIgnoreCase("S")){
            dibujarMapa(asientos);    
            }
                
            
            //reserva
            boolean estaOk= false;
                    
            while(estaOk!=true){
              System.out.println("Ingrese fila y asiento a reservar");
            System.out.print("Fila(entre 0 y 9)");
            fila = teclado.nextInt();

            System.out.print("Asiento(entre 0 y 9)");
            asiento = teclado.nextInt();
            if(fila<=9 && fila >=0){
                if(asiento<=9 && asiento >=0){
                    estaOk=true;
                }
            }
            else{
                System.out.println("El numero del asiento no es valido");
            }
            }
            

            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento esta reservado correctamente");

            } else {
                System.out.println("El asiento está ocupado. Por favor elija otro");
            }
            System.out.println("Deseas finalizar la reserva? S: si cualquier techa NO");
            respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("S")) {
                bandera = true;
            }

        }
    }

    static void dibujarMapa(char asientos[][]) {
        for (int f = 0; f < 10; f++) {
            System.out.print(f + " ");

            for (int c = 0; c < 10; c++) {
                System.out.print("[" + asientos[f][c] + "]");

            }
            System.out.println(" ");
        }

    }

}
