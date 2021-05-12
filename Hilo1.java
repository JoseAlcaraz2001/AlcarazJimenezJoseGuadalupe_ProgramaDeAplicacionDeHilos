public class Hilo1 extends Thread
{
   private int suma = 0;
   private int arr[];
   
   public Hilo1(int a[])
   {
      arr = a;
   }
  
   public void run()
   {
      for(int x: arr)
         suma += x;
      System.out.println("Hilo1: Suma Arreglo   = " + suma);
   }
}