public class tp1 {
   public static void main (String[] args){
     //actividad 4
     int nro1, nro2, nro3;
     System.out.println("Ingrese 3 numeros enteros");
     nro1 = Console.readInt();     
     nro2 = Console.readInt(); 
     nro3 = Console.readInt(); 
     if (nro1 > nro2 & nro1 > nro3){
      System.out.println("El numero mayor es: " + nro1);
      }
     else{
      if (nro2 > nro1 & nro2 > nro3){
         System.out.println("El numero mayor es: " + nro2);
         }
      else{
         System.out.println("El numero mayor es: " + nro3);
         }
      }
   }
}