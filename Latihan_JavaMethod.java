/*
 * To change this license header, choose License Headers in Project .
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 100001000
 */
public class JavaApplication2 {

     static void checkIPK(double ipk) {



   

    if (ipk > 3.5) {

      System.out.println("Caumlaude");



   

    } 

    

    else if (ipk > 3.0) {

      System.out.println("Sangat memuaskan");

    }

    else if (ipk > 2.75){

      System.out.println("Memuaskan");

    }

    else if (ipk > 2.5){

      System.out.println("Cukup");

    }

    else {

      System.out.println("Jelek. kuliah ngapain aja");

    }



  }



  public static void main(String[] args) {

    checkIPK(2.51); //masukan IPK kamu mislakan (2.45 sampai 4.00)

  }

}

