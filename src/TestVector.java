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
    int numero=10;
    int nue[]= {1,2,3,4,5,6,8};
    int nuevo[]=new int [5];
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
    int x[]=addOrdenado(nue, numero);
    System.out.print("\n"+"prueba:");
    imprimir(x);
     
    
    
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
   /**
    * vector de enteros de N elementos, los elementos se encuentran ordenados ascendentemente se debe insertar un dato X en el vector de tal manera que el vector siga quedando ordenado ascendentemente.
    * @param v: vector de tipo entero donde se encuentran ordenados ascendentemente los datos
    * @param dato: dato que se va ingresar al vector de forma ordenanda 
    */
   public static int [] addOrdenado (int v[], int dato){
       int d=0;
       int i=0;
       int nuevo[]=new int [v.length+1];
       int aux=0;
       for (;i<v.length;i++){
         nuevo[i]=v[i];
           if ((dato<v[i])||(dato==v[i])){
               aux=nuevo[i];
               nuevo[i]=dato;
               nuevo[i+1]=aux;
             break;
           }
           else 
               nuevo[nuevo.length-1]=dato;
        
       }
       for (;i<v.length;i++){
           nuevo[i+1]=v[i];
       }
      
       
       return nuevo;
       
   }
      /**
       * Método que muestra el vector lleno
       * @param v: recibe un vector de tipo entero 
       */  
      public static  void imprimir (int v[]){
            System.out.print(toString(v));
      }
      
      /**
       * Método que retona la cadena de caracteres del vector
       * @param v: recibe como parámetro un vector de tipo entero
       * @return la cadena de datos del vector
       */
       public static String toString(int v[]){
    
        String msg="";
        for(int dato:v)
            msg+=dato+",";
        return(msg);
    }
       
       
       /**
        * Método para llenar el vectro con números aleatorios
        * @param v: recibe un vector de tipo entero para ser llenado con los números aleatorios
        */
        public static void llenarVector(int v[]) {

        for (int i = 0; i < v.length; i++) {
            int dato = (int) (Math.random() * 20);
            v[i]=dato;

        }
    }
        
        /**
         * Método que copia los elemento de un vector en otro vector
         * @param v: vector de tipo entero lleno 
         * @param v2: vector de tipo entero que será llenado con los lementos del vector 1
         */
        public static void copiar (int v[], int v2[]){
            
            for (int i=0;i<v.length;i++){
                v2[i]=v[i];
            }
            
        }
      
}