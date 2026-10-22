/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AeroCheckIn_SimuladorFacturacion_CargaAerolinea;

import java.util.Scanner;

/**
 *
 * @author bombe
 */
public class AeroCheckIn_SimuladorFacturacion_CargaAerolinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Archivo: Ejercicio AeroCheckIn
        Autor: Andrés Bombela Iyanga Molongua
        Fecha: Málaga, 19/10/2026
        Descripción: Un sistema de facturación de equipaje y control de peso para vuelos comerciales.
        */
        
        //Declaración de variables:
        Scanner sc = new Scanner (System.in);
        double peso_equip = 0d, peso_bodega = 0d, peso_cabina = 0d, alt_equip = 0d, anch_equip = 0d, prof_equip = 0d;
        double cuantia_total = 0d, recargo1 = 0d, recargo2 = 0d, aleatorio = 0d;
        int num_pasajers = 0, eleccion = 0;
        char respuesta;
        
        
        //Cuerpo del programa:
        System.out.println("BIENVENIDO AL SIMULADOR DE FACTURACIÓN");
        System.out.println("======================================");
        
        //Menú redundante
        //Me he apoyado en Ryanair para hacer las tarifas.
        do{
            System.out.println("Qué tipo de tarifa tiene?: ");
            System.out.println("1. Tarifa basic.");
            System.out.println("2. Tarifa regular.");
            System.out.println("3. Tarifa Plus.");
            System.out.println("4. Tarifa Family Plus.");
            System.out.println("5. Flexi Plus.");
            System.out.println("6. Time Saver.");
            System.out.print(">_");
            eleccion = sc.nextInt();
            //En caso de hacer una elección errónea al usuario le salta este mensaje
            if((eleccion != 1)&&(eleccion != 2)&&(eleccion != 3)&&(eleccion != 4)&&(eleccion != 5)&&(eleccion != 6)){
                System.out.println("Elección errónea. Inténtelo de nuevo.");
            }
            System.out.println("");
        } while ((eleccion != 1)&&(eleccion != 2)&&(eleccion != 3)&&(eleccion != 4)&&(eleccion != 5)&&(eleccion != 6));
        
        switch(eleccion){
            case 1:
                System.out.println("Tiene derecho a una maleta gratis de (40 x 30 x 20 cm), que debe guardarse debajo del asiento delantero.");
                break;
            case 2:
                System.out.println("Tiene derecho a dos piezas de equipaje de cabina:");
                System.out.println("1. Una maleta gratis de (40 x 30 x 20 cm) que debe guardarse debajo del asiento delantero.");
                System.out.println("2. Una pieza de equipaje de cabina de 10 kg (55 x 40 x 20 cm) que ha de alojarse en el compartimento superior.");
                break;
            case 3:
                System.out.println("Tiene derecho a dos piezas:");
                System.out.println("1. Una maleta gratis de (40 x 30 x 20 cm) que debe guardarse debajo del asiento delantero.");
                System.out.println("2. Una pieza de equipaje facturado de 20 kg.");
                break;
            case 4:
                System.out.println("Este paquete incluye:");
                System.out.println("1. Una maleta gratis de (40 x 30 x 20 cm) que debe guardarse debajo del asiento delantero.");
                System.out.println("2. Una pieza de equipaje facturado de 10 kg facturado por cada miembro de la familia.");
                System.out.println("3. Una pieza de equipaje facturado de 20 kg para toda la familia.");
                break;
            case 5:
                System.out.println("Esta tarifa incluye 2 piezas de equipaje de cabina:");
                System.out.println("1. Una maleta gratis de (40 x 30 x 20 cm) que debe guardarse debajo del asiento delantero.");
                System.out.println("2. Una pieza de equipaje de cabina de 10 kg (55 x 40 x 20 cm) que ha de alojarse en el compartimento superior.");
                break;
            case 6:
                System.out.println("Esta tarifa incluye 2 piezas de equipaje de cabina:");
                System.out.println("1. Una maleta gratis de (40 x 30 x 20 cm) que debe guardarse debajo del asiento delantero.");
                System.out.println("2. Una pieza de equipaje de cabina de 10 kg (55 x 40 x 20 cm) que ha de alojarse en el compartimento superior.");
                break;
        }
        
        System.out.println("");
        
        //Trabajamos la primera tarifa (Tarifa Basic).
        if(eleccion == 1){
            System.out.println("Indique las medidas de su valija:");
            System.out.print("Altura: ");
            System.out.print(">_");
            alt_equip = sc.nextDouble();
            System.out.print("Anchura: ");
            System.out.print(">_");
            anch_equip = sc.nextDouble();
            System.out.print("Profundidad: ");
            System.out.print(">_");
            prof_equip = sc.nextDouble();
            
            if((alt_equip > 40.0)||(anch_equip > 30.0)||(prof_equip > 20.0)){
                System.out.println("Las medidas de su maleta exceden el límite permitido.");
                System.out.println("Desea pagar una cuota para embarcarla?[S o N]:");
                System.out.print(">_");
                respuesta = sc.next().charAt(0);
                
                while((respuesta != 'S')&&(respuesta != 'N')){
                    System.out.println("Respuesta incorrecta. Solo 'S' o 'N' (en mayúscula).");
                    System.out.print(">_");
                    respuesta = sc.next().charAt(0);
                }
                
                if(respuesta == 'S'){
                    aleatorio = (Math.random()*(35.99-60+1)+35.99);   //En realidad las tarifas de recargo no son aleatorias. Tendré que averiguar en base a qué se aplica un valor u otro.
                    System.out.println("Bien. Se le aplicará un recargo de "+aleatorio+"€.");
                } else if(respuesta == 'N'){
                    System.out.println("Entendido. Deberá dejar su maleta en tierra o conseguir una que cumpla con las medidas (40 x 30 x 20 cm).");
                }
                
            } else {
                System.out.println("Su valija cumple con las medidas permitidas.");
            }
            
        }
    
    }
    
}
