public class Hilo3 extends Thread
{
   private float suma = 0;
   private int arr[];
   
   public Hilo3(int a[])
   {
      arr = a;
   }
  
   public void run()
   {
      for(int x: arr)
         suma += x;
         
      suma /= (float) arr.length;
      System.out.println("Hilo3: Media Arreglo  = " + suma);
   }
}