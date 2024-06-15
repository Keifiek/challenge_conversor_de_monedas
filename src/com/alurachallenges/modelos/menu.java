package com.alurachallenges.modelos;

import java.util.Scanner;

public class menu {
    public static void main() {
        consulta consultamoneda = new consulta();
        historial historial = new historial();
        int opc = 0;
        double cantidad = 0, resultado = 0;
        Scanner in = new Scanner(System.in);


        while (opc!=10){
            System.out.println("***************************************************");
            System.out.println("Bienvenido al conversor de monedas!");
            System.out.println("1) Dolar Estadounidense -> Peso Argentino");
            System.out.println("2) Peso Argentino -> Dolar Estadounidense");
            System.out.println("3) Dolar Estadounidense -> Real Brasileño");
            System.out.println("4) Real Brasileño -> Dolar Estadounidense");
            System.out.println("5) Dolar Estadounidense -> Peso Mexicano");
            System.out.println("6) Peso Mexicano -> Dolar Estadounidense");
            System.out.println("7) Dolar Estadounidense -> Peso Colombiano");
            System.out.println("8) Peso Colombiano -> Dolar Estadounidense");
            System.out.println("9) Mostrar el historial en pantalla");
            System.out.println("10) Salir");
            System.out.println("Ingrese una opcion:");
            System.out.println("***************************************************");
            opc = in.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Ingrese la cantidad a convertir!");
                    cantidad = in.nextDouble();
                    moneda conversion = consultamoneda.consultaMoneda("USD", "ARS");
                    resultado = cantidad * conversion.conversion_rate();
                    System.out.println("El valor de " + cantidad + " [USD] convertido a pesos argentinos es de: " + resultado + " [ARS]");
                    historial.insertarHistorial("El valor de " + cantidad + " [USD] convertido a pesos argentinos es de: " + resultado + " [ARS]");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a convertir!");
                    cantidad = in.nextDouble();
                    conversion = consultamoneda.consultaMoneda("ARS", "USD");
                    resultado = cantidad * conversion.conversion_rate();
                    System.out.println("El valor de " + cantidad + " [ARS] convertido a dolares estadounidenses es de: " + resultado + " [USD]");
                    historial.insertarHistorial("El valor de " + cantidad + " [ARS] convertido a dolares estadounidenses es de: " + resultado + " [USD]");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a convertir!");
                    cantidad = in.nextDouble();
                    conversion = consultamoneda.consultaMoneda("USD", "BRL");
                    resultado = cantidad * conversion.conversion_rate();
                    System.out.println("El valor de " + cantidad + " [USD] convertido a reales brasileños es de: " + resultado + " [BRL]");
                    historial.insertarHistorial("El valor de " + cantidad + " [USD] convertido a reales brasileños es de: " + resultado + " [BRL]");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad a convertir!");
                    cantidad = in.nextDouble();
                    conversion = consultamoneda.consultaMoneda("BRL", "USD");
                    resultado = cantidad * conversion.conversion_rate();
                    System.out.println("El valor de " + cantidad + " [BRL] convertido a dolares estadounidenses es de: " + resultado + " [USD]");
                    historial.insertarHistorial("El valor de " + cantidad + " [BRL] convertido a dolares estadounidenses es de: " + resultado + " [USD]");
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad a convertir!");
                    cantidad = in.nextDouble();
                    conversion = consultamoneda.consultaMoneda("USD", "MXN");
                    resultado = cantidad * conversion.conversion_rate();
                    System.out.println("El valor de " + cantidad + " [USD] convertido a pesos mexicanos es de: " + resultado + " [MXN]");
                    historial.insertarHistorial("El valor de " + cantidad + " [USD] convertido a pesos mexicanos es de: " + resultado + " [MXN]");
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad a convertir!");
                    cantidad = in.nextDouble();
                    conversion = consultamoneda.consultaMoneda("MXN", "USD");
                    resultado = cantidad * conversion.conversion_rate();
                    System.out.println("El valor de " + cantidad + " [MXN] convertido a dolares estadounidenses es de: " + resultado + " [USD]");
                    historial.insertarHistorial("El valor de " + cantidad + " [MXN] convertido a dolares estadounidenses es de: " + resultado + " [USD]");
                    break;
                case 7:
                    System.out.println("Ingrese la cantidad a convertir!");
                    cantidad = in.nextDouble();
                    conversion = consultamoneda.consultaMoneda("USD", "COP");
                    resultado = cantidad * conversion.conversion_rate();
                    System.out.println("El valor de " + cantidad + " [USD] convertido a pesos colombianos es de: " + resultado + " [COP]");
                    historial.insertarHistorial("El valor de " + cantidad + " [USD] convertido a pesos colombianos es de: " + resultado + " [COP]");
                    break;
                case 8:
                    System.out.println("Ingrese la cantidad a convertir!");
                    cantidad = in.nextDouble();
                    conversion = consultamoneda.consultaMoneda("COP", "USD");
                    resultado = cantidad * conversion.conversion_rate();
                    System.out.println("El valor de " + cantidad + " [COP] convertido a dolares estadounidenses es de: " + resultado + " [USD]");
                    historial.insertarHistorial("El valor de " + cantidad + " [COP] convertido a dolares estadounidenses es de: " + resultado + " [USD]");
                    break;
                case 9:
                    historial.mostrarHistorial();
                    break;
                case 10:
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("Opcion invalida!");
                    break;
            }
        }
    }
}
//moneda prueba = consultamoneda.consultaMoneda("USD", "MXN");
//System.out.println(prueba);