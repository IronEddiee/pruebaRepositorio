public class Actividad6 {
   public static void main (String[] args){
      int nro1, nro2, nro3, producto,  suma;
      System.out.println("Ingrese 3 numeros enteros");
      nro1= Console.readInt();
      nro2= Console.readInt();
      nro3= Console.readInt();
      producto= nro1 * nro2 * nro3;
      suma= nro1 + nro2 + nro3;
      System.out.println("El producto de los 3 numeros es: " + producto);
      System.out.println("La suma de los 3 numeros es: " + suma);
   }
}