public class Actividad6b {
   public static void main (String[] args){
      int num;
      int cont= 1;
      int producto= 1;
      int suma= 0;
      while (cont <= 3){
         System.out.println("Ingrese un numero entero");
         num= Console.readInt();
         suma= suma + num;
         producto= producto * num;
         cont= cont + 1;
      }
      System.out.println("La suma de los 3 numeros enteros es: " + suma);
      System.out.println("El producto de los 3 numeros es: " +  producto);
   }
}