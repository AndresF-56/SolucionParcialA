package scr;

import java.util.Scanner;

public class Parqueadero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos espacios hay: ");
        int n = sc.nextInt();

        int[] espacio = new int[n];
        String[] tipo = new String[n];
        String[] estado = new String[n];

      
        for (int i = 0; i < n; i++) {
            espacio[i] = i + 1;

            int opcion;
            while (true) {
                System.out.println("Tipo del espacio " + espacio[i]);
                System.out.println("1. Carro");
                System.out.println("2. Moto");
                System.out.print("Elija una opcion: ");
                opcion = sc.nextInt();

                if (opcion == 1 || opcion == 2) break;
                System.out.println("Opcion invalida, intente otra vez");
            }

            if (opcion == 1) {
                tipo[i] = "carro";
            } else {
                tipo[i] = "moto";
            }

            estado[i] = "disponible";
        }

        System.out.print("\nCuantos vehiculos van a ingresar: ");
        int m = sc.nextInt();

        int carros = 0;
        int motos = 0;
        int noEntraron = 0;

        for (int i = 0; i < m; i++) {

            System.out.println("\nVehiculo " + (i + 1));

           
            String placa;
            while (true) {
                System.out.print("Placa (ABC123): ");
                placa = sc.next();

                if (placa.matches("[A-Za-z]{3}[0-9]{3}")) break;
                System.out.println("Placa invalida");
            }

           
            int opVehiculo;
            while (true) {
                System.out.println("Tipo de vehiculo:");
                System.out.println("1. Carro");
                System.out.println("2. Moto");
                System.out.print("Elija una opcion: ");
                opVehiculo = sc.nextInt();

                if (opVehiculo == 1 || opVehiculo == 2) break;
                System.out.println("Opcion invalida");
            }

            String t;
            if (opVehiculo == 1) {
                t = "carro";
            } else {
                t = "moto";
            }

            sc.nextLine();
            System.out.print("Propietario: ");
            String nombre = sc.nextLine();

            boolean encontro = false;

            
            for (int j = 0; j < n; j++) {

                if (estado[j].equals("disponible") && tipo[j].equals(t)) {

                    estado[j] = "ocupado";
                    encontro = true;

                    System.out.println("Le toco el espacio: " + espacio[j]);

                    if (t.equals("carro")) {
                        carros++;
                    } else {
                        motos++;
                    }

                    break;
                }
            }

            if (!encontro) {
                System.out.println("No hay espacio para este vehiculo");
                noEntraron++;
            }
        }

        int libres = 0;

        System.out.println("\n--- RESULTADO FINAL ---");

        for (int i = 0; i < n; i++) {
            System.out.println("Espacio " + espacio[i] + " (" + tipo[i] + "): " + estado[i]);

            if (estado[i].equals("disponible")) {
                libres++;
            }
        }

        System.out.println("\nEspacios libres: " + libres);
        System.out.println("Carros que entraron: " + carros);
        System.out.println("Motos que entraron: " + motos);
        System.out.println("No pudieron entrar: " + noEntraron);

        sc.close();
    }
}