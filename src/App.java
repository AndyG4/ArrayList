

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayListDoble ald = new ArrayListDoble();
        
            Integer i = 0;
            for(char j = 'A'; j<'z';j++){
                ald.add(i, Character.toString(j));
                i++;
            }
        
        ald.setValor(56, "Valor");
        ald.imprimir();
        ald.buscarNombre("Valor");
        

    }
}
class ArrayListDoble{
    String string[];
    Integer integer[];
    Integer size = 0;

    ArrayListDoble(){
        string=new String[5];
        integer=new Integer[string.length];
        
    }

    void add(Integer key, String nombre){
        if(size==integer.length){
             String valor1 [] = new String[integer.length+((integer.length)/2)];
            Integer valor2 [] = new Integer[integer.length+((integer.length)/2)];
            for(int i = 0; i<integer.length;i++){
                valor1[i]=string[i];
                valor2[i]=integer[i];
            }
            string=valor1;
            integer=valor2;
        }
            string[size]=nombre;
            integer[size]=key;
            size++;
        
    }
    void imprimir(){
        for(int i=0;i<integer.length;i++){
            System.out.println("llave: "+integer[i]+", nombre: "+string[i]);
        }

    }
    void eliminar(int ind){
        string[ind]=null;
        integer[ind]=null;
    }
    void recorrerDerecha(){
        for(int i =0; i<integer.length-1;i++){
            for(int j = 0;j<integer.length-i-1;j++){
                if(string[j]==null && integer[j]==null){
                    string[j]=string[j+1];
                    integer[j]=integer[j+1];
                    string[j+1]=null;
                    integer[j+1]=null;
                }
            }
        }
    }
    void recorrerIzq() {
        for (int i = 1; i < integer.length; i++) {
            for (int j = integer.length - 1; j >= i; j--) {
                if (string[j] == null && integer[j] == null) {
                    string[j] = string[j - 1];
                    integer[j] = integer[j - 1];
                    string[j - 1] = null;
                    integer[j - 1] = null;
                }
            }
        }
    }
    void getValor(int indice){
        System.out.println("llave: "+integer[indice]+", nombre: "+string[indice]);
    }
    void setValor(Integer indice, String valor) {
        string[indice]=valor;
    }
    
    void buscarNombre(String nombre){
        int contador=0;
        
        for(String i:string){
            if (i!=null) { 
                if(!(i.contains(nombre))){
                    contador++;
                
                }else{
                    
                    System.out.println("se encontro el elemento en indice: "+ integer[contador]+" , y nombre: "+string[contador]);
                    
                }
            }
        }
    }
}