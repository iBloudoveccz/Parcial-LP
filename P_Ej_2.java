/*
Carlos Gabriel Rios Caro
2.- Escriba un programa que ponga cero en la primera y última fila de matriz
*/
import java.util.*;
public class P_Ej_2{
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
      
      //cambiar primera fila
      for ( int i=1; i <=1; i++ ){
         for ( int j=1; j <=n; j++ ){
            mat[i][j]=0;
         }
      }
      //cambiar ultima fila
      for ( int i=n; i <=n; i++ ) {
         for ( int j=1; j <=n; j++ ){
            mat[i][j]=0;
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