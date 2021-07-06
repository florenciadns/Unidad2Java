/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaunidad2;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class usuarioU2 {
  public static void main(String[] args)
  { 
    Scanner sc = new Scanner(System.in);
       /* parte scanner
    String nombre;
    String apellido;
    int edad;
    String hobbie;
    String editor;
    String sistemaoperativo;
*/
     
   System.out.println("Ingrese Nombre:");
   String nombre=sc.nextLine();
   
   System.out.println("Ingrese Apellido:");
   String apellido=sc.nextLine();
   
   System.out.println("Ingrese la edad:");
   int edad = sc.nextInt();
   
   System.out.println("Ingrese su hobbie:");
   String hobbie = sc.nextLine();
   
   System.out.println("Ingrese el nombre su editor de codigo preferido:");
   String editor = sc.nextLine();
   
   System.out.println("Ingrese el nombre del sistema operatio de preferencia:");
   String sistoperativo=sc.nextLine();
   
    System.out.println("Hola " + nombre + apellido + " Sus datos ingresados son: " + "edad" + (edad) + " su hobbie  es: " + hobbie + "su editor de codigo preferido es:" + editor + "su sistema operativo preferido es:" + sistoperativo + "Bienvenido");
    
  }
}
  
    
    
