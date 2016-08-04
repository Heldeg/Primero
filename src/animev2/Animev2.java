/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animev2;

import java.util.Scanner;

/**
 *
 * @author EDER H
 */
public class Animev2 {
    
  

   static void imprimeA(String x[], int n){
       for (int i = 0; i < n; i++) {
           System.out.println(x[i]);
       }
   } 
   static int contador(String x[][], int n, String p){
       int contador = 0;
       for (int i = 0; i < n; i++) {
           if(x[i][1].equals(p)){
               contador++;
           }
       }
       return contador;
   }
   static String [] llenar(String dia [],int n, String a[][],int m,String palabra){
       int j = 0;
       for (int i = 0; i < m; i++) {
           if(a[i][1].equals(palabra)){
               dia[j]=a[i][0];
               j++;
           }
       }
       return dia;
   } 
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int numeroA;
        int l,m,c,ju,v,sa,d;
        System.out.print("Número de anime: ");
        numeroA = s.nextInt();
        System.out.println("");
         String Z [][] = new String [numeroA][2];
         String dia;
         String anime;
         for (int i = 0; i < numeroA; i++) {
             for (int j = 0; j < 2; j++) {
                 if(j==0){
                     System.out.print("Anime: ");
                     anime = s.next();
                     Z[i][j]= anime;
                 }else{
                     System.out.print("Día: ");
                     dia = s.next();
                    Z[i][j] = dia;
                     
                 }
             }
        }
       l=contador(Z, numeroA,"lunes");
       m=contador(Z, numeroA,"martes");
       c=contador(Z, numeroA,"miercoles");
       ju=contador(Z, numeroA,"jueves");
       v=contador(Z, numeroA,"viernes");
       sa=contador(Z, numeroA,"sabado");
       d=contador(Z, numeroA,"domingo");
       String [] L = new String[l];
       String [] M = new String[m];
       String [] C = new String[c];
       String [] JU = new String[ju];
       String [] V= new String[v];
       String [] SA = new String[sa];
       String [] D= new String[d];
       L=llenar(L, l, Z, numeroA, "lunes");
       M=llenar(M, l, Z, numeroA, "martes"); 
       C=llenar(C, l, Z, numeroA, "miercoles");
       JU=llenar(JU, l, Z, numeroA, "jueves");
       V=llenar(V, l, Z, numeroA, "viernes");
       SA=llenar(SA, l, Z, numeroA, "sabado");
       D=llenar(D, l, Z, numeroA, "domingo");
        System.out.println("LUNES");
        imprimeA(L, L.length);
        System.out.println("MARTES");
        imprimeA(M,M.length);
        System.out.println("MIERCOLES");
        imprimeA(C,C.length);
        System.out.println("JUEVES");
        imprimeA(JU,JU.length);
        System.out.println("VIERNES");
        imprimeA(V, V.length);
        System.out.println("SABADO");
        imprimeA(SA, SA.length);
        System.out.println("DOMINGO");
        imprimeA(D,D.length);
    }
    
}
