 import java.util.Random;
 

 public class Ejercicio520

 {         

 public static void main(String args[])
 {  
 
 Random aleatorios = new Random();
 
 int Tam = 10;
 int Esc = 10;
 
 int Num;

 for ( int i = 1; i <= Tam; i++)
 {   
 Num =  1 + aleatorios.nextInt(Esc);
 
 System.out.printf("%3d", Num);

 System.out.print( (0 == i % 5)? "\n":"" );
 
 }
  
 }  
 }   