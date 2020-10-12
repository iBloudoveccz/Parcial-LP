/*
Carlos Gabriel Rios Caro
1.- Escriba un programa que ponga ceros en ambas diagonales de una matriz.
*/
import java.util.*;
public class P_Ej_1{
   public static void main(String[] args){
   
      int[][] mat=new int[100][100];
      int n;
      Scanner sc=new Scanner(System.in);
            
      System.out.println("numero de la matriz");
      n=sc.nextInt();
      
      for(int i = 1; i <= n; i++){
         System.out.println("ingresar fila #"+i);     
         for(int j = 1; j <= n; j++){
            mat[i][j]=sc.nextInt();
         }
      }
      System.out.println("");
      //mostrar matriz
      System.out.println("Matriz Original");
      for ( int i=1; i <=n; i++ ) {
         for ( int j=1; j <=n; j++ ){
            System.out.print(mat[i][j]+" ");
         }
         System.out.println("");
      }
      System.out.println("");
      
      //cambiar diagonal principal
      for ( int i=1; i <=n; i++ ) {
         for ( int j=1; j <=n; j++ ){
            if (i==j){
               mat[i][j]=0;
            }
         }
      }
      //cambiar diagonal secundaria
      for ( int i=1; i <=n; i++ ){
         for ( int j=1; j <=n; j++ ){
            if (i+j==n+1){
               mat[i][j]=0;
            }
         }
      }
      //mostrar cambio
      System.out.println("Matriz Cambiada");
      for ( int i=1; i <=n; i++ ) {
         for ( int j=1; j <=n; j++ ){
            System.out.print(mat[i][j]+" ");
         }
         System.out.println("");
      }
   }
}