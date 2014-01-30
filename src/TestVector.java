/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ValeriaG
 */
public class TestVector {
    
    public static void main (String ars[]){
    int numero=2;
    int nuevo[]= new int [5];
    llenarVector(nuevo);
     System.out.print("vector:"+"\n");
    imprimir(nuevo);
    
    int v[]=addFinal(nuevo, numero);
    System.out.print("\n"+"el vector con la nueva posición es:");
    imprimir(v);
    
    int y[]=addInicio(nuevo, numero);
    System.out.print("\n"+"el vector addInicio es:");
    imprimir(y);
    sort(nuevo);
    System.out.print("\n"+"el vector ordenado ascendentemente:");
    imprimir(nuevo);
     
    
    
}
     public static int[] addFinal(int v[], int numero) {
        int tamaño = v.length + 1;
        int i;
        int nuevo[] = new int[tamaño];

        for (i = 0; i < v.length; i++) {
            nuevo[i] = v[i];

        }
        nuevo[nuevo.length - 1] = numero;
        v=nuevo;

        return v;
    }
     
   public static int[] addInicio (int v[], int numero){
     
      
        int tamaño = v.length + 1;
        int nuevo[] = new int[tamaño];
        nuevo[0] = numero;
        for (int i = 0; i < v.length; i++) {
            nuevo[i + 1] = v[i];

        }
        v = nuevo;
        return v;

    }
   /**
    * Metodo que ordena los elementos del vector ascendentemente
    * @param v: recibe un vector de tipo entero como parámetro 
    */
   public static void sort (int v[]){
       
       int aux=0;
       for (int i=0; i<v.length;i++){
           for (int j=i+1;j<v.length;j++){
               if (v[j]<v[i]){
                   aux=v[i];
                   v[i]=v[j];
                   v[j]=aux;
               }
               
           }
       }
       
   }
      public static  void imprimir (int v[]){
            System.out.print(toString(v));
      }
      
       public static String toString(int v[]){
    
        String msg="";
        for(int dato:v)
            msg+=dato+",";
        return(msg);
    }
       
        public static void llenarVector(int v[]) {

        for (int i = 0; i < v.length; i++) {
            int dato = (int) (Math.random() * 20);
            v[i]=dato;

        }
    }
      
}