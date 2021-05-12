public class Hilo2 extends Thread
{
   private int suma = 0;
   private int arr[];
   
   public Hilo2(int a[])
   {
      arr = a;
   }
  
   public void run()
   {
      for(int x: arr)
         suma += Math.pow(x, 2);
      
      System.out.println("Hilo2: Suma Cuadrados = " + suma);
   }
}