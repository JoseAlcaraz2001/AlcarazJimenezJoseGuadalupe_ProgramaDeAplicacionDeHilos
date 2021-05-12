// Programador: Alcaraz Jimenez Jose Guadalupe

import java.util.Scanner;

public class Main_Array
{
   public static void main(String args[])
   {
      Scanner leer = new Scanner(System.in);
      int n;
      
      System.out.print("\nLongitud del arreglo = ");
      n = leer.nextInt();
      Hilo1 suma;
      Hilo2 sumaC;
      Hilo3 media;
      
      int array[] = new int[n];
      
      for(int x = 0; x < array.length; x++)
         array[x] = (int) (Math.random() * 100) + 1;
      
      System.out.print("\nArreglo = [ ");
      for(int i: array)  
         System.out.print(i + " ");
      System.out.println("]\n");
      
      suma = new Hilo1(array);
      sumaC = new Hilo2(array);
      media = new Hilo3(array);
      
      suma.start();
      sumaC.start();
      media.start();
   }
}