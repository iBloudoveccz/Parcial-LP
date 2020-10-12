/*
Carlos Gabriel Rios Caro
3.- Escriba un programa que ponga cero en la primera y última columna de la matriz.
*/
import java.util.*;
public class P_Ej_3{
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
      
      //cambiar primera Columna
      for ( int i=1; i <=n; i++ ){
         for ( int j=1; j <=1; j++ ){
            mat[i][j]=0;
         }
      }
      //cambiar ultima Columna
      for ( int i=1; i <=n; i++ ) {
         for ( int j=n; j <=n; j++ ){
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