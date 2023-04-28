/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_carmencastillo;
import java.util.Scanner;
/**
 *
 * @author casti
 */

public class Lab2P1_CarmenCastillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        boolean seguir = true;
        while(seguir) {
            System.out.println( " ");
            System.out.println("Menu");
        System.out.println("1. Ejercicio 1. Clasificacion.");
        System.out.println("2. Ejercicio 2. Aproximado.");
        System.out.println("3. Ejercicio 3. MCD.");
        System.out.println("4. Salir");
        System.out.println("Ingrese su opcion: ");
        int opcion = leer.nextInt();
           switch(opcion){
               case 1: 
                   System.out.println("Ingrese el numero que desea evaluar: ");
                   int num1 = leer.nextInt();
                   if (num1 <= 0) {
                        System.out.println("Reingrese un numero mayor a cero: "); 
                        num1 = leer.nextInt();
                   }else{
                       boolean par = true;
                       if (num1 % 2 != 0) {
                           par = false; 
                       }  
                       boolean primo = true;
                       int conta_ciclo = 1;
                       int contador_2 = 0;
                       while (conta_ciclo <= num1) {
                           if (num1 % conta_ciclo == 0){
                             contador_2 ++;
                           }
                            conta_ciclo ++;
                           }
                           if (contador_2 == 2) {
                           }
                           else {
                              primo = false;
                           }
                            
                           if (par == true && primo == true) {
                               System.out.println("El numero es par y primo.");   
                           
                           }else if (par == false && primo == true) {
                               System.out.println("El numero es impar y primo.");
                               
                           }else if (par == true && primo == false) {
                               System.out.println("El numero es par.");
                               
                           }else if (par == false && primo == false) {
                               System.out.println("El numero es impar.");    
                           } 
                   }
            break;
                
               case 2:
                  System.out.println("Ingrese la precisión del cálculo: ");  
                  int pres = leer.nextInt();
                  double limite = 1;
                  double productoria = 1;
                  double resultado = 1;
                  while (limite < (double) pres) {
                      double numerador = 4 * (Math.pow(limite, 2));
                      double denominador = (4 * (Math.pow(limite, 2)))-1;
                      resultado = resultado * (numerador/denominador);
                      limite++; 
                  }
                  double res_final = 2 * resultado;
                  System.out.println("PI: " +res_final);
                   
                   
                   
   
            break; //if case 1
                   
               case 3:
                  System.out.println("Ingrese A: ");  
                  int A_num = leer.nextInt();
                  System.out.println("Ingrese B: ");  
                  int B_num = leer.nextInt();
                  int contador = 1;
                  if (A_num <= 0) {
                    System.out.println("Reingrese un numero mayor al cero: ");  
                    A_num = leer.nextInt();  
                  }else if (B_num <= 0) {
                    System.out.println("Reingrese un numero mayor al cero: ");    
                    B_num = leer.nextInt();   
                  }else{
                      while (A_num != B_num){
                           if (A_num < B_num) {                              
                               B_num = B_num - A_num;
                               
                            }else if (B_num < A_num) {                              
                               A_num = A_num - B_num;
                               
                           }  
                            
                      }
                      System.out.println("El MCD es " + A_num );
                      
                      
                      
                      
                      
                  }
               
               
               
               
           } //fin switch
        
        
            
            
            
        }
        
        
        
        
    }
    
}
